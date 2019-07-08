package com.inversion.pecaledediparitie;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AnimalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        String value = extras.getString("key");

        switch(value) {

            case "CapraNeagra" : {
                setContentView(R.layout.activity_capra_neagra);
                Button buttonCapra = (Button) findViewById(R.id.buttonCapra);
                buttonCapra.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ro.wikipedia.org/wiki/Capr%C4%83-neagr%C4%83"));
                        startActivity(browserIntent);
                    }
                });
                break;
            }
            case "Ras" : {
                setContentView(R.layout.activity_ras);
                Button buttonRas = (Button) findViewById(R.id.buttonRas);
                buttonRas.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ro.wikipedia.org/wiki/R%C3%A2s_(animal)"));
                        startActivity(browserIntent);
                    }
                });
                break;
            }
            case "Zimbru" : {
                setContentView(R.layout.activity_zimbru);
                Button buttonZimbru = (Button) findViewById(R.id.buttonZimbru);
                buttonZimbru.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ro.wikipedia.org/wiki/Zimbru"));
                        startActivity(browserIntent);
                    }
                });
                break;
            }
            case "Cocos" : {
                setContentView(R.layout.activity_cocos);
                Button buttonCocos = (Button) findViewById(R.id.buttonCocos);
                buttonCocos.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ro.wikipedia.org/wiki/Coco%C8%99_de_munte"));
                        startActivity(browserIntent);
                    }
                });
                break;
            }
            case "Pastrav" : {
                setContentView(R.layout.activity_pastrav);
                Button buttonPastrav = (Button) findViewById(R.id.buttonPastrav);
                buttonPastrav.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ro.wikipedia.org/wiki/P%C4%83str%C4%83v"));
                        startActivity(browserIntent);
                    }
                });
                break;
            }
            case "Naparca" : {
                setContentView(R.layout.activity_naparca);
                Button buttonNaparca= (Button) findViewById(R.id.buttonNaparca);
                buttonNaparca.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ro.wikipedia.org/wiki/N%C4%83p%C3%A2rc%C4%83"));
                        startActivity(browserIntent);
                    }
                });
                break;
            }
            case "Zagan" : {
                setContentView(R.layout.activity_zagan);
                Button buttonZagan = (Button) findViewById(R.id.buttonZagan);
                buttonZagan.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://pasaridinromania.sor.ro/Zagan"));
                        startActivity(browserIntent);
                    }
                });
                break;
            }
            case "Morun" : {
                setContentView(R.layout.activity_morun);
                Button buttonMorun = (Button) findViewById(R.id.buttonMorun);
                buttonMorun.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ro.wikipedia.org/wiki/Morun"));
                        startActivity(browserIntent);
                    }
                });
                break;
            }
            case "Antilopa" : {
                setContentView(R.layout.activity_antilopa);
                Button buttonAntilopa = (Button) findViewById(R.id.buttonAntilopa);
                buttonAntilopa.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ro.wikipedia.org/wiki/Antilopa_Saiga"));
                        startActivity(browserIntent);
                    }
                });
                break;
            }
            case "Pelican" : {
                setContentView(R.layout.activity_pelican);
                Button buttonPelican = (Button) findViewById(R.id.buttonPelican);
                buttonPelican.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ro.wikipedia.org/wiki/Pelican"));
                        startActivity(browserIntent);
                    }
                });
                break;
            }
            case "Hoitar" : {
                setContentView(R.layout.activity_hoitar);
                Button buttonHoitar = (Button) findViewById(R.id.buttonHoitar);
                buttonHoitar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://pasaridinromania.sor.ro/Hoitar"));
                        startActivity(browserIntent);
                    }
                });
                break;
            }
            case "Floare" : {
                setContentView(R.layout.activity_floare);
                Button buttonFloare = (Button) findViewById(R.id.buttonFloare);
                buttonFloare.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ro.wikipedia.org/wiki/Floarea-reginei"));
                        startActivity(browserIntent);
                    }
                });
                break;
            }
            case "Bujor" : {
                setContentView(R.layout.activity_bujor);
                Button buttonBujor = (Button) findViewById(R.id.buttonBujor);
                buttonBujor.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ro.wikipedia.org/wiki/Sm%C3%A2rdar"));
                        startActivity(browserIntent);
                    }
                });
                break;
            }
            case "Lalea" : {
                setContentView(R.layout.activity_lalea);
                Button buttonLalea = (Button) findViewById(R.id.buttonLalea);
                buttonLalea.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ro.wikipedia.org/wiki/Fritillaria_meleagris"));
                        startActivity(browserIntent);
                    }
                });
                break;
            }
            case "Sange" : {
                setContentView(R.layout.activity_sange);
                Button buttonSange = (Button) findViewById(R.id.buttonSange);
                buttonSange.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.interferente.ro/sangele-voinicului-nigritella-rubra-si-nigritella-nigra.html"));
                        startActivity(browserIntent);
                    }
                });
                break;
            }
            case "Garofita" : {
                setContentView(R.layout.activity_garofita);
                Button buttonGarofita = (Button) findViewById(R.id.buttonGarofita);
                buttonGarofita.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.montaniarzi.ro/garofita-pietrei-craiului-floarea-craiului-unica-in-lume/"));
                        startActivity(browserIntent);
                    }
                });
                break;
             }


        }
    }
}
