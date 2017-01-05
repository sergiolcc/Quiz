package conversorieee.studio.com.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.AbstractCollection;

/**
 * Created by Sergio on 29/12/2016.
 */

public class Pergunta3Activity extends AppCompatActivity {

    private TextView pergunta3;
    private Button riade;
    private Button damasco;
    private Button teera;
    private Button bagda;


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta3);


        pergunta3 = (TextView) findViewById(R.id.pergunta3id);
        riade = (Button) findViewById(R.id.riadeid);
        damasco = (Button) findViewById(R.id.damascoid);
        teera = (Button) findViewById(R.id.teerãid);
        bagda = (Button) findViewById(R.id.bagdaid);

        Dados dados = new Dados();

        dados.setPergunta("Qual a capital do Irã?");
        dados.setOpt1("Riade");
        dados.setOpt2("Damasco");
        dados.setOpt3("Teerâ");
        dados.setOpt4("Bagdá");

        pergunta3.setText(dados.getPergunta());
        riade.setText(dados.getOpt1());
        damasco.setText(dados.getOpt2());
        teera.setText(dados.getOpt3());
        bagda.setText(dados.getOpt4());




        riade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent perdio = new Intent(Pergunta3Activity.this, PerdeuActivity.class);
                startActivity(perdio);
                finish();

            }
        });

        damasco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent perdi = new Intent(Pergunta3Activity.this, PerdeuActivity.class);
                startActivity(perdi);
                finish();

            }
        });

        teera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent won = new Intent(Pergunta3Activity.this, VictoryActivity.class);
                startActivity(won);
                finish();
            }
        });

        bagda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent perdo = new Intent(Pergunta3Activity.this, PerdeuActivity.class);
                startActivity(perdo);
                finish();

            }
        });




    }
}
