package com.example.artspaceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspaceapp.ui.theme.ArtSpaceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtSpacePage()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ArtSpacePage(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
//                modifier=Modifier.background(Color.Black)
                title = {
                Text(
                    text = "My Anime Gallery",
                    style= TextStyle(
                        fontWeight = FontWeight.Bold ,
                        fontSize = 24.sp,
                        color = Color.White
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 12.dp),
//                    .background(Color.Green),
                    textAlign = TextAlign.Center,
                    )

                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Blue
                )
//                Modifier.background()
            )
        }
    ) {
        val pic1= painterResource(id = R.drawable.akautsuki)
        val pic2= painterResource(id = R.drawable.tobirama1)
        val pic3= painterResource(id = R.drawable.sarada)
        val pic4= painterResource(id = R.drawable.himawari)
        val pic5= painterResource(id = R.drawable.itachi2)
        val pic6= painterResource(id = R.drawable.itachi)
        val pic7= painterResource(id = R.drawable.jiraya)
        val pic8= painterResource(id = R.drawable.kakashi)
        val pic9= painterResource(id = R.drawable.leafheadband)
        val pic10= painterResource(id = R.drawable.obito)
        val pic11= painterResource(id = R.drawable.naruto)
        val pic12= painterResource(id = R.drawable.pain)
        val pic13= painterResource(id = R.drawable.saitama)
        val pic14= painterResource(id = R.drawable.kokushibou)
        val pic15= painterResource(id = R.drawable.demonslayer)
        val pic16= painterResource(id = R.drawable.zenitsu)
        val pic17= painterResource(id = R.drawable.aot)

        
        val p1=stringResource(id=R.string.p1_Akautsuki)
        val p2=stringResource(id = R.string.p2_tobirama)
        val p3=stringResource(id = R.string.p3_Sarada)
        val p4=stringResource(id = R.string.p4_Himawari)
        val p5=stringResource(id = R.string.p5_Itachi)
        val p6=stringResource(id = R.string.p6_Itachi2)
        val p7=stringResource(id = R.string.p7_Jiraya)
        val p8=stringResource(id = R.string.p8_Kakashi)
        val p9=stringResource(id = R.string.p9_Leaf_HeadBand)
        val p10=stringResource(id = R.string.p10_Obito)
        val p11=stringResource(id = R.string.p11_Naruto)
        val p12=stringResource(id = R.string.p12_Pain)
        val p13=stringResource(id = R.string.p13_Saitama)
        val p14=stringResource(id = R.string.p14_Kokushibou)
        val p15=stringResource(id = R.string.p15_Demon_Slayer)
        val p16=stringResource(id = R.string.p16_Zenitsu)
        val p17=stringResource(id = R.string.p17_AOT)

        val ByKishimoto=stringResource(id = R.string.By_kishimoto)
        val ByOPM=stringResource(id = R.string.By_OPM)
        val ByDS=stringResource(id = R.string.By_DS)
        val ByAOT=stringResource(id = R.string.By_AOT)

        val AlbumNaruto=stringResource(id = R.string.Album_Naruto)
        val AlbumOPM=stringResource(id = R.string.Album_OnePunchMan)
        val AlbumDS=stringResource(id = R.string.Album_DemonSlayer)
        val AlbumAOT=stringResource(id = R.string.Album_AOT)

        var PicturePic by remember {
            mutableStateOf(pic1)
        }
//        val albumTitle:String =stringResource(id=R.string.Album_DemonSlayer)
        var AlbumTitle by remember {
         mutableStateOf(AlbumNaruto)
        }
//        val picTitle:String =stringResource(id=R.string.p1_Akautsuki)
        var PicTitle by remember {
            mutableStateOf(p1)
        }
//        val picDiscription:String =stringResource(id=R.string.By_kishimoto)
        var PicDiscription by remember {
            mutableStateOf(ByKishimoto)
        }
//        var SwipeDirection by remember {
//            mutableStateOf(0)
//        }

        Column(
            modifier= Modifier
                .fillMaxSize(1f)
                .padding(it)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {

            Text(
                text = "Album : \n"+ AlbumTitle ,
                modifier= Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, bottom = 12.dp)
//                ,textAlign = TextAlign.Center,
                    ,color=Color.Blue
                ,style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp
                )
            )

            Box (
                modifier = Modifier
                    .background(Color.Gray.copy(0.05f))
                    .pointerInput(Unit){
                        detectDragGestures { change, dragAmount ->
                            if(dragAmount.x > 100){
//                                SwipeDirection=1
                                when(AlbumTitle){
                                    AlbumNaruto->{
                                        PicTitle = p17
                                        PicDiscription = ByAOT
                                        AlbumTitle = AlbumAOT
                                        PicturePic = pic17
                                    }
                                    AlbumOPM->{
                                        PicTitle = p1
                                        PicDiscription = ByKishimoto
                                        AlbumTitle = AlbumNaruto
                                        PicturePic = pic1
                                    }
                                    AlbumDS->{
                                        PicTitle = p13
                                        PicDiscription = ByOPM
                                        AlbumTitle = AlbumOPM
                                        PicturePic = pic13
                                    }
                                    AlbumAOT->{
                                        PicTitle = p14
                                        PicDiscription = ByDS
                                        AlbumTitle = AlbumDS
                                        PicturePic = pic14
                                    }

                                }
                            }else if(dragAmount.x > -100){
//                                SwipeDirection=-1
                                when(AlbumTitle){
                                    AlbumNaruto->{
                                        PicTitle = p13
                                        PicDiscription = ByOPM
                                        AlbumTitle = AlbumOPM
                                        PicturePic = pic13
                                    }
                                    AlbumAOT->{
                                        PicTitle = p1
                                        PicDiscription = ByKishimoto
                                        AlbumTitle = AlbumNaruto
                                        PicturePic = pic1
                                    }
                                    AlbumDS->{
                                        PicTitle = p17
                                        PicDiscription = ByAOT
                                        AlbumTitle = AlbumAOT
                                        PicturePic = pic17
                                    }
                                    AlbumOPM->{
                                        PicTitle = p14
                                        PicDiscription = ByDS
                                        AlbumTitle = AlbumDS
                                        PicturePic = pic14
                                    }
                                }
                            }
                    }
                    }
                    .shadow(
                        elevation = 40.dp,
                        ambientColor = Color(0, 0, 255, 100), // Ambient color
                        spotColor = Color(0, 0, 255, 255) // Spot color

                    ),
            ) {
                Image(
                    painter = PicturePic,
                    contentDescription =null,
                    modifier = Modifier
                        .padding(20.dp)
                        .shadow(
                            elevation = 40.dp,
                            ambientColor = Color(0, 0, 0, 100), // Ambient color
                            spotColor = Color(0, 0, 0, 255) // Spot color

                        )
                )
            }
            Spacer(
                modifier = Modifier
                    .height(40.dp)
            )
            Column(
                modifier= Modifier
                    .padding(horizontal = 40.dp)
                    .background(Color.Gray.copy(alpha = 0.1f))
                    .border(border = BorderStroke(1.dp, Color.Gray.copy(alpha = 0.5f)))
            ) {
                Text(
                    text = PicTitle ,
                    modifier=Modifier
                        .fillMaxWidth()
//                    .padding(12.dp)
                    ,textAlign = TextAlign.Center,
//                    color=Color.White,
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp
                    )

                )
                Text(
                    text = PicDiscription,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 12.dp),
                    textAlign = TextAlign.Center,
//                    color=Color.White
                    style = TextStyle(
//                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )

                    )
            }
