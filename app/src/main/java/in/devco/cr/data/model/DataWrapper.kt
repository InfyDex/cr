package `in`.devco.cr.data.model

data class DataWrapper<T>(
    val response: T? = null,
    val isLoading: Boolean = false,
    val error: Int? = null,
    val inputError: Int? = null,
    val exception: Throwable? = null
)