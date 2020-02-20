package br.com.sp.senac.appsistema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
    }

    public void AbrirNovaJanela(View view) {
        Intent abrirnova = new Intent(Login_Activity.this,Splash_Activity.class);
        startActivity(abrirnova);
    }


}
