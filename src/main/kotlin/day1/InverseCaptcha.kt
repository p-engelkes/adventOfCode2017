package day1

fun calculateCaptcha(puzzleString: String): Int {
    var captcha = 0
    val puzzleNumbers = mutableListOf<Int>()
    puzzleString.forEach { puzzleNumbers.add( it.toString().toInt()) }

    for (i in 0 until puzzleNumbers.size) {
        if (i+1 == puzzleNumbers.size) {
            if (puzzleNumbers[i] == puzzleNumbers[0]) {
                captcha += puzzleNumbers[i]
            }
        } else {
            if (puzzleNumbers[i] == puzzleNumbers[i+1]) {
                captcha += puzzleNumbers[i]
            }
        }
    }

    return captcha
}

fun calculateCircularCaptcha(puzzleString: String): Int {
    val puzzleNumbers = mutableListOf<Int>()
    puzzleString.forEach { puzzleNumbers.add(it.toString().toInt()) }

    val step = puzzleNumbers.size / 2
    val captcha = (0 until puzzleNumbers.size)
            .filter { puzzleNumbers[it] == puzzleNumbers[(it + step) % puzzleNumbers.size] }
            .sumBy { puzzleNumbers[it] }

    return captcha
}

fun main(args: Array<String>) {
    val captcha = calculateCircularCaptcha(InputReader.getInput("day1puzzle2.txt")[0])
    println(captcha)
}
