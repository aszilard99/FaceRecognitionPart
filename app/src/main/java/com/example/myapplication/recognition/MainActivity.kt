package com.example.myapplication.recognition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Size
import android.view.TextureView
import android.view.ViewGroup
import androidx.camera.core.*
import com.example.myapplication.R


class MainActivity : AppCompatActivity() {

    private lateinit var frameAnalyser  : FrameAnalyser
    private lateinit var cameraTextureView : TextureView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //inicializálja a kamerát a camerax-es codelab szerint
    private fun startCamera() {
        val previewConfig = PreviewConfig.Builder().apply {
            setTargetResolution(Size(640, 480))
            setLensFacing(CameraX.LensFacing.FRONT)
        }.build()
        val preview = Preview(previewConfig)
        preview.setOnPreviewOutputUpdateListener {
            val parent = cameraTextureView.parent as ViewGroup
            parent.removeView(cameraTextureView)
            parent.addView(cameraTextureView, 0)

            //kell egy függvény, ami akkor hívódik meg, ha elfordul a képernyő
        }
    }
}

