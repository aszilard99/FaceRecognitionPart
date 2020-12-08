package com.example.myapplication.recognition

import android.content.Context
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageProxy
import kotlin.collections.ArrayList


class FrameAnalyser(private var context: Context) : ImageAnalysis.Analyzer {

    //itt lesznek eltárolva a nevek és hozzá tartozó arcok vektorleképezései
    var faceList = ArrayList<Pair<String, FloatArray>>()

    //ide kell berakni a modellt
    private val model = null

    //az analyzeban kell megadni hogy mit hajtson végre a FrameAnalyzer mindegyik kamera képre ,amit megkap
    override fun analyze(image: ImageProxy?, rotationDegrees: Int) {
    }
}