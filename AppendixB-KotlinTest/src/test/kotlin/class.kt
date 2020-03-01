/* Appendix B -- KotlinTest */
/*https://github.com/kotlintest/kotlintest/ is full breadth of kotlintesting */
/* Here is a kotlin test example of the JUnit test from Appendix B Junit Test project */
/* Take a look at the build.gradle dependencies, and also click on File -> Project Structure -> Dependencies -> click on `+` -> then add the test or main modules depending on where you code is if you need this.*/

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row
import io.kotlintest.data.forall

//above imports require this in build.gradle under dependencies
//testImplementation "org.junit.jupiter:junit-jupiter-api:5.3.1"
//testRuntimeOnly "org.junit.jupiter:junit-jupiter-engine:5.3.1"
//testCompile 'io.kotlintest:kotlintest-runner-junit5:3.1.9'

class Totaller (var total: Int = 0) {
    fun add(num: Int): Int {
        total += num
        return total
    }
}

class AnotherTotallerTest : StringSpec ({
    "Should be able to add 2 and 4 - and it mustn't go wrong" {
        val totaller = Totaller()

        totaller.add(3) shouldBe 3
        totaller.add(4) shouldBe 7
        totaller.total shouldBe 7
    }
    "Should be able to add lots of different numbers" {
        forall(
            row(1,2,3),
            row(19,47, 66),
            row(11,21,32)
        ) { x,y,expectedTotal ->
            val totaller = Totaller(x)
            totaller.add(y) shouldBe expectedTotal
        }
    }
})