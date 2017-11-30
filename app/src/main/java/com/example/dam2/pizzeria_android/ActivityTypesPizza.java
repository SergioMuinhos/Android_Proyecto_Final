package com.example.dam2.pizzeria_android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityTypesPizza extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types_pizza);
    }

    public void siguienteOptions(View view){
        Intent i=new Intent(this, ActivityOptionsPizza.class);
        startActivity(i);
    }

}
