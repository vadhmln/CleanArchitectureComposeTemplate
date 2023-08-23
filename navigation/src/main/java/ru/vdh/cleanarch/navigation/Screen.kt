package ru.vdh.cleanarch.navigation

sealed class Screen(val route:String){
    data object NewFeatureScreen: Screen("NewFeatureScreen")
    data object SecondFeatureScreen: Screen("SecondFeatureScreen?info={info}")
    data object SecondFeatureNavigationRoute: Screen("SecondFeatureNavigation")
}
