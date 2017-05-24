package www.projetotaurus.com.br.jogodavelha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Nomes extends AppCompatActivity implements View.OnClickListener{

    EditText nome1;
    EditText nome2;
    Button   jogar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nomes);

        nome1 = (EditText)findViewById(R.id.editnome1);
        nome2 = (EditText)findViewById(R.id.editnome2);
        jogar = (Button)findViewById(R.id.botaoenviar);

        jogar.setOnClickListener(this);

    }


    public void onClick(View v){
        switch (v.getId()) {
            case R.id.botaoenviar:
                if(nome1.getText().toString().trim().equals("") || nome2.getText().toString().trim().equals("")) {
                    if (nome1.getText().toString().trim().equals("")) {
                        nome1.setError("Digite o nome do jogador!");
                    }
                    if (nome2.getText().toString().trim().equals("")) {
                        nome2.setError("Digite o nome do jogador!");
                    }
                }else {
                    Intent intent = new Intent(this, Jogo.class);
                    Bundle extras = new Bundle();
                    extras.putString("nome1", nome1.getText().toString());
                    extras.putString("nome2", nome2.getText().toString());
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                break;
        }
    }
}
