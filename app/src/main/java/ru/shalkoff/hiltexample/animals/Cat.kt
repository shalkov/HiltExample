package ru.shalkoff.hiltexample.animals

import javax.inject.Inject

class Cat @Inject constructor(): Animal {

    override val name: String = "Кисулькен"
}