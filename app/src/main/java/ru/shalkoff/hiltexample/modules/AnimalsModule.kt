package ru.shalkoff.hiltexample.modules

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet
import dagger.multibindings.Multibinds
import ru.shalkoff.hiltexample.animals.Animal
import ru.shalkoff.hiltexample.animals.Cat
import ru.shalkoff.hiltexample.animals.Dog

@InstallIn(SingletonComponent::class)
@Module
interface AnimalsModule {

    @Multibinds
    fun bindAnimals(): Set<Animal>

    @Binds
    @IntoSet
    fun bindCat(cat: Cat): Animal

    @Binds
    @IntoSet
    fun bindDog(dog: Dog): Animal
}