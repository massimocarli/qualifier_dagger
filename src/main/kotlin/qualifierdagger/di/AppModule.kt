package qualifierdagger.di

import dagger.Module
import dagger.Provides
import qualifierdagger.Operation
import qualifierdagger.impl.Addition
import qualifierdagger.impl.Subtraction
import javax.inject.Named


@Module
class AppModule {

    @Named("addition")
    @Provides
    fun provideAddition(): Operation<Int> = Addition()

    @Named("subtraction")
    @Provides
    fun provideSubtraction(): Operation<Int> = Subtraction()
}