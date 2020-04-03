package com.hailouwang.fragmentrouter.sample.fragment3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.hailouwang.fragmentrouter.sample.R
import kotlinx.android.synthetic.main.fragment_demo.view.*

class FragmentDemos3 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_demo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.tv.text = javaClass.canonicalName;
    }
}