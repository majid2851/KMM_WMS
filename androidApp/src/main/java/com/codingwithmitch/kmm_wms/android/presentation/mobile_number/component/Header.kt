package com.codingwithmitch.kmm_wms.android.presentation.mobile_number.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.BLUE2
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Black_1C
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Gray_60
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Green2
import com.codingwithmitch.kmm_wms.android.R
import com.codingwithmitch.kmm_wms.android.presentation.mobile_number.mn_font_enterYour
import com.codingwithmitch.kmm_wms.android.presentation.mobile_number.mn_font_mobileNumber

@Preview
@Composable
fun Header()
{
    Column(modifier=Modifier.
    padding(top = dimensionResource(id = R.dimen.paddingLayouts10))
    )
    {
        Text(
            stringResource(id = R.string.enterYour),
            fontSize = mn_font_enterYour,
            fontWeight = FontWeight(700),
            color = Gray_60,
            modifier = Modifier
                .align(Alignment.CenterHorizontally))


        Text(
            text = multiStyleText(
                stringResource(R.string.m),
                BLUE2,
                stringResource(R.string.obile),
                Black_1C,
                stringResource(R.string.n),
                Green2
                , stringResource(R.string.umber)

                ),
            fontSize = mn_font_mobileNumber,
            fontWeight = FontWeight(700),
            color = Black_1C,
            modifier = Modifier
                .align(Alignment.CenterHorizontally))


    }



}
fun multiStyleText(
    text1: String
    ,
    color1: Color
    ,
    text2:String
    ,
    colorMain: Color
    ,
    text3:String
    ,
    color3: Color
    ,
    text4:String,
):
        AnnotatedString {
    val sb=buildAnnotatedString {
        withStyle(style = SpanStyle(color = color1)) {
            append(text1)
        }
        withStyle(style = SpanStyle(color = colorMain)) {
            append(text2)
        }
        append(" ")
        withStyle(style = SpanStyle(color = color3)) {
            append(text3)
        }
        withStyle(style = SpanStyle(color = colorMain)) {
            append(text4)
        }
    }
    return sb
}

