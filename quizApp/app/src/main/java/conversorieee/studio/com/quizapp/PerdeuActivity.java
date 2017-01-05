package conversorieee.studio.com.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by Sergio on 29/12/2016.
 */

public class PerdeuActivity extends AppCompatActivity {

    private Button botaoMenu;
    private TextView perdeu;
    private String valor;

    private DatabaseReference databaseReferencia = FirebaseDatabase.getInstance().getReference();
    DatabaseReference loser = databaseReferencia.child("001");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perdeu);

        botaoMenu = (Button) findViewById(R.id.menuid);
        perdeu = (TextView) findViewById(R.id.perdeuid);


        loser.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                valor = dataSnapshot.getValue(String.class);
                Log.i("FIREBASE", valor);
                perdeu.setText(valor);
            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

                Log.w("ERRO", "Failed to read value.", databaseError.toException());
            }
        });







        botaoMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent meni = new Intent(PerdeuActivity.this, MainActivity.class);
                startActivity(meni);
                finish();

            }
        } );






    }
}
