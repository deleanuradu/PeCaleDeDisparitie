package com.inversion.pecaledediparitie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    final String items [] = new String [] {"Capra Neagră", "Râsul", "Zimbrul", "Cocoşul De Munte"
    ,"Păstravul", "Năpârca" ,"Zăgan", "Morun", "Antilopa Saiga", "Pelican", "Hoitar", "Floarea De Colț",
            "Bujorul De Munte(Smârdarul)", "Laleaua Pestriță", "Sângele Voinicului", "Garofița Pietrei Craiului"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView = findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0)
                {
                    String value = "CapraNeagra";
                    Intent i = new Intent(view.getContext(),AnimalActivity.class);
                    i.putExtra("key",value);
                    startActivity(i);
                }
                else if (position == 1)
                {
                    String value = "Ras";
                    Intent i = new Intent(view.getContext(),AnimalActivity.class);
                    i.putExtra("key", value);
                    startActivity(i);
                }
                else if (position == 2)
                {
                    String value = "Zimbru";
                    Intent i = new Intent(view.getContext(),AnimalActivity.class);
                    i.putExtra("key", value);
                    startActivity(i);
                }
                else if (position == 3)
                {
                    String value = "Cocos";
                    Intent i = new Intent(view.getContext(),AnimalActivity.class);
                    i.putExtra("key", value);
                    startActivity(i);
                }
                else if (position == 4)
                {
                    String value = "Pastrav";
                    Intent i = new Intent(view.getContext(),AnimalActivity.class);
                    i.putExtra("key", value);
                    startActivity(i);
                }
                else if (position == 5) {
                    String value = "Naparca";
                    Intent i = new Intent(view.getContext(), AnimalActivity.class);
                    i.putExtra("key", value);
                    startActivity(i);
                }
                else if (position == 6)
                {
                    String value = "Zagan";
                    Intent i = new Intent(view.getContext(),AnimalActivity.class);
                    i.putExtra("key", value);
                    startActivity(i);
                }
                else if (position == 7)
                {
                    String value = "Morun";
                    Intent i = new Intent(view.getContext(),AnimalActivity.class);
                    i.putExtra("key", value);
                    startActivity(i);
                }
                else if (position == 8)
                {
                    String value = "Antilopa";
                    Intent i = new Intent(view.getContext(),AnimalActivity.class);
                    i.putExtra("key", value);
                    startActivity(i);
                }
                else if (position == 9)
                {
                    String value = "Pelican";
                    Intent i = new Intent(view.getContext(),AnimalActivity.class);
                    i.putExtra("key", value);
                    startActivity(i);
                }
                else if (position == 10)
                {
                    String value = "Hoitar";
                    Intent i = new Intent(view.getContext(),AnimalActivity.class);
                    i.putExtra("key", value);
                    startActivity(i);
                }
                else if (position == 11)
                {
                    String value = "Floare";
                    Intent i = new Intent(view.getContext(),AnimalActivity.class);
                    i.putExtra("key", value);
                    startActivity(i);
                }
                else if (position == 12)
                {
                    String value = "Bujor";
                    Intent i = new Intent(view.getContext(),AnimalActivity.class);
                    i.putExtra("key", value);
                    startActivity(i);
                }
                else if (position == 13)
                {
                    String value = "Lalea";
                    Intent i = new Intent(view.getContext(),AnimalActivity.class);
                    i.putExtra("key", value);
                    startActivity(i);
                }
                else if (position == 14)
                {
                    String value = "Sange";
                    Intent i = new Intent(view.getContext(),AnimalActivity.class);
                    i.putExtra("key", value);
                    startActivity(i);
                }
                else if (position == 15)
                {
                    String value = "Garofita";
                    Intent i = new Intent(view.getContext(),AnimalActivity.class);
                    i.putExtra("key", value);
                    startActivity(i);
                }

            }
        });
    }
}
