import java.io.File

class InputReader {
    companion object {
        fun getInput(fileName: String): List<String> {
            val file = File(InputReader::class.java.classLoader.getResource(fileName).file)
            return file.readLines()
        }
    }
}