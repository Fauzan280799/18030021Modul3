package com.example.a18030021modul3;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    int poina = 0;//menambahkkan variabel
    int poinb = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);//Proses pemanggilan
        Bundle bundle = getIntent().getExtras();
        TextView tima = findViewById(R.id.I);
        TextView timb = findViewById(R.id.N);
        tima.setText(bundle.getCharSequence("tima"));
        timb.setText(bundle.getCharSequence("timb"));
    }

    public void tambahpoin(View view) {//Proses Pembuatan Skor apabila tombol button diklik akan menambahkkan ke textview poin
        if (view.getId() == R.id.satua) {
            poina = poina + 1;
        } else if (view.getId() == R.id.duaa) {
            poina = poina + 2;
        } else if (view.getId() == R.id.tigaa) {
            poina = poina + 3;
        } else if (view.getId() == R.id.satub) {
            poinb = poinb + 1;
        } else if (view.getId() == R.id.duab) {
            poinb = poinb + 2;
        } else if (view.getId() == R.id.tigab) {
            poinb = poinb + 3;
        }
        TextView tima = findViewById(R.id.poina);//pembuatan objek
        TextView timb = findViewById(R.id.poinb);
        tima.setText(String.valueOf(poina));
        timb.setText(String.valueOf(poinb));

    }
    public void reset(View view) {//Proses Pembuatan reset poin apabila tombol button reset diklik akan mereset poin dri 0
        if (view.getId() == R.id.ResetA) {
            poina = 0;
        } else if (view.getId() == R.id.ResetB) {
            poinb = 0;
        }
        TextView tima = findViewById(R.id.poina);//pembuatan objek
        TextView timb = findViewById(R.id.poinb);
        tima.setText(String.valueOf(poina));
        timb.setText(String.valueOf(poinb));
    }
}
