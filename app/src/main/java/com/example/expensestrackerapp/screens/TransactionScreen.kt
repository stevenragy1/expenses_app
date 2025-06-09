package com.example.expensestrackerapp.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.expensestrackerapp.R
import com.example.expensestrackerapp.screens.ui.theme.DarkBlue
import com.example.expensestrackerapp.screens.ui.theme.ExpensesTrackerAppTheme
import com.example.expensestrackerapp.screens.ui.theme.LightBlue
import com.example.expensestrackerapp.screens.ui.theme.LightGray


import com.example.expensestrackerapp.screens.ui.theme.PublicSans


class TransactionScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExpensesTrackerAppTheme {
                Transactions()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Transactions() {
    Scaffold(
        containerColor = DarkBlue,
        contentColor = Color.White,
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = DarkBlue, // Background color
                    titleContentColor = Color.White, // Title text color
                    actionIconContentColor = Color.White // Action icons color
                ),
                title = {
                    Box(
                        modifier = Modifier,

                        ) {
                        Text(
                            text = "All Transactions",
                            fontFamily = PublicSans,
                            fontWeight = FontWeight.Bold,
                        )

                    }
                },

                )
        },

        content = { innerPadding ->

            Box(
                modifier = Modifier
                    .padding(innerPadding)
            ) {

                TransactionsBody()
            }
        }
    )
}

@Composable
fun TransactionsBody() {

        Row(
            modifier = Modifier
            .fillMaxWidth(),
        ) {
            //category btn
            Button(
                onClick = { /* Handle click */ },
                modifier = Modifier.padding(16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = LightGray
                ),
                shape = androidx.compose.foundation.shape.RoundedCornerShape(20.dp),
                contentPadding = PaddingValues(
                    horizontal = 15.dp,
                    vertical = 5.dp
                )
            ) {
                Text(
                    text = "Category",
                    fontFamily = PublicSans,
                    fontWeight = FontWeight.Medium,

                    )
                Spacer(modifier = Modifier.width(8.dp))
                Icon(
                    painter = painterResource(id = R.drawable.down_arrow_ic),
                    contentDescription = "Dropdown",
                )
            }

            //date btn
            Button(
                onClick = { /* Handle click */ },
                modifier = Modifier.padding(16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = LightGray
                ),
                shape = androidx.compose.foundation.shape.RoundedCornerShape(20.dp),
                contentPadding = PaddingValues(
                    horizontal = 15.dp,
                    vertical = 5.dp
                )
            ) {
                Text(
                    text = "Date",
                    fontFamily = PublicSans,
                    fontWeight = FontWeight.Medium,

                    )
                Spacer(modifier = Modifier.width(8.dp))
                Icon(
                    painter = painterResource(id = R.drawable.down_arrow_ic),
                    contentDescription = "Dropdown",
                )
            }
           // Spacer(modifier = Modifier.width(1.dp))

            //type btn
            Button(
                onClick = { /* Handle click */ },
                modifier = Modifier.padding(16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = LightGray
                ),
                shape = androidx.compose.foundation.shape.RoundedCornerShape(20.dp),
                contentPadding = PaddingValues(
                    horizontal = 15.dp,
                    vertical = 5.dp
                )
            ) {
                Text(
                    text = "Type",
                    fontFamily = PublicSans,
                    fontWeight = FontWeight.Medium,

                    )
                Spacer(modifier = Modifier.width(8.dp))
                Icon(
                    painter = painterResource(id = R.drawable.down_arrow_ic),
                    contentDescription = "Dropdown",
                )
            }

        }
    }


@Preview(showBackground = true)
@Composable
fun Transactions_prev() {
    ExpensesTrackerAppTheme {
        Transactions()
    }
}