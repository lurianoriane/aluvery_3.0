package br.com.alura.aluvery.ui.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.alura.aluvery.ui.theme.AluveryTheme

class ProductFormActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AluveryTheme() {
                Surface() {
                    ProductFormScreen()
                }
            }
        }
    }
}

@Composable
fun ProductFormScreen() {
    Column(
        Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(text = "Criando o produto")
        var url by remember {
            mutableStateOf("")
        }
        TextField(
            value = url,
            onValueChange = { url = it },
            label = { Text(text = "Url da imagem") }
        )

        var name by remember { mutableStateOf("") }
        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text(text = "Nome") }
        )

        var price by remember { mutableStateOf("") }
        TextField(
            value = price,
            onValueChange = { price = it },
            label = { Text(text = "Preço") }
        )

        var description by remember { mutableStateOf("") }
        TextField(
            value = description,
            onValueChange = { description = it },
            label = { Text(text = "Descrição") }
        )

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Salvar")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ProductFormScreenPreview() {
    AluveryTheme() {
        Surface() {
            ProductFormScreen()
        }
    }
}
