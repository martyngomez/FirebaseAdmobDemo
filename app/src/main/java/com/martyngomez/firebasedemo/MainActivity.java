package com.martyngomez.firebasedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // MobileAds.initialize(this, "ca-app-pub-8732857888252123~7381823273"); //Inicializa con App Admob ID

        adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build(); //Arma el aviso
        adView.loadAd(adRequest);  //Carga aviso



       // Alterar boton por codigo
       /*
        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-8732857888252123/4149155277");
        **/
    }
}
