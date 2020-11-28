package com.example.piechartkotlinreal

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androidplot.pie.Segment
import com.androidplot.pie.SegmentFormatter
import com.example.piechartkotlinreal.pieChart
import kotlinx.android.synthetic.main.activity_pie_chart.*

class pieChart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pie_chart)

        val arrayList = intent.getIntegerArrayListExtra("arrayList")

        val s1 = Segment("S1",arrayList.get(0))
        val s2 = Segment("S1",arrayList.get(1))
        val s3 = Segment("S1",arrayList.get(2))
        val s4 = Segment("S1",arrayList.get(3))

        val sf1 = SegmentFormatter(Color.BLUE)
        val sf2 = SegmentFormatter(Color.YELLOW)
        val sf3 = SegmentFormatter(Color.CYAN)
        val sf4 = SegmentFormatter(Color.MAGENTA)

        pieChart.addSegment(s1,sf1)
        pieChart.addSegment(s2,sf2)
        pieChart.addSegment(s3,sf3)
        pieChart.addSegment(s4,sf4)

    }
}