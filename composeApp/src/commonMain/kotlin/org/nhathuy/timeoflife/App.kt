package org.nhathuy.timeoflife


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    Text(text = "Hồ Nhật Huy", textAlign = TextAlign.Center)
//    Text(
//        "Focused Time",
//        fontWeight = FontWeight.Bold,
//        fontSize = 18.sp,
//        modifier = Modifier.align(Alignment.CenterHorizontally)
//    )
//    Spacer(modifier = Modifier.height(16.dp))
//
//    // Focus time info
//    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
//        listOf(
//            110,
//            115,
//            120,
//            10,
//            15,
//            20,
//            25,
//            30,
//            35,
//            40,
//            45,
//            50,
//            55,
//            60,
//            65,
//            70,
//            75,
//            80,
//            85,
//            90,
//            95,
//            100
//        ).forEach { time ->
//            TimeButton(time = time, isSelected = time == selectedTime,
//                onClick = {
//                    selectedTime = time
//                    if (!isRunning) remainingTime = time * 60
//                })
//        }
//    }
//    Spacer(modifier = Modifier.height(16.dp))
//
//    Text(
//        "Tags",
//        fontWeight = FontWeight.Bold,
//        fontSize = 18.sp,
//        modifier = Modifier.align(Alignment.CenterHorizontally)
//    )
//    // Focus tag info
//    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
//        listOf(
//            "Study" to Color(0xFFE57373),
//            "Sport" to Color(0xFF64B5F6),
//            "Other" to Color(0xFFFFD54F),
//            "Enterta" to Color(0xFFFFB74D)
//        ).forEach { (tag, color) ->
//            TagButton(
//                tag = tag,
//                color = color,
//                isSelected = tag == selectedTag,
//                onClick = { selectedTag = tag })
//        }
//    }
}