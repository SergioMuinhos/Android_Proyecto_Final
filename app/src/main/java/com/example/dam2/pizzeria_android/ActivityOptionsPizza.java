package com.example.dam2.pizzeria_android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ActivityOptionsPizza extends Activity {
    Spinner sp1,sp2,sp3,sp4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_pizza);
        sp1=(Spinner)findViewById(R.id.spinner);
        sp2=(Spinner)findViewById(R.id.spinner2);
        sp3=(Spinner)findViewById(R.id.spinner3);
        sp4=(Spinner)findViewById(R.id.spinner4);

        String[]tamaño={"PEQUEÑA","MEDIANA","FAMILIAR"};
        String[] masa={"ULTRAFINA","FINA","MEDIANA","NORMAL"};
        String []unidades={"1","2","3","4","5","6","7","8","9"};
        String [] salsas={"BBQ CREME DOBLE","BARBACOA","BURGER","JALISIA","tOMATE Y OREGANO","CARBONARA","SIN SALSA"};


        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,tamaño);
        sp2.setAdapter(adapter);
        ArrayAdapter<String> adapter2=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,unidades);
        sp1.setAdapter(adapter2);
        ArrayAdapter<String> adapter3=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,masa);
        sp3.setAdapter(adapter3);
        ArrayAdapter<String> adapter4=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,salsas);
        sp4.setAdapter(adapter4);
    }

}
