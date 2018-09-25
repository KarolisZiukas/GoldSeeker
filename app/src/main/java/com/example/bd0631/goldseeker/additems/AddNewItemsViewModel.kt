package com.example.bd0631.goldseeker.additems

import android.arch.lifecycle.ViewModel
import com.example.bd0631.goldseeker.database.PickUpLacationsRepo
import javax.inject.Inject

class AddNewItemsViewModel @Inject constructor(val pickUpLocationsRepo: PickUpLacationsRepo): ViewModel() {

 lateinit var addNewItemsNavigator: AddNewItemsNavigator

  fun setNavigator(addNewItemsNavigator: AddNewItemsNavigator) {
    this.addNewItemsNavigator = addNewItemsNavigator
  }


}