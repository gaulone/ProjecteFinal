package cat.copernic.projectefinal;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class MainActivity extends ActionBarActivity {

    public Usuario user;
    EditText usuario;
    EditText contraseña;
    Button acceder;
    TextView errores;

    String luces = null;
    String temp = null;
    String pers = null;
    String cal = null;
    String aire = null;
    String confirm = "dddd";



    final static String LOCALHOST_PC = "192.168.43.87";
    final static int PORT = 39168;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = (EditText) findViewById(R.id.EDUsuario);
        contraseña = (EditText) findViewById(R.id.EDContraseña);
        acceder = (Button) findViewById(R.id.BotonAcceder);
        errores = (TextView) findViewById(R.id.textViewError);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }







    public void OnClickAcceder (View view) {

        confirm = "novalido";

        new AsyncTask<Object, Void, String>() {
            @Override
            protected String doInBackground(Object... params) {
                String s = "";

                String host = (String) params[0];
                Integer port = (Integer) params[1];

                try {
                    Socket client = new Socket(host, port);

                    //ENVIAR
                    try {
                        PrintWriter writer = new PrintWriter(client.getOutputStream(), true);
                        String s2 = "1";
                        writer.println(s2);
                        writer.flush();
                        writer.println(usuario.getText().toString());
                        writer.flush();
                        writer.println(contraseña.getText().toString());
                        writer.flush();
                        //s = "okk";

                    }catch(Exception e2){
                        e2.printStackTrace();
                    }
                    //RECIBIR
                    //s = "Conexion Completa";


                    //InputStream stream = null;
                    try {
                        BufferedReader reader = new BufferedReader((new InputStreamReader(client.getInputStream())));

                        luces = reader.readLine();
                        temp = reader.readLine();
                        pers = reader.readLine();
                        cal = reader.readLine();
                        aire = reader.readLine();
                        confirm = reader.readLine();
                        s = confirm;
                    }catch(Exception e3){
                        e3.printStackTrace();
                        s="sin readline";
                    }
                    client.close();
                } catch (Exception e) {
                    e.printStackTrace();
                    s = "sin conexion";
                }


                return s;
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                //Toast.makeText(getBaseContext(), s, Toast.LENGTH_LONG).show();



                boolean b = Boolean.parseBoolean(s);


                if(b) {

                    boolean luz = Boolean.parseBoolean(luces);
                    boolean tem = Boolean.parseBoolean(temp);
                    boolean per = Boolean.parseBoolean(pers);
                    boolean cale = Boolean.parseBoolean(cal);
                    boolean acon = Boolean.parseBoolean(aire);

                    user=new Usuario(usuario.getText().toString(),contraseña.getText().toString(),luz,tem,per,cale,acon);

                    //errores.setText(confirm + user);


                    Intent i = new Intent(getBaseContext(), MainActivityDrawer.class);
                    i.putExtra("usuario", user);
                    startActivity(i);
                }else{
                    Toast.makeText(getBaseContext(),"Usuario no valido",Toast.LENGTH_LONG).show();
                    //errores.setText(confirm + user);
                }




            }
        }.execute(LOCALHOST_PC, PORT);



    }

}
