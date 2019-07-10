package com.code.hub.course

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

abstract class MyFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(getLayoutRes(), container, false)
    }

//    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
//        super.setUserVisibleHint(isVisibleToUser)
//    }

    abstract fun getLayoutRes(): Int

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initUI(view)
    }

    abstract fun initUI(view: View)

    override fun onResume() {
        super.onResume()

        view?.apply { refreshUI(this) }
    }

    abstract fun refreshUI(view: View)

    override fun onStop() {
        view?.apply { destroyUI(this) }

        super.onStop()
    }

    open fun destroyUI(view: View) {}

}