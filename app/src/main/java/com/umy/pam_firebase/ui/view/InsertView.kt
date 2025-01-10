package com.umy.pam_firebase.ui.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.umy.pam_firebase.ui.viewmodel.InsertViewModel
import com.umy.pam_firebase.ui.viewmodel.PenyediaViewModel

// fungsi insert view
@Composable
fun InsertMhsView(
    onBack: () -> Unit,
    onNavigate: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: InsertViewModel = viewModel(factory = PenyediaViewModel.Factory)
) {
    val uiState = viewModel.uiState // State utama untuk loading, success, error
    val uiEvent = viewModel.uiEvent // State untuk form dan validasi
}