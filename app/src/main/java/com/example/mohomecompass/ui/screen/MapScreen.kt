package com.example.mohomecompass.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.mohomecompass.data.ResourceLocation
import com.google.android.gms.maps.GoogleMap
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.rememberCameraPositionState
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.Marker
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MapScreen(navController: NavController) {
    val cameraPositionState = rememberCameraPositionState {
        position = com.google.android.gms.maps.model.CameraPosition.fromLatLngZoom(
            LatLng(42.25536340006903, -72.57417340665097), 18f
        )
    }

    val resourceLocations = listOf(
        ResourceLocation("Gym", LatLng(42.25899024167556, -72.57077174509314)),
        ResourceLocation("Dining Hall", LatLng(42.25509306248877, -72.57396918846362)),
        ResourceLocation("Williston Library", LatLng(42.257418857343175, -72.57529217126427)),
        ResourceLocation("Registrar's Office", LatLng(42.256650647830064, -72.57569611708819)),
        ResourceLocation("Career Development Center", LatLng(42.25871269961872, -72.5730286649091)),
        ResourceLocation("Pratt Library", LatLng(42.253725458017755, -72.57415754906123)),
        ResourceLocation("Counseling Service", LatLng(42.259079185785374, -72.57281870556443)),
        ResourceLocation("Health Services Office", LatLng(42.259079185785374, -72.57281870556443)),
        ResourceLocation("Financial Services Office", LatLng(42.25534214697941, -72.57613072477137))
    )

    Column(modifier = Modifier.fillMaxSize()) {
        TopAppBar(
            title = { Text("Campus Map", fontWeight = FontWeight.Bold) },
            navigationIcon = {
                IconButton(onClick = { navController.popBackStack() }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back"
                    )
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color(0xFFFFB6C1),
                titleContentColor = Color.White,
                navigationIconContentColor = Color.White
            )
        )

        GoogleMap(
            cameraPositionState = cameraPositionState,
            modifier = Modifier.fillMaxSize()
        ) {
            resourceLocations.forEach { location ->
                Marker(
                    state = com.google.maps.android.compose.rememberMarkerState(
                        position = location.position
                    ),
                    title = location.name
                )
            }
        }
    }
}