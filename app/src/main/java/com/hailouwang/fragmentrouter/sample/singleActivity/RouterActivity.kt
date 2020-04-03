package com.hailouwang.fragmentrouter.sample.singleActivity

import com.hailouwang.fragmentrouter.BMRouterFragmentActivity
import com.hailouwang.fragmentrouter.sample.fragment1.FragmentDemos1
import com.hailouwang.fragmentrouter.sample.fragment2.FragmentDemos2

class RouterActivity : BMRouterFragmentActivity() {

    companion object {
        private val ENTRY_FRAGMENTS: MutableSet<String> = HashSet()

        init {
            ENTRY_FRAGMENTS.add(FragmentDemos1::class.java.name)
            ENTRY_FRAGMENTS.add(FragmentDemos2::class.java.name)
//            ENTRY_FRAGMENTS.add(FragmentDemos1::class.java.name)
        }
    }

    override fun defaultFragment(): String {
        // 当前不需要 此Activity 内置Fragment ，故：此处，返回 null
        return ""
    }

    override fun isValidFragment(fragmentName: String?): Boolean {
        return ENTRY_FRAGMENTS.contains(fragmentName)
    }
}