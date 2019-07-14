package com.kevinpeppacomputers.alc4phase1;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALC extends AppCompatActivity {
    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);


        webView = (WebView) findViewById(R.id.aboutAlcWeb);

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });

            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("https://andela.com/alc");


        }
//
//    @Override
//    public Void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
//        handler.proceed();
//
//    }
    }
