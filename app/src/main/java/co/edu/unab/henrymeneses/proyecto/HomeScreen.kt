package co.edu.unab.henrymeneses.proyecto

import android.media.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun HomeScreen() {

    val newObject: Object = Object(
        name = "Celular",
        description = "Iphone 16 de color negro, con un case verde",
        owner = "Miguel Serrano",
        image = 0
    )

    val listObject: List<Object> = listOf(
        newObject,
        Object(
            name = "Termo",
            description = "Termo azul marca adidas, con 3 lineas blancas en la mitad",
            owner = "Miguel Serrano",
            image = 0

        ),
        Object(
            name = "Llaves",
            description = "Llavero de Spiderman con 3 llaves en el ",
            owner = "Miguel Serrano",
            image = 0

        ),
        Object(
            name = "Calculadora ",
            description = "Calculadora blanca marca Casio",
            owner = "Miguel Serrano",
            image = 0

        )

    )

    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(6.dp),
        modifier = Modifier.padding(12.dp)
    ) {
        items(listObject.size) { it ->
            ObjectItem(myObject = listObject.get(it))


        }

    }