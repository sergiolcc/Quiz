package conversorieee.studio.com.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Sergio on 29/12/2016.
 */

public class Pergunta2Acitivity extends AppCompatActivity {

    private TextView pergunta2;
    private Button opç1;
    private Button opç2;
    private Button opç3;
    private Button opç4;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta2);

        pergunta2 = (TextView) findViewById(R.id.pergunta2id);
        opç1 = (Button) findViewById(R.id.opç1id);
        opç2 = (Button) findViewById(R.id.opç2id);
        opç3 = (Button) findViewById(R.id.opç3id);
        opç4 = (Button) findViewById(R.id.opç4id);

        Dados dados = new Dados();

        dados.setPergunta("Qual o nome do sistema de encriptação nazista conhecido pela sua eficiência durante a segunda guerra mundial?");
        dados.setOpt1("Enigma");
        dados.setOpt2("Albus");
        dados.setOpt3("Puzzle");
        dados.setOpt4("Reich");

        pergunta2.setText(dados.getPergunta());
        opç1.setText(dados.getOpt1());
        opç2.setText(dados.getOpt2());
        opç3.setText(dados.getOpt3());
        opç4.setText(dados.getOpt4());



        opç1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent next = new Intent(Pergunta2Acitivity.this, Pergunta3Activity.class);
                startActivity(next);
                finish();
            }
        });

        opç2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent back = new Intent(Pergunta2Acitivity.this, PerdeuActivity.class);
                startActivity(back);
                finish();

            }
        });

        opç3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent volta = new Intent(Pergunta2Acitivity.this, PerdeuActivity.class);
                startActivity(volta);
                finish();
            }
        });

        opç4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bak = new Intent(Pergunta2Acitivity.this, PerdeuActivity.class);
                startActivity(bak);
                finish();

            }
        });

    }
}
