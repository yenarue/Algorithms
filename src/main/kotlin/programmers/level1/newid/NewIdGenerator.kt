package programmers.level1.newid

// https://programmers.co.kr/learn/courses/30/lessons/72410
class NewIdGenerator {
    fun generate(newId: String) = newId.lowercase()
        .replace(Regex("[^a-z0-9-_.]"), "")
        .replace(Regex("[.]{2,}"), ".")
        .trim('.')
        .let { it.ifEmpty { "a" } }
        .let { if (it.length > 15) it.slice(IntRange(0, 14)).trim('.') else it }
        .let {
            if (it.length <= 2)
                StringBuilder(it).run {
                    while (length < 3) append(it.last())
                    toString()
                }
            else it
        }
}