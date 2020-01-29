package qualifierdagger

import qualifierdagger.di.DaggerAnnAppComponent
import qualifierdagger.di.DaggerAppComponent

fun main() {
    DaggerAppComponent.create()
        .calculator()
        .execute(10, 3)

    DaggerAnnAppComponent.create()
        .calculator()
        .execute(7, 5)
}