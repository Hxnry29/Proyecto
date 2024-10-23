package co.edu.unab.henrymeneses.proyecto

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun ObjetoPerdido() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "Objeto Perdido",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Nombre objeto",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text(text = "Nombre") },
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Descripción",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text(text = "Descripcion") },
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Propietario",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text(text = "Propietario") },
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Imagen(Opcional)",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text(text = "Imagen") },
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(24.dp))
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.fillMaxWidth()
                )
                {
                    Text(text = "Publicar")
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.fillMaxWidth()
                )
                {
                    Text(text = "Encontrado")
                }

            }

        }
    }
}