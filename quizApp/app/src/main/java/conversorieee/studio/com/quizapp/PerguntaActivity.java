package conversorieee.studio.com.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Sergio on 25/12/2016.
 */

public class PerguntaActivity extends AppCompatActivity {

    private TextView pergunt;
    private Button opti1;
    private Button opti2;
    private Button opti3;
    private Button opti4;
    Dados dados = new Dados();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta);

        pergunt = (TextView) findViewById(R.id.perguntaid);
        opti1 = (Button) findViewById(R.id.button1id);
        opti2 = (Button) findViewById(R.id.button2id);
        opti3 = (Button) findViewById(R.id.button3id);
        opti4 = (Button) findViewById(R.id.button4id);


        dados.setPergunta("Qual o nome da cerimônia pelo qual novos papas são escolhidos?");
        dados.setOpt1("Conclave");
        dados.setOpt2("Cardus");
        dados.setOpt3("Votação Clericaniana");
        dados.setOpt4("Votação Clérica");


        pergunt.setText(dados.getPergunta());
        opti1.setText(dados.getOpt1());
        opti2.setText(dados.getOpt2());
        opti3.setText(dados.getOpt3());
        opti4.setText(dados.getOpt4());


        opti1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent seg = new Intent(PerguntaActivity.this, Pergunta2Acitivity.class);
                startActivity(seg);
                finish();
            }
        });

        opti2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent perd = new Intent(PerguntaActivity.this, PerdeuActivity.class);
                startActivity(perd);
                finish();

            }
        });


        opti3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent der = new Intent(PerguntaActivity.this, PerdeuActivity.class);
                startActivity(der);
                finish();

            }
        });

        opti4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent lost = new Intent(PerguntaActivity.this, PerdeuActivity.class);
                startActivity(lost);
                finish();
            }
        });


    }
}
