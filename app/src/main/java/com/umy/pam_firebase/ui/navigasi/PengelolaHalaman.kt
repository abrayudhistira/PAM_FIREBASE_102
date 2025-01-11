package com.umy.pam_firebase.ui.navigasi

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.umy.pam_firebase.ui.pages.HomeView
import com.umy.pam_firebase.ui.pages.InsertMhsView
import com.umy.pam_firebase.ui.pages.MahasiswaDetailView

@Composable
fun PengelolaHalaman(
    modifier: Modifier,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = Modifier
    ) {
        composable(DestinasiHome.route) {
            HomeView(
                navigateToItemEntry = {
                    navController.navigate(DestinasiInsert.route)
                },
                onDetailClick = { nim ->
                    navController.navigate(DestinasiDetail.createRoute(nim)) // navigate to detail view
                }
            )
        }
        composable(DestinasiInsert.route) {
            InsertMhsView(
                onBack = { navController.popBackStack() },
                onNavigate = {
                    navController.navigate(DestinasiHome.route)
                }
            )
        }
        composable(DestinasiDetail.route) { backStackEntry ->
            val nim = backStackEntry.arguments?.getString("nim") ?: ""
            MahasiswaDetailView(nim = nim, navController = navController)
        }
    }
}