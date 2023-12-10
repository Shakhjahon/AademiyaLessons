package com.example.aademiyalessons.Presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.aademiyalessons.data.carFakeDates

@Composable
fun CarMain() {
    LazyVerticalGrid(
        modifier = Modifier.fillMaxSize(), columns = GridCells.Fixed(2)
    ) {
        items(carFakeDates()) { item ->
            MainCar(carModel = item)
        }
    }
}