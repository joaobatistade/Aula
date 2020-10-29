package br.unitins.aula;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

       /*
        TextView view = new TextView(this);
        view.setText("João");
        setContentView(view);
        */
    }

    public void next1(View view) {

        Intent intent = new Intent(getApplicationContext(), Tela1.class);
//        intent.putExtra("nome", "UNITINS");

        startActivityForResult(intent, 5);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 5){
            String estado = data.getStringExtra("estado");

            Toast.makeText(this, estado, Toast.LENGTH_LONG).show();
        }
    }

}