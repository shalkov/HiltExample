package ru.shalkoff.hiltexample.animals

import javax.inject.Inject

class Dog @Inject constructor() : Animal {

    override val name: String = "Собакен"
}