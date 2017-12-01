package day1

import com.winterbe.expekt.should
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.it

class InverseCaptchaSpek : Spek ({
    it("calculates the correct captcha") {
        calculateCaptcha("1122").should.equal(3)
        calculateCaptcha("1234").should.equal(0)
        calculateCaptcha("91212129").should.equal(9)
    }

    it("calculates the correct circular captcha") {
        calculateCircularCaptcha("1212").should.equal(6)
        calculateCircularCaptcha("1221").should.equal(0)
        calculateCircularCaptcha("123425").should.equal(4)
        calculateCircularCaptcha("123123").should.equal(12)
        calculateCircularCaptcha("12131415").should.equal(4)
    }
})