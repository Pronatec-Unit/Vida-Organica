package br.com.vidaorganica.vidaorganica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivitycentro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_centro);

        Button sair = (Button) findViewById(R.id.buttonSair);

        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivitycentro.this,MainActivityListaFeiraOrganizadas.class);
                startActivity(intent);

                MainActivitycentro.this.finish();
            }
        });
    }
}
