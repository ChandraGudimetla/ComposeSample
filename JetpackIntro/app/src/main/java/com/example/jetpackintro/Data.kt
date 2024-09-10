package com.example.jetpackintro

import androidx.annotation.DrawableRes

object Data {

    class Demo(
        @DrawableRes var img: Int,
        var name: String,
        var description: String,
        var price: String
    )
        var dataList = listOf(Demo(R.drawable.model2, "Shirt", "Blue Shirt", "$100"),
            Demo(R.drawable.model1, "Shirt", "Blue Shirt", "$100"),
            Demo(R.drawable.model2, "Jacket", "Brown", "$200"),
            Demo(R.drawable.model1, "Shirt", "Blue Shirt", "$100"),
            Demo(R.drawable.model2, "Jacket", "Brown", "$200"),
            Demo(R.drawable.model1, "Shirt", "Blue Shirt", "$100"),
            Demo(R.drawable.model2, "Jacket", "Brown", "$200"),
            Demo(R.drawable.model1, "Shirt", "Blue Shirt", "$100"),
            Demo(R.drawable.model2, "Jacket", "Brown", "$200"),
            Demo(R.drawable.model1, "Shirt", "Blue Shirt", "$100"),
            Demo(R.drawable.model2, "Jacket", "Brown", "$200"),
            Demo(R.drawable.model1, "Shirt", "Blue Shirt", "$100"),
            Demo(R.drawable.model2, "Jacket", "Brown", "$200"),
            Demo(R.drawable.model1, "Shirt", "Blue Shirt", "$100"),
            Demo(R.drawable.model2, "Jacket", "Brown", "$200"),
            Demo(R.drawable.model1, "Shirt", "Blue Shirt", "$100"))
}