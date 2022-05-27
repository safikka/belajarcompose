package com.example.belajarcompose.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Print
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
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
                    .constrainAs(boxref) {
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
                    .padding(top = 55.dp)
                    .constrainAs(columnref) {
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
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        CardButton("Printer")
                        Spacer(modifier = Modifier.padding(10.dp))
                        CardButton("Camera")
                    }
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
            .padding(top = 10.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Sinau Hardware",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
    }
}


@Composable
fun CardButton(
    Judul:String
) {
    Box(
        modifier = Modifier
            .width(150.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Color.White)
            .clickable {}
    ){
        Column(
            Modifier
                .padding(16.dp)
        ) {
            Spacer(modifier = Modifier.height(8.dp))
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ){
//                Image(
//                    painter = painterResource(id = R.drawable.ic_red_rose_bouquet),
//                    contentDescription = "",
//                    modifier = Modifier.size(100.dp)
//                )
                Icon(
                    imageVector = Icons.Filled.Print,
                    contentDescription = "",
                    tint = Color.Black,
                    modifier = Modifier
                        .size(80.dp, 80.dp)
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = Judul,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Black,
                )
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .background(Delameta)
                        .padding(2.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = "",
                        tint = Color.White,
                        modifier = Modifier
                            .size(20.dp, 20.dp)
                    )
                }
            }
        }
    }
}


@Preview
@Composable
fun Prev1() {
    BerandaScreen()
}