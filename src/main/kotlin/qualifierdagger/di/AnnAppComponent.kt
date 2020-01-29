package qualifierdagger.di

import dagger.Component
import qualifierdagger.impl.AnnCalculator

@Component(modules = [AnnAppModule::class])
interface AnnAppComponent {

    fun calculator(): AnnCalculator
}