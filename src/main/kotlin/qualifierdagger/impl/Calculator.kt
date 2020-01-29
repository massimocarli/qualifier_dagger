package qualifierdagger.impl

import qualifierdagger.Operation
import javax.inject.Inject
import javax.inject.Named

/**
 * Simple Calculator
 */
class Calculator @Inject constructor() {

    @Inject
    @field:Named("addition")
    lateinit var addition: Operation<Int>


    @Inject
    @field:Named("subtraction")
    lateinit var subtraction: Operation<Int>

    fun execute(a: Int, b: Int) {
        println("$a + $b = ${addition.calculate(a, b)}")
        println("$a - $b = ${subtraction.calculate(a, b)}")
    }
}