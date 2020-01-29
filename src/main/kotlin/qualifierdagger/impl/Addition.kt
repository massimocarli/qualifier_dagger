package qualifierdagger.impl

import qualifierdagger.Operation

/**
 * Add between 2 Int
 */
class Addition : Operation<Int> {
    override fun calculate(a: Int, b: Int): Int = a + b
}