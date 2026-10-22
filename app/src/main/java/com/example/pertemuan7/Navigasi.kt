package com.example.pertemuan7

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pertemuan7.view.TampilData
import com.example.pertemuan7.view.FormIsian


enum class Navigasi {
    FormulirSaya,
    Detail
}
@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = Navigasi.FormulirSaya.name
    ) {
        composable(
            route = Navigasi.FormulirSaya.name
        ) {
            FormIsian(
                // PERBAIKAN: Mengubah huruf depan menjadi 'o' kecil (onSubmitBtnClick)
                onSubmitBtnClick = {
                    navController.navigate(Navigasi.Detail.name)
                }
            )
        }



private fun cancelAndBackToFormulir(
    navController: NavHostController
) {
    navController.popBackStack(
        Navigasi.FormulirSaya.name,
        inclusive = false
    )
}

