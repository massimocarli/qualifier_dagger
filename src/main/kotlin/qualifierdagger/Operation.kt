package qualifierdagger

/**
 * Abstraction of a generic operation between 2 object of type T
 */
interface Operation<T> {

    /**
     * Execute the calculation from a and b
     */
    fun calculate(a: T, b: T): T
}