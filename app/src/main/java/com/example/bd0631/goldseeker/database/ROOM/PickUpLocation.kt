package com.example.bd0631.goldseeker.database

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.support.annotation.NonNull

@Entity(tableName = "pickUpLocations")
data class PickUpLocation(
    @PrimaryKey @NonNull val id: Long
    )