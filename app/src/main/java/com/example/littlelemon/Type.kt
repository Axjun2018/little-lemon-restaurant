package com.example.littlelemon

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

object LittleLemonTypography{
    val h1 = TextStyle(
        fontSize = 26.sp,
        fontWeight = FontWeight.Bold,
        color = LittleLemonColor.charcoal
    )
    val h2 = TextStyle(
        color = LittleLemonColor.charcoal,
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold
    )
    val body1 = TextStyle(
        color = LittleLemonColor.green
    )
    val body2 = TextStyle(
        fontWeight = FontWeight.Bold,
        color = LittleLemonColor.green
    )
    val button = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold
    )
}