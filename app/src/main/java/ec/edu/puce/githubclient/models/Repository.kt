package ec.edu.puce.githubclient.models

import org.intellij.lang.annotations.Language

data class Repository(
    val id: String,
    val name: String,
    val owner: GithubUser,
    val description: String?,
    val language: String?
)