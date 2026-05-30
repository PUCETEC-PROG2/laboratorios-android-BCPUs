package ec.edu.puce.githubclient.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ec.edu.puce.githubclient.models.RepositoryPayload
import ec.edu.puce.githubclient.services.RetrofitClient
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class RepoFormViewModel  : ViewModel(){
    private val _isLoading = MutableStateFlow(false)
    val isLoading = _isLoading.asStateFlow()

    private val _erroMsg = MutableStateFlow<String?>(value=null)
    val erroMsg =_erroMsg.asStateFlow()

    private val _isSuccess = MutableStateFlow(value=false)
    val isSuccess = _isSuccess.asStateFlow()

    fun createRepository(name: String, description: String){
        viewModelScope.launch {
            _isLoading.value=true
            _erroMsg.value=null
            try {
                val  repositoryBody= RepositoryPayload(name, description)
                RetrofitClient.apiService.createRepository(repositoryBody)
                _isSuccess.value=true
            }catch (e: Exception){
                _erroMsg.value="Error al crear repositorio: ${e.localizedMessage}"
            }finally {
                _isLoading.value=false
            }
        }

    }
    fun resetSuccess(){
        _isSuccess.value=false
    }

    fun resetError(){
        _erroMsg.value=null
    }
}