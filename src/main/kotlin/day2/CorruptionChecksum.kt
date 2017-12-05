package day2

fun calculateChecksum(puzzleStrings: List<String>): Int {
    var result = 0

    puzzleStrings.forEach {
        result += calculateRowCheckSum(it)
    }

    return result
}

private fun calculateRowCheckSum(puzzleString: String): Int {
    val puzzleNumbers = puzzleString.split("\t")

    var highest = puzzleNumbers[0].toInt()
    var lowest = puzzleNumbers[0].toInt()

    puzzleNumbers.forEach {
        val number = it.toInt()
        if (highest < number) {
            highest = number
        }

        if (lowest > number) {
            lowest = number
        }
    }

    return highest - lowest
}

fun calculateEvenChecksum(puzzleStrings: List<String>): Int {
    var result = 0

    puzzleStrings.forEach {
        result += calculateEvenRowChecksum(it)
    }

    return result
}

private fun calculateEvenRowChecksum(puzzleString: String): Int {
    val puzzleNumbers = puzzleString.split("\t")

    for (i in 0 until puzzleNumbers.size) {
        val number = puzzleNumbers[i].toInt()
        for (j in 0 until puzzleNumbers.size) {
            if (i != j) {
                val secondNumber = puzzleNumbers[j].toInt()
                if (number % secondNumber == 0) {
                    return number / secondNumber
                }
            }
        }
    }

    return 0
}

fun main(args: Array<String>) {
    println(calculateEvenChecksum(InputReader.getInput("day2puzzle2.txt")))
}