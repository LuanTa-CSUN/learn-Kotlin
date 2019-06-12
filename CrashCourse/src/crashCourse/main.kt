/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

package crashCourse


fun main() {
    val csun: String = "CalState Northridge"
    val period: String = "."
    val space: String = " "
    val test = 2


    /*
    val OUTPUT: String = if (true){
        CSUN + PERIOD + SPACE + "Hello, world!!!"
    }
    else ("Welcome to Kotlin!")
    */

    fun obtainOutput(testNum: Int): String =
        when{
            testNum < test -> "COOL!"
            testNum > test -> csun + period + space + "Hello, world!!!"
            else -> "Welcome to Kotlin!"
        }

    println(obtainOutput(100))
    /*
    val OUTPUT: String = when{
        TEST < 5 -> "COOL!"
        TEST >= 5 -> CSUN + PERIOD + SPACE + "Hello, world!!!"
        else -> "Welcome to Kotlin!"
    }
    */
}