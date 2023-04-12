package ru.vdh.myapp.newfeature.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import ru.vdh.cleanarch.navigation.Screen
import ru.vdh.myapp.newfeature.ui.view.NewFeatureScreen

const val newFeatureRoute = "new_feature_route"

fun NavGraphBuilder.newFeatureScreen(navController: NavController) {
    composable(route = Screen.NewFeatureScreen.route) {
        NewFeatureScreen(navController)
    }
}