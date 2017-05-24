package www.projetotaurus.com.br.jogodavelha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Final extends AppCompatActivity {

    String nome;
    TextView winner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        if(getIntent().getExtras().getString("nome1") != null) {
            nome = getIntent().getExtras().getString("nome1");
        }

        winner = (TextView) findViewById(R.id.nomewinner);

        winner.setText(nome+" é o ganhador!");

    }
}
