package com.example.healthcare.screens

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.healthcare.R
import kotlinx.coroutines.delay

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MyApp(modifier: Modifier = Modifier) {


    val images = listOf(
        R.drawable.mental_l1,
        R.drawable.dental_l2,
        R.drawable.blood_l3,
        R.drawable.eye_l3
    )
    val pagerState = rememberPagerState(
        pageCount = { images.size }
    )
    LaunchedEffect(Unit) {
        while (true) {
            delay(2000)
            val nextPage = (pagerState.currentPage + 1) % pagerState.pageCount
            pagerState.scrollToPage(nextPage)
        }
    }
    val scope = rememberCoroutineScope()

    Column(
        modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = modifier.wrapContentSize()) {
            HorizontalPager(
                state = pagerState,
                modifier
                    .wrapContentSize()

            ) { currentPage ->

                Card(
                    modifier
                        .wrapContentSize()
                        .padding(8.dp),
                    elevation = CardDefaults.cardElevation(8.dp)
                ) {
                    Image(
                        modifier = Modifier.clickable {

                        },
                        painter = painterResource(id = images[currentPage]),
                        contentDescription = ""
                    )
                }
            }
            /*IconButton(
                onClick = {
                    val nextPage = pagerState.currentPage + 1
                    if (nextPage < images.size) {
                        scope.launch {
                            pagerState.scrollToPage(nextPage)
                        }
                    }
                },
                modifier
                    .padding(start = 0.dp,top=30.dp)
                    .size(48.dp)
                    .align(Alignment.CenterEnd)
                    .clip(CircleShape),
                colors = IconButtonDefaults.iconButtonColors(
                    containerColor = Color(0x52373737)
                )
            ) {
                Icon(
                    imageVector = Icons.Filled.KeyboardArrowRight, contentDescription = "",
                    modifier.fillMaxSize(),
                    tint = Color.LightGray
                )
            }
            IconButton(
                onClick = {
                    val prevPage = pagerState.currentPage -1
                    if (prevPage >= 0) {
                        scope.launch {
                            pagerState.scrollToPage(prevPage)
                        }
                    }
                },
                modifier
                    .padding(start= 30.dp,top = 30.dp)
                    .size(48.dp)
                    .align(Alignment.CenterStart)
                    .clip(CircleShape),
                colors = IconButtonDefaults.iconButtonColors(
                    containerColor = Color(0x52373737)
                )
            ) {
                Icon(
                    imageVector = Icons.Filled.KeyboardArrowLeft, contentDescription = "",
                    modifier.fillMaxSize(),
                    tint = Color.LightGray
                )
            }*/
        }

        PageIndicator(
            pageCount = images.size,
            currentPage = pagerState.currentPage,
            modifier = modifier
        )

    }
}

@Composable
fun PageIndicator(pageCount: Int, currentPage: Int, modifier: Modifier) {

    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        repeat(pageCount){
            IndicatorDots(isSelected = it == currentPage, modifier= modifier)
        }
    }
}

@Composable
fun IndicatorDots(isSelected: Boolean, modifier: Modifier) {
    val size = animateDpAsState(targetValue = if (isSelected) 12.dp else 10.dp, label = "")
    Box(modifier = modifier.padding(2.dp)
        .size(size.value)
        .clip(CircleShape)
        .background(if (isSelected) Color(0xff373737) else Color(0xA8373737))
    )
}