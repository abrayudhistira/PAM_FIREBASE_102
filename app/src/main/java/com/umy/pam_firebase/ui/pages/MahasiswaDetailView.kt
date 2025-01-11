package com.umy.pam_firebase.ui.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.umy.pam_firebase.ui.viewmodel.HomeViewModel
import com.umy.pam_firebase.ui.viewmodel.PenyediaViewModel

@Composable
fun MahasiswaDetailView(nim: String, viewModel: HomeViewModel = viewModel(factory = PenyediaViewModel.Factory), navController: NavController) {
    val mahasiswa by viewModel.getMhsDetail(nim).collectAsState(initial = null)

    mahasiswa?.let {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize()
        ) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                shape = MaterialTheme.shapes.medium.copy(CornerSize(16.dp))
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "NIM: ${it.nim}",
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "Nama: ${it.nama}", fontSize = 18.sp)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "Alamat: ${it.alamat}", fontSize = 18.sp)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Gender: ${it.gender}",
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "Kelas: ${it.kelas}", fontSize = 18.sp)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "Angkatan: ${it.angkatan}", fontSize = 18.sp)
                    Spacer(modifier = Modifier.height(8.dp))
                    // Add other fields as necessary

                    Spacer(modifier = Modifier.height(16.dp))

                    // Back button
                    Button(onClick = { navController.popBackStack() }) {
                        Text("Back")
                    }
                }
            }
        }
    } ?: run {
        Text(text = "Loading or Data not found...")
    }
}