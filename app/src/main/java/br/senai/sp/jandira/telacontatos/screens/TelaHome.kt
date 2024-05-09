package br.senai.sp.jandira.telacontatos.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaHome() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Meus Contatos")
                },
                colors = TopAppBarDefaults
                    .topAppBarColors(
                        containerColor = Color(0x91584778),
                        titleContentColor = Color.White
                    )
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /*TODO*/ },
                containerColor = Color(0xF9F9F9F9),
                contentColor = Color.Black,
                shape = CircleShape

            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Botao add"

                )


            }
        },

        content = {
            LazyColumn(
                modifier = Modifier.padding(it)
            ) {
                items(10) {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .padding(horizontal = 16.dp)
                            .padding(vertical = 2.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Card(
                                modifier = Modifier
                                    .width(40.dp)
                                    .height(40.dp),
                                colors = CardDefaults
                                    .cardColors(
                                        containerColor = Color(0x91084778)
                                    ),
                                shape = CircleShape
                            ) {
                                Box(
                                    modifier = Modifier.fillMaxSize(),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = "N",
                                        color = Color.White
                                    )
                                }

                            }
                            Spacer(modifier = Modifier.width(8.dp))
                            Column {
                                Text(text = "Nome do contato")
                                Text(text = "E-mail do contato")
                            }
                        }
                    }

                }

            }

        }
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    TelaHome()
}

