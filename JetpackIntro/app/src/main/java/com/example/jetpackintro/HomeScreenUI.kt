package com.example.jetpackintro

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeUI() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Row(
                modifier = Modifier
                    .background(Color.Yellow)
                    .fillMaxWidth()
                    .height(56.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Buttons(icon = R.drawable.baseline_menu_24)
                Text(
                    text = "Amazon",
                    style = TextStyle(color = Color.Black, fontSize = 20.sp),
                    fontWeight = FontWeight.W700, modifier = Modifier.padding(start = 8.dp)
                )
                Buttons(icon = R.drawable.baseline_search_24)
            }

            LazyVerticalGrid(columns = GridCells.Fixed(2)) {
                items(Data.dataList) {
                    ShowDresses(data = it)
                }
            }


        }
    }
}

@Composable
fun ShowDresses(data: Data.Demo) {

    Card(
        shape = RoundedCornerShape(5.dp),
        modifier = Modifier.width(175.dp)
            .height(300.dp)
            .padding(vertical = 5.dp, horizontal = 5.dp)
    ) {

        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 15.dp, horizontal = 5.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = data.img),
                    contentDescription = "",
                    modifier = Modifier
                        .size(120.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )

                Text(
                    text = data.price,
                    style = TextStyle(color = Color.White, fontSize = 15.sp),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(top = 15.dp)
                )

                Text(
                    text = data.name,
                    style = TextStyle(color = Color.White, fontSize = 15.sp),
                    textAlign = TextAlign.Center
                )

                Text(
                    text = data.description,
                    style = TextStyle(color = Color.White, fontSize = 15.sp),
                    textAlign = TextAlign.Center
                )

                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(91.dp)
                        .padding(top = 20.dp),
                    shape = RoundedCornerShape(18.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Green)
                ) {
                    Text(
                        text = "Add to Cart",
                        style = TextStyle(color = Color.Black),
                        fontSize = 14.sp,
                        textAlign = TextAlign.Center
                    )
                }

            }

        }

    }

}


@Composable
fun Buttons(
    @DrawableRes icon: Int,
    tint: Color = Color.Unspecified,
) {

    IconButton(onClick = { /*TODO*/ }) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = null,
            tint = tint
        )

    }

}

@Preview(showBackground = true)
@Composable
fun HomeUIPreview() {
    HomeUI()

}