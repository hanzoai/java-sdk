package ai.hanzo.api.errors

class HanzoInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : HanzoException(message, cause)
