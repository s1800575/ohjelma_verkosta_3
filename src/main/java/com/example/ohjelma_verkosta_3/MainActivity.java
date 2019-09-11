package com.example.ohjelma_verkosta_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView ohjelmaVerkosta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ohjelmaVerkosta = (WebView) findViewById(R.id.ohjelmaVerkosta);

        WebSettings verkkoAsetukset = ohjelmaVerkosta.getSettings();
        verkkoAsetukset.setJavaScriptEnabled(true);
        ohjelmaVerkosta.setWebViewClient(new WebViewClient());
        ohjelmaVerkosta.loadUrl("https://public.bc.fi/s1800575/ruokalista.html");


    }
}
