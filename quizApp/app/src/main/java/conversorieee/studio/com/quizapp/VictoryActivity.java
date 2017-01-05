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

public class VictoryActivity extends AppCompatActivity {


    private Button botaoMenu2;
    private TextView venceu;
    private String vitoria;

    private DatabaseReference databaseReferencia = FirebaseDatabase.getInstance().getReference();
    DatabaseReference win = databaseReferencia.child("002");


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_victory);

        botaoMenu2 = (Button) findViewById(R.id.menupid);
        venceu = (TextView) findViewById(R.id.venceuid);

        win.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                vitoria = dataSnapshot.getValue(String.class);
                Log.i("FIREBASE", vitoria);
                venceu.setText(vitoria);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

                Log.w("ERRO", "Failed to read value.", databaseError.toException());

            }
        });






        botaoMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent men = new Intent(VictoryActivity.this, MainActivity.class);
                startActivity(men);
                finish();
            }
        });

    }
}
