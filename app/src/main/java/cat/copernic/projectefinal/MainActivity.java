package cat.copernic.projectefinal;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class MainActivity extends ActionBarActivity {

    public Usuario user;
    EditText usuario;
    EditText contraseña;
    Button acceder;
    TextView errores;

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


    //Leer ficheros
    public void leerFichero(String archivo) throws FileNotFoundException, IOException {
        String cadena;
/*
         File dir = new File(getFilesDir() +"/app/src/main/java/cat/copernic");
        dir.mkdirs(); //create folders where write files
         File file = new File(dir, "Config.txt");*/

        BufferedReader fin =
                new BufferedReader(
                        new InputStreamReader(
                                openFileInput(archivo)));

        String texto = fin.readLine();
        while((cadena = fin.readLine())!=null) {
           // System.out.println(cadena);
          //  contraseña.setText(cadena);
        }
        fin.close();
    }


    public void OnClickAcceder (View view) {


         user=new Usuario(usuario.getText().toString(),contraseña.getText().toString(),true,true);

        errores.setText("ok: "+user);

        Intent i = new Intent(this, MainActivityDrawer.class );
        i.putExtra("usuario", user);
        startActivity(i);

    }

}
