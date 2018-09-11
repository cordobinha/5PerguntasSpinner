package com.example.vi_ni.a5perguntasspinner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Spinner spnPergunta1,spnPergunta2,spnPergunta3,spnPergunta4,spnPergunta5;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnPergunta1 = findViewById(R.id.spnPergunta1);
        spnPergunta2 = findViewById(R.id.spnPergunta2);
        spnPergunta3 = findViewById(R.id.spnPergunta3);
        spnPergunta4 = findViewById(R.id.spnPergunta4);
        spnPergunta5 = findViewById(R.id.spnPergunta5);
        txtResultado = findViewById(R.id.txtResultado);
    }

    public void responder(View view){
        int count = 0;

        if(spnPergunta1.getSelectedItem().toString().equals("Maça"))
            count++;
        if(spnPergunta2.getSelectedItem().toString().equals("Chave"))
            count++;
        if(spnPergunta3.getSelectedItem().toString().equals("Disco Rigido"))
            count++;
        if(spnPergunta4.getSelectedItem().toString().equals("NotePad++"))
            count++;
        if(spnPergunta5.getSelectedItem().toString().equals("Nissan"))
            count++;

        txtResultado.setText(String.valueOf(count) + "/5 acertos");
    }
}
