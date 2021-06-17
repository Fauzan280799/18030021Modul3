package com.example.a18030021modul3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    EditText tima;
    EditText timb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //untuk menampilkkan tampilan id
        findAllViewsId();
        button.setOnClickListener(this);
    }
    private void findAllViewsId() {
        button = (Button) findViewById(R.id.input);
        tima = (EditText) findViewById(R.id.tima);
        timb = (EditText) findViewById(R.id.timb);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);//untuk membuat obyek bundle dan menyisipkan tipe data string ke obyek
        Bundle bundle = new Bundle();
        bundle.putString("tima", tima.getText().toString());
        bundle.putString("timb", timb.getText().toString());
        intent.putExtras(bundle); //untuk menambahkan bundle intent
        startActivity(intent); //untu melakukkan proses menghubungkkan halaman selanjutnya
    }
}