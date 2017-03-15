package com.example.aluno.login;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener/*AppCompatActivity*/ {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Maneira 1 metodo listener
        Button btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(onClickBtLogin());

        //Maneira 2 xml
        Button btLoginxml = (Button) findViewById(R.id.btLoginxml);
        //btLoginxml.setOnClickListener(this);

        //Maneira 3 A CLASSE IMPLEMENTA AUTOMATICAMENTE VIEW.ONCLICKLISTENER
        Button btLoginAutoImplement = (Button) findViewById(R.id.btLoginAutoImplement);
        btLoginAutoImplement.setOnClickListener(this);

        //Maneira 4 ANONIMO
        Button btLoginAnonimo = (Button) findViewById(R.id.btLoginAnonimo);
        btLoginAnonimo.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v) {
                TextView tLogin = (TextView) findViewById(R.id.tLogin);
                TextView tSenha = (TextView) findViewById(R.id.tSenha);
                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();
                if("willian".equals(login) && "123".equals(senha)){
                    alert("metodo onClick anonimo Bem Vindo, login efetuado com sucesso.");
                }else {
                    alert("metodo onClick anonimo Login ou senha incorretos.");
                }
            }
        });
    }
    //@Override
    private View.OnClickListener onClickBtLogin(){//segundo a professora é o melhor método
        return new Button.OnClickListener(){
            public void onClick(View v){
                TextView tLogin = (TextView) findViewById(R.id.tLogin);
                TextView tSenha = (TextView) findViewById(R.id.tSenha);
                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();

                if("Willian Lauber".equals(login) && "123".equals(senha)){
                    alert("Bem Vindo, login efetuado com sucesso.");

                }else{
                    alert("Login ou senha incorretos. "+login);
                }
            }
        };
    }
    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btLoginAutoImplement){
            TextView tLogin = (TextView) findViewById(R.id.tLogin);
            TextView tSenha = (TextView) findViewById(R.id.tSenha);
            String login = tLogin.getText().toString();
            String senha = tSenha.getText().toString();
            if("willian".equals(login) && "123".equals(senha)){
                alert("metodo onClick automatico Bem Vindo, login efetuado com sucesso.");
            }else{
                alert("metodo onClick automatico Login ou senha incorretos.");
            }
        }
    }
    private void alert(String s){
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }
    public void onClickXml(View v) {
        TextView tLogin = (TextView) findViewById(R.id.tLogin);
        TextView tSenha = (TextView) findViewById(R.id.tSenha);
        String login = tLogin.getText().toString();
        String senha = tSenha.getText().toString();
        if("willian".equals(login) && "123".equals(senha)){
            alert("metodo onClick manual Bem Vindo, login efetuado com sucesso.");
        }else{
            alert("m.todo onClick manual Login ou senha incorretos.");
        }
    }
}
