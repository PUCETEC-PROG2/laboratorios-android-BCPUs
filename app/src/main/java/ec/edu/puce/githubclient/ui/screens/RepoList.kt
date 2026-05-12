package ec.edu.puce.githubclient.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ec.edu.puce.githubclient.ui.components.RepoItem

@Composable
fun RepoList(){
    Column(
        modifier = Modifier
            .padding(horizontal = 4.dp, vertical = 48.dp)
    ){
        RepoItem(
            "Repositorio BCPUs",
            "Proyecto android",
            "https://avatars.githubusercontent.com/u/168299135?s=48&v=4",
            "Kotlin"
        )
        RepoItem(
            "Repositorio BCPUs",
            "Proyecto Phyton",
            "https://avatars.githubusercontent.com/u/168299135?s=48&v=4",
            "Phyton"
        )
        RepoItem(
            "Repositorio BCPUs",
            "Proyecto IOS",
            "https://avatars.githubusercontent.com/u/168299135?s=48&v=4",
            "swift"
        )
    }
}
@Preview (showBackground = true)
@Composable
fun RepoListPreview(){
    RepoList()
}
