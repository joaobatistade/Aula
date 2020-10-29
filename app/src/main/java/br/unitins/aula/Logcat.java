package br.unitins.aula;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;

public class Logcat extends Activity {

    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logcat);
        Log.d("APP", "onCreate()");

//        Log.i("APP", "Mensagem de INFO");
//        Log.d("APP", "Mensagem de DEBUNG");
//        Log.w("APP", "Mensagem de WARN");
//        Log.e("APP", "Mensagem de ERROR");
//        Log.v("APP", "Mensagem de VERBOSE");
    }

    public void nn(View view) {

        name = "Unitins";
        Log.d("APP", name);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {  //Método pra salva o que ta na tela antes de vira a tela
        super.onSaveInstanceState(outState);
        outState.putString("nome", name); //Salva o conteúdo que tá no atributo "name"

        Log.d("APP", "onSaveInstanceState()");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) { //Recupera a informação
        super.onRestoreInstanceState(savedInstanceState);

       name = savedInstanceState.getString("nome"); //Recupera o conteúdo que foi salvo

        Log.d("APP", "onRestoreInstanceState()");
        Log.d("APP", name);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("APP", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("APP", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("APP", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("APP", "onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("APP", "onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("APP", "onDestroy()");
    }

}