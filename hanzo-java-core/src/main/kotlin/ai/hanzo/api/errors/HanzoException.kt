package ai.hanzo.api.errors

open class HanzoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
