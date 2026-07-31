package ai.hanzo.api.errors

class HanzoIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : HanzoException(message, cause)
