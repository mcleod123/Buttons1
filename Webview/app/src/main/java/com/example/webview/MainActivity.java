package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mWebView = (WebView) findViewById(R.id.webView1);
        // устанавливаем Zoom control
        mWebView.getSettings().setBuiltInZoomControls(true);

        // загружаем картинку (не забудьте установить разрешение на интернет)
        mWebView.loadUrl("http://netsources.narod.ru/friday/alkocat.jpg");
        this.setTitle("WebView");

    }
}
