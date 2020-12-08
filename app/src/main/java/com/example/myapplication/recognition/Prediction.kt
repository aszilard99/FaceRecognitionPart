package com.example.myapplication.recognition


import android.graphics.Rect

// a detektált arcnak a boundingBox-a és a címkéje
data class Prediction (var bbox: Rect, var label : String)
