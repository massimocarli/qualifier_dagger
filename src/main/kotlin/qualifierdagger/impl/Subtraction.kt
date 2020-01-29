package qualifierdagger.impl

import qualifierdagger.Operation

/**
 * Sub between 2 Int
 */
class Subtraction : Operation<Int> {
    override fun calculate(a: Int, b: Int): Int = a - b
}