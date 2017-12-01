import com.winterbe.expekt.should
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it

class InputReaderSpek : Spek({
    describe("an InputReader") {
        it("returns all lines as list from the given file") {
            val expected = listOf("1, 2, 3, 4, 5, 6, 7, 8, 9, 10")
            InputReader.getInput("InputReaderSpek.txt").should.equal(expected)
        }
    }
})