package qualifierdagger.impl

import qualifierdagger.Operation
import qualifierdagger.di.Add
import qualifierdagger.di.Sub
import javax.inject.Inject

/**
 * Simple Calculator
 */
class AnnCalculator @Inject constructor() {

    @Inject
    @field:Add
    lateinit var addition: Operation<Int>


    @Inject
    @field:Sub
    lateinit var subtraction: Operation<Int>

    fun execute(a: Int, b: Int) {
        println("$a + $b = ${addition.calculate(a, b)}")
        println("$a - $b = ${subtraction.calculate(a, b)}")
    }
}