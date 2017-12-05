package day2

import com.winterbe.expekt.should
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.it

class CorruptionChecksumTest : Spek ({
    it("should calculate the correct checksum", {
        calculateChecksum(listOf("5\t1\t9\t5", "7\t5\t3", "2\t4\t6\t8")).should.equal(18)
    })

    it("should calculate the correct even checksum", {
       calculateEvenChecksum(listOf("5\t9\t2\t8", "9\t4\t7\t3", "3\t8\t6\t5")).should.equal(9)
    })
})