package com.example.belajarcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.belajarcompose.R
import com.example.belajarcompose.ui.theme.Delameta
import com.example.belajarcompose.ui.theme.WhiteBox

@Composable
fun BerandaScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ){
        ConstraintLayout {

            val (boxref,columnref) = createRefs()

            Box(
                modifier = Modifier
                    .height(100.dp)
                    .constrainAs(boxref){
                        top.linkTo(boxref.top)
                        bottom.linkTo(boxref.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
            ){
                HeadingItem()
            }
            Surface(
                color = WhiteBox,
                shape = RoundedCornerShape(40.dp).copy(
                    bottomStart = ZeroCornerSize,
                    bottomEnd = ZeroCornerSize
                ),
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 50.dp)
                    .constrainAs(columnref){
                        bottom.linkTo(parent.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    Spacer(modifier = Modifier.padding(10.dp))
                    Spacer(modifier = Modifier.padding(10.dp))
                    Spacer(modifier = Modifier.padding(10.dp))
                    Spacer(modifier = Modifier.padding(10.dp))
                }
            }
        }
    }
}

@Composable
fun HeadingItem() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Delameta)
    )
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Enco-POS",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp
        )
    }
}

@Preview
@Composable
fun Prev1() {
    BerandaScreen()
}