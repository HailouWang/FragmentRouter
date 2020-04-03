package com.hailouwang.fragmentrouter.sample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hailouwang.fragmentrouter.ActivityUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragmentDemos1.setOnClickListener {
            var intent: Intent = Intent()

            // className = 在 AndroidManifest 中 使用 activity-alias 定义的别名
            intent.setClassName(
                "com.hailouwang.fragmentrouter.sample",
                "com.hailouwang.fragmentrouter.sample.fragment1.FragmentDemosActivity1"
            )
            ActivityUtils.startActivitySafely(this@MainActivity, intent)
        }

        fragmentDemos2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                var intent: Intent = Intent()

                // className = 在 AndroidManifest 中 使用 activity-alias 定义的别名
                intent.setClassName(
                    "com.hailouwang.fragmentrouter.sample",
                    "com.hailouwang.fragmentrouter.sample.fragment2.FragmentDemosActivity2"
                )
                ActivityUtils.startActivitySafely(this@MainActivity, intent)
            }
        })

        fragmentDemos3.apply {
            setOnClickListener {
                var intent: Intent = Intent()

                // className = 在 AndroidManifest 中 使用 activity-alias 定义的别名
                intent.setClassName(
                    "com.hailouwang.fragmentrouter.sample",
                    "com.hailouwang.fragmentrouter.sample.fragment3.FragmentDemosActivity3"
                )
                ActivityUtils.startActivitySafely(this@MainActivity, intent)
            }
        }
    }
}