//        Spacer(modifier = Modifier.height(20.dp))
            Row (modifier = Modifier.padding(top = 20.dp)){
                Button(
                    onClick = {
                        when(PicTitle) {
                            p1 -> {
                                PicTitle = p17
                                PicDiscription = ByAOT
                                AlbumTitle = AlbumAOT
                                PicturePic = pic17
                            }

                            p2 -> {
                                PicTitle = p1
                                PicDiscription = ByKishimoto
                                AlbumTitle = AlbumNaruto
                                PicturePic = pic1
                            }

                            p3 -> {
                                PicTitle = p2
                                PicDiscription = ByKishimoto
                                AlbumTitle = AlbumNaruto
                                PicturePic = pic2
                            }

                            p4 -> {
                                PicTitle = p3
                                PicDiscription = ByKishimoto
                                AlbumTitle = AlbumNaruto
                                PicturePic = pic3
                            }

                            p5 -> {
                                PicTitle = p4
                                PicDiscription = ByKishimoto
                                AlbumTitle = AlbumNaruto
                                PicturePic = pic4
                            }

                            p6 -> {
                                PicTitle = p5
                                PicDiscription = ByKishimoto
                                AlbumTitle = AlbumNaruto
                                PicturePic = pic5
                            }

                            p7 -> {
                                PicTitle = p6
                                PicDiscription = ByKishimoto
                                AlbumTitle = AlbumNaruto
                                PicturePic = pic6
                            }

                            p8 -> {
                                PicTitle = p7
                                PicDiscription = ByKishimoto
                                AlbumTitle = AlbumNaruto
                                PicturePic = pic7
                            }

                            p9 -> {
                                PicTitle = p8
                                PicDiscription = ByKishimoto
                                AlbumTitle = AlbumNaruto
                                PicturePic = pic8
                            }

                            p10 -> {
                                PicTitle = p9
                                PicDiscription = ByKishimoto
                                AlbumTitle = AlbumNaruto
                                PicturePic = pic9
                            }

                            p11 -> {
                                PicTitle = p10
                                PicDiscription = ByKishimoto
                                AlbumTitle = AlbumNaruto
                                PicturePic = pic10
                            }

                            p12 -> {
                                PicTitle = p11
                                PicDiscription = ByKishimoto
                                AlbumTitle = AlbumNaruto
                                PicturePic = pic11
                            }

                            p13 -> {
                                PicTitle = p12
                                PicDiscription = ByKishimoto
                                AlbumTitle = AlbumNaruto
                                PicturePic = pic12
                            }

                            p14 -> {
                                PicTitle = p13
                                PicDiscription = ByOPM
                                AlbumTitle = AlbumOPM
                                PicturePic = pic13
                            }

                            p15 -> {
                                PicTitle = p14
                                PicDiscription = ByDS
                                AlbumTitle = AlbumDS
                                PicturePic = pic14
                            }

                            p16 -> {
                                PicTitle = p15
                                PicDiscription = ByDS
                                AlbumTitle = AlbumDS
                                PicturePic = pic15
                            }

                            p17 -> {
                                PicTitle = p16
                                PicDiscription = ByDS
                                AlbumTitle = AlbumDS
                                PicturePic = pic16
                            }
                        }
                    },
                    modifier= Modifier
                        .weight(1f)
                        .height(60.dp)
                        .padding(4.dp)
                    ,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                ) {
                    Text(
                        text = "PREVIOUS",
                        style= TextStyle(
                            fontWeight=FontWeight.Bold,
                            fontSize = 20.sp
                        )
                    )
                }
                Button(
                    onClick = {
                        when(PicTitle){
                            p1->{PicTitle=p2
                                PicDiscription=ByKishimoto
                                AlbumTitle=AlbumNaruto
                                PicturePic=pic2}
                            p2->{PicTitle=p3
                                PicDiscription=ByKishimoto
                                AlbumTitle=AlbumNaruto
                                PicturePic=pic3}
                            p3->{PicTitle=p4
                                PicDiscription=ByKishimoto
                                AlbumTitle=AlbumNaruto
                                PicturePic=pic4}
                            p4->{PicTitle=p5
                                PicDiscription=ByKishimoto
                                AlbumTitle=AlbumNaruto
                                PicturePic=pic5}
                            p5->{PicTitle=p6
                                PicDiscription=ByKishimoto
                                AlbumTitle=AlbumNaruto
                                PicturePic=pic6}
                            p6->{PicTitle=p7
                                PicDiscription=ByKishimoto
                                AlbumTitle=AlbumNaruto
                                PicturePic=pic7}
                            p7->{PicTitle=p8
                                PicDiscription=ByKishimoto
                                AlbumTitle=AlbumNaruto
                                PicturePic=pic8}
                            p8->{PicTitle=p9
                                PicDiscription=ByKishimoto
                                AlbumTitle=AlbumNaruto
                                PicturePic=pic9}
                            p9->{PicTitle=p10
                                PicDiscription=ByKishimoto
                                AlbumTitle=AlbumNaruto
                                PicturePic=pic10}
                            p10->{PicTitle=p11
                                PicDiscription=ByKishimoto
                                AlbumTitle=AlbumNaruto
                                PicturePic=pic11}
                            p11->{PicTitle=p12
                                PicDiscription=ByKishimoto
                                AlbumTitle=AlbumNaruto
                                PicturePic=pic12}
                            p12->{PicTitle=p13
                                PicDiscription=ByOPM
                                AlbumTitle=AlbumOPM
                                PicturePic=pic13}
                            p13->{PicTitle=p14
                                PicDiscription=ByDS
                                AlbumTitle=AlbumDS
                                PicturePic=pic14}
                            p14->{PicTitle=p15
                                PicDiscription=ByDS
                                AlbumTitle=AlbumDS
                                PicturePic=pic15}
                            p15->{PicTitle=p16
                                PicDiscription=ByDS
                                AlbumTitle=AlbumDS
                                PicturePic=pic16}
                            p16->{PicTitle=p17
                                PicDiscription=ByAOT
                                AlbumTitle=AlbumAOT
                                PicturePic=pic17}
                            p17->{PicTitle=p1
                                PicDiscription=ByKishimoto
                                AlbumTitle=AlbumNaruto
                                PicturePic=pic1}
                              }

                    },
                    modifier= Modifier
                        .weight(1f)
                        .height(60.dp)
                        .padding(4.dp)
                    ,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                ) {
                    Text(
                        text = "NEXT",
                        style= TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )
                    )
                }

            }

        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtSpaceAppTheme {
        ArtSpacePage()
    }
}