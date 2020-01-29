package qualifierdagger.di

import dagger.Component
import qualifierdagger.impl.Calculator

@Component(modules = [AppModule::class])
interface AppComponent {

    fun calculator(): Calculator
}