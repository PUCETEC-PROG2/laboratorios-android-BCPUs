package ec.edu.puce.githubclient.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.contracts.contract

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RepoForm(
    onBackClick:()-> Unit={}
) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Nuevo Repositorio") },
                navigationIcon = {
                    IconButton(onClick = { onBackClick}) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Regresar"
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
            )
        }
    ) { paddingValues ->

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentAlignment = Alignment.Center
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp),

                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                OutlinedTextField(
                    value = "",
                    onValueChange = { },
                    label = { Text("Nombre del Repositorio") },
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true
                )

                OutlinedTextField(
                    value = "",
                    onValueChange = { },
                    label = { Text("Descripción del repositorio") },
                    modifier = Modifier.fillMaxWidth(),
                    minLines = 4
                )

                Button(
                    onClick = { },
                    enabled = true,
                    modifier = Modifier.fillMaxWidth()
                ) {

                    Icon(
                        imageVector = Icons.Default.Send,
                        contentDescription = "Guardar"
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    Text("Guardar")
                }
            }
        }
    }
}

@Preview
@Composable
fun RepoFormPreview() {
    GithubClientTheme {
        RepoForm()
    }
}