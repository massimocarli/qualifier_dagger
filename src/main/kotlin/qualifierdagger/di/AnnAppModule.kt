package qualifierdagger.di

import dagger.Module
import dagger.Provides
import qualifierdagger.Operation
import qualifierdagger.impl.Addition
import qualifierdagger.impl.Subtraction

@Module
class AnnAppModule {

    @Add
    @Provides
    fun provideAddition(): Operation<Int> = Addition()

    @Sub
    @Provides
    fun provideSubtraction(): Operation<Int> = Subtraction()
}