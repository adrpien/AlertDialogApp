package com.adrpien.alertdialogapp

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.os.Parcel
import android.os.Parcelable
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

class PaintView(context: Context, attrs: AttributeSet? = null) : View(context, attrs){

    val paint = Paint()
    var paths: ArrayList<Path> = ArrayList()
    lateinit var path: Path

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        paint.color = Color.BLACK
        for(path in paths){
            canvas?.drawPath(path, paint)
        }
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        if(event != null) {
                when (event.action) {
                    MotionEvent.ACTION_DOWN -> {

                    }
                    MotionEvent.ACTION_UP -> {

                    }
                    MotionEvent.ACTION_MOVE -> {

                    }
                }
        }
        return true
    }

}