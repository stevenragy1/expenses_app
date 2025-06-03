package com.example.expensestrackerapp.screens

import com.example.expensestrackerapp.R
import android.R.attr.icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.expensestrackerapp.screens.ui.theme.DarkBlue
import com.example.expensestrackerapp.screens.ui.theme.LightBlue
import com.example.expensestrackerapp.screens.ui.theme.SecondaryText
import com.example.expensestrackerapp.ui.theme.ExpensesTrackerAppTheme
import com.example.expensestrackerapp.ui.theme.Purple40

class HomeScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExpensesTrackerAppTheme {

                HomeScreenPage()

            }
        }
    }
}
val iconSizeSmall = 16.dp
val iconSizeNormal = 24.dp
val iconSizeLarge = 32.dp
val iconSizeXLarge = 48.dp
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreenPage() {
    Scaffold(
        containerColor = Color(0xFF101323),
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
                            text = "Expenses"

                        )

                    }
                },
                actions = {
                    // Add button on the right
                    IconButton(onClick = { /* Handle add action */ }) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "Add"
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

                HomeBody()
            }
        }
    )
}

@Composable
fun HomeBody() {
    Spacer(modifier = Modifier.height(16.dp))
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
    ) {
        Text(
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Start,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            text = "This Month",
            color = Color.White
        )
        TotalSpentCardView("Total Spent", 10)

        Text(
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Start,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            text = "Transaction",
            color = Color.White
        )
        TransactionCardView()

    }
}

@Composable
fun TotalSpentCardView(
    title: String,
    amount: Int,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = LightBlue
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
//            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = title,
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                color = Color.White,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "$$amount",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
    }
}

@Composable
fun TransactionCardView(/*Category : String,Note: String,Price: Float*/) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = DarkBlue
        )
    ) {
        Row(
            modifier = Modifier.padding(8.dp)
                .fillMaxWidth(), // Add padding inside card
            verticalAlignment = Alignment.CenterVertically,
            //horizontalArrangement = Arrangement.End

        ) {
            Box(
                modifier = Modifier
                    .size(55.dp)
                    .background(
                        color = LightBlue, // Dark slate color
                        shape = RoundedCornerShape(9.dp)
                    )
                    .clickable { /* Handle click */ },
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.shoping_ic),
                    contentDescription = "Shopping Cart",
                    tint = Color.White,
                    modifier = Modifier.size(iconSizeNormal)
                )
            }

            Column(
                modifier = Modifier.padding(10.dp)
            ) {
                //the text the user enters
                Text(
                    text = "Fresh Food Market",
                    color = Color.White,
                    textAlign = TextAlign.Start,
                    fontWeight = FontWeight.Bold,

                )

                //category
                Text(
                    text = "Groceries",
                    color = SecondaryText,
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.End
            ) {
                Text(
                    text = "-$75.50",
                    fontSize = 20.sp,
                )
            }
        }

    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    HomeScreenPage()
}