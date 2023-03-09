package ru.shalkoff.hiltexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import ru.shalkoff.hiltexample.animals.Animal
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(
   animalSet: Set<@JvmSuppressWildcards Animal>
) : ViewModel() {

    var animalsLiveData = MutableLiveData<List<Animal>>()

    init {
        animalsLiveData.value = animalSet.toList()
    }
}