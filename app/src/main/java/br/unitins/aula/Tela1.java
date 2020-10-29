package br.unitins.aula;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Tela1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        String nn = getIntent().getStringExtra("nome");

        Toast.makeText(this, nn, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();

        Intent intent = new Intent();
        intent.putExtra("estado", "TO");

        setResult(RESULT_OK, intent);
        finish();

    }
}