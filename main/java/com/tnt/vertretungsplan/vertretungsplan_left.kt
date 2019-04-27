package com.tnt.vertretungsplan

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient


/**
 * A simple [Fragment] subclass.
 */
class vertretungsplan_left : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var frag = inflater.inflate(R.layout.vertretungsplan_left, container, false)

        var webview = frag.findViewById<WebView>(R.id.leftwebview)
        webview!!.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        webview.loadUrl("https://www.bgh-windeck.de/cunst/Schueler/right/subst_001.htm")

        return frag
    }
}