package www.projetotaurus.com.br.jogodavelha;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Jogo extends AppCompatActivity implements View.OnClickListener{
    Integer cont = 1;


    String nome2;
    String nome1;

    Button position1;
    Button position2;
    Button position3;
    Button position4;
    Button position5;
    Button position6;
    Button position7;
    Button position8;
    Button position9;
    Button voltar;
    Button reiniciar;
    TextView time;

    Integer randomNum;

    String jogadorx;
    String jogadoro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);

        if(getIntent().getExtras().getString("nome1") != null) {
            nome1 = getIntent().getExtras().getString("nome1");
        }
        if(getIntent().getExtras().getString("nome2") != null) {
            nome2 = getIntent().getExtras().getString("nome2");
        }

         randomNum = 1 + (int)(Math.random() * 2);


        if(randomNum == 1){
            jogadorx = nome1;
            jogadoro = nome2;
        }else if(randomNum == 2){
            jogadorx = nome2;
            jogadoro = nome1;
        }



        position1 = (Button)findViewById(R.id.pos1);
        position2 = (Button)findViewById(R.id.pos2);
        position3 = (Button)findViewById(R.id.pos3);
        position4 = (Button)findViewById(R.id.pos4);
        position5 = (Button)findViewById(R.id.pos5);
        position6 = (Button)findViewById(R.id.pos6);
        position7 = (Button)findViewById(R.id.pos7);
        position8 = (Button)findViewById(R.id.pos8);
        position9 = (Button)findViewById(R.id.pos9);
        time      = (TextView)findViewById(R.id.TextVez);

        voltar = (Button)findViewById(R.id.voltar);
        reiniciar = (Button)findViewById(R.id.reiniciar);

        position1.setText("  ");
        position2.setText("  ");
        position3.setText("  ");
        position4.setText("  ");
        position5.setText("  ");
        position6.setText("  ");
        position7.setText("  ");
        position8.setText("  ");
        position9.setText("  ");

        position1.setOnClickListener(this);
        position2.setOnClickListener(this);
        position3.setOnClickListener(this);
        position4.setOnClickListener(this);
        position5.setOnClickListener(this);
        position6.setOnClickListener(this);
        position7.setOnClickListener(this);
        position8.setOnClickListener(this);
        position9.setOnClickListener(this);

        voltar.setOnClickListener(this);
        reiniciar.setOnClickListener(this);
        time.setText("Vez de "+jogadorx);
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.pos1:
            if(position1.getText().equals("  ")){
                if(cont == 1 || cont == 3 || cont == 5 || cont == 7 || cont == 9){
                    position1.setText("X");
                    cont++;
                    time.setText("Vez de "+jogadoro);
                    if(verificaganhador("X")){
                        troca(jogadorx);
                    }
                    checavelha();
                }else{
                    position1.setText("O");
                    cont++;
                    time.setText("Vez de "+jogadorx);
                    if(verificaganhador("O")){
                        troca(jogadoro);
                    }
                    checavelha();
                }

            }
            break;

            case R.id.pos2:
                if(position2.getText().equals("  ")){
                    if(cont == 1 || cont == 3 || cont == 5 || cont == 7 || cont == 9){
                        position2.setText("X");
                        cont++;
                        time.setText("Vez de "+jogadoro);
                        if(verificaganhador("X")){
                            troca(jogadorx);
                        }
                        checavelha();
                    }else {
                        position2.setText("O");
                        cont++;
                        time.setText("Vez de "+jogadorx);
                        if(verificaganhador("O")){
                            troca(jogadoro);
                        }
                        checavelha();
                    }
                }
                break;

            case R.id.pos3:
                if(position3.getText().equals("  ")){
                    if(cont == 1 || cont == 3 || cont == 5 || cont == 7 || cont == 9){
                        position3.setText("X");
                        cont++;
                        time.setText("Vez de "+jogadoro);
                        if(verificaganhador("X")){
                            troca(jogadorx);
                        }
                        checavelha();
                    }else{
                        position3.setText("O");
                        cont++;
                        time.setText("Vez de "+jogadorx);
                        if(verificaganhador("O")){
                            troca(jogadoro);
                        }
                        checavelha();
                    }
                }
                break;


            case R.id.pos4:
                if(position4.getText().equals("  ")){
                    if(cont == 1 || cont == 3 || cont == 5 || cont == 7 || cont == 9){
                        position4.setText("X");
                        cont++;
                        time.setText("Vez de "+jogadoro);
                        if(verificaganhador("X")){
                            troca(jogadorx);
                        }
                    }else{
                        position4.setText("O");
                        cont++;
                        time.setText("Vez de "+jogadorx);
                        if(verificaganhador("O")){
                            troca(jogadoro);
                        }
                        checavelha();
                    }

                }
                break;

            case R.id.pos5:
                if(position5.getText().equals("  ")){
                    if(cont == 1 || cont == 3 || cont == 5 || cont == 7 || cont == 9){
                        position5.setText("X");
                        cont++;
                        time.setText("Vez de "+jogadoro);
                        if(verificaganhador("X")){
                            troca(jogadorx);
                        }
                        checavelha();
                    }else{
                        position5.setText("O");
                        cont++;
                        time.setText("Vez de "+jogadorx);
                        if(verificaganhador("O")){
                            troca(jogadoro);
                        }
                        checavelha();
                    }

                }
                break;

            case R.id.pos6:
                if(position6.getText().equals("  ")){
                    if(cont == 1 || cont == 3 || cont == 5 || cont == 7 || cont == 9){
                        position6.setText("X");
                        cont++;
                        time.setText("Vez de "+jogadoro);
                        if(verificaganhador("X")){
                            troca(jogadorx);
                        }
                        checavelha();
                    }else{
                        position6.setText("O");
                        cont++;
                        time.setText("Vez de "+jogadorx);
                        if(verificaganhador("O")){
                            troca(jogadoro);
                        }
                        checavelha();
                    }

                }
                break;

            case R.id.pos7:
                if(position7.getText().equals("  ")){
                    if(cont == 1 || cont == 3 || cont == 5 || cont == 7 || cont == 9){
                        position7.setText("X");
                        cont++;
                        time.setText("Vez de "+jogadoro);
                        if(verificaganhador("X")){
                            troca(jogadorx);
                        }
                        checavelha();
                    }else{
                        position7.setText("O");
                        cont++;
                        time.setText("Vez de "+jogadorx);
                        if(verificaganhador("O")){
                            troca(jogadoro);
                        }
                        checavelha();
                    }

                }
                break;

            case R.id.pos8:
                if(position8.getText().equals("  ")){
                    if(cont == 1 || cont == 3 || cont == 5 || cont == 7 || cont == 9){
                        position8.setText("X");
                        cont++;
                        time.setText("Vez de "+jogadoro);
                        if(verificaganhador("X")){
                            troca(jogadorx);
                        }
                        checavelha();
                    }else{
                        position8.setText("O");
                        cont++;
                        time.setText("Vez de "+jogadorx);
                        if(verificaganhador("O")){
                            troca(jogadoro);

                        }
                        checavelha();
                    }

                }
                break;

            case R.id.pos9:
                if(position9.getText().equals("  ")){
                    if(cont == 1 || cont == 3 || cont == 5 || cont == 7 || cont == 9){
                        position9.setText("X");
                        cont++;
                        time.setText("Vez de "+jogadoro);
                        if(verificaganhador("X")){
                            troca(jogadorx);
                        }
                        checavelha();
                    }else{
                        position9.setText("O");
                        cont++;
                        time.setText("Vez de "+jogadorx);
                        if(verificaganhador("O")){
                            troca(jogadoro);
                        }
                        checavelha();
                    }

                }
                break;

            case R.id.reiniciar:
                reiniciar();
                break;

            case R.id.voltar:
                voltar();
                break;
        }
    }

    public boolean verificaganhador(String player){
        if(position1.getText().equals(player) && position2.getText().equals(player) && position3.getText().equals(player)){
            position1.setTextColor(Color.parseColor("#0000FF"));
            position2.setTextColor(Color.parseColor("#0000FF"));
            position3.setTextColor(Color.parseColor("#0000FF"));
            retornavencedor(player);
            return true;

        }

        if(position4.getText().equals(player) && position5.getText().equals(player) && position6.getText().equals(player)){
            position4.setTextColor(Color.parseColor("#0000FF"));
            position5.setTextColor(Color.parseColor("#0000FF"));
            position6.setTextColor(Color.parseColor("#0000FF"));
            retornavencedor(player);
            return true;
        }

        if(position7.getText().equals(player) && position8.getText().equals(player) && position9.getText().equals(player)){
            position7.setTextColor(Color.parseColor("#0000FF"));
            position8.setTextColor(Color.parseColor("#0000FF"));
            position9.setTextColor(Color.parseColor("#0000FF"));
            retornavencedor(player);
            return true;
        }

        if(position1.getText().equals(player) && position4.getText().equals(player) && position7.getText().equals(player)){
            position1.setTextColor(Color.parseColor("#0000FF"));
            position4.setTextColor(Color.parseColor("#0000FF"));
            position7.setTextColor(Color.parseColor("#0000FF"));
            retornavencedor(player);
            return true;
        }

        if(position2.getText().equals(player) && position5.getText().equals(player) && position8.getText().equals(player)){
            position2.setTextColor(Color.parseColor("#0000FF"));
            position5.setTextColor(Color.parseColor("#0000FF"));
            position8.setTextColor(Color.parseColor("#0000FF"));
            retornavencedor(player);
            return true;
        }

        if(position3.getText().equals(player) && position6.getText().equals(player) && position9.getText().equals(player)){
            position3.setTextColor(Color.parseColor("#0000FF"));
            position6.setTextColor(Color.parseColor("#0000FF"));
            position9.setTextColor(Color.parseColor("#0000FF"));
            retornavencedor(player);
            return true;
        }

        if(position3.getText().equals(player) && position5.getText().equals(player) && position7.getText().equals(player)){
            position3.setTextColor(Color.parseColor("#0000FF"));
            position5.setTextColor(Color.parseColor("#0000FF"));
            position7.setTextColor(Color.parseColor("#0000FF"));
            retornavencedor(player);
            return true;
        }

        if(position1.getText().equals(player) && position5.getText().equals(player) && position9.getText().equals(player)) {
            position1.setTextColor(Color.parseColor("#0000FF"));
            position5.setTextColor(Color.parseColor("#0000FF"));
            position9.setTextColor(Color.parseColor("#0000FF"));
            retornavencedor(player);
            return true;
        }


        return false;
    }

    public void troca(String jogador){

    }

    public boolean checavelha(){
        if(cont == 10 && !verificaganhador("X") && !verificaganhador("O")) {
            //Toast.makeText(getApplicationContext(),"fadsa",Toast.LENGTH_LONG).show();
            AlertDialog ad = new AlertDialog.Builder(this)
                    .setMessage("Todos os movimentos possíveis foram realizados, o jogo deu velha!").setNegativeButton("REINICIAR", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int whichButton) {
                            position1.setTextColor(Color.parseColor("#000000"));
                            position2.setTextColor(Color.parseColor("#000000"));
                            position3.setTextColor(Color.parseColor("#000000"));
                            position4.setTextColor(Color.parseColor("#000000"));
                            position5.setTextColor(Color.parseColor("#000000"));
                            position6.setTextColor(Color.parseColor("#000000"));
                            position7.setTextColor(Color.parseColor("#000000"));
                            position8.setTextColor(Color.parseColor("#000000"));
                            position9.setTextColor(Color.parseColor("#000000"));
                            position1.setText("  ");
                            position2.setText("  ");
                            position3.setText("  ");
                            position4.setText("  ");
                            position5.setText("  ");
                            position6.setText("  ");
                            position7.setText("  ");
                            position8.setText("  ");
                            position9.setText("  ");
                            cont = 1;
                        }
                    })
                    .setCancelable(false)
                    .create();
            ad.show();

            return true;
        }else{
            return false;
        }
    }
    public void retornavencedor(String jogador){
        AlertDialog ad = new AlertDialog.Builder(this)
        .setMessage("O jogador "+jogador+" ganhou \n"+(cont - 1)+" movimentos foram realizados").setNegativeButton("REINICIAR", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        position1.setTextColor(Color.parseColor("#000000"));
                        position2.setTextColor(Color.parseColor("#000000"));
                        position3.setTextColor(Color.parseColor("#000000"));
                        position4.setTextColor(Color.parseColor("#000000"));
                        position5.setTextColor(Color.parseColor("#000000"));
                        position6.setTextColor(Color.parseColor("#000000"));
                        position7.setTextColor(Color.parseColor("#000000"));
                        position8.setTextColor(Color.parseColor("#000000"));
                        position9.setTextColor(Color.parseColor("#000000"));
                        position1.setText("  ");
                        position2.setText("  ");
                        position3.setText("  ");
                        position4.setText("  ");
                        position5.setText("  ");
                        position6.setText("  ");
                        position7.setText("  ");
                        position8.setText("  ");
                        position9.setText("  ");
                        cont = 1;
                    }
                })
        .setCancelable(false)
        .create();
        ad.show();
    }

    public void reiniciar(){
        position1.setTextColor(Color.parseColor("#000000"));
        position2.setTextColor(Color.parseColor("#000000"));
        position3.setTextColor(Color.parseColor("#000000"));
        position4.setTextColor(Color.parseColor("#000000"));
        position5.setTextColor(Color.parseColor("#000000"));
        position6.setTextColor(Color.parseColor("#000000"));
        position7.setTextColor(Color.parseColor("#000000"));
        position8.setTextColor(Color.parseColor("#000000"));
        position9.setTextColor(Color.parseColor("#000000"));
        position1.setText("  ");
        position2.setText("  ");
        position3.setText("  ");
        position4.setText("  ");
        position5.setText("  ");
        position6.setText("  ");
        position7.setText("  ");
        position8.setText("  ");
        position9.setText("  ");
        cont = 1;
    }

    public void voltar(){
        finish();
    }

}
