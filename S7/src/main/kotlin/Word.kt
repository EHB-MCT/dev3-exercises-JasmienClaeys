open class Word (
    open val original: String,
    open val translated: String,
    val language: String,
    var difficulty: Int = 1,
    ){
    var difficultyLevel = difficulty
        set(value) {
            if (value > 1) {
                field = 1
            } else {
                field = value
            }
        }
}