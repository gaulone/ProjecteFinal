package cat.copernic.projectefinal;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;


public class ActivityCrear extends ActionBarActivity {

    Usuario user;

    CheckBox modificar, crear, persianaGaraje, calefaccion, aireAcondicionado;
    EditText nombre,password;
    Button buttonCrear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear);


        nombre=(EditText)findViewById(R.id.textoNombre);
        password=(EditText)findViewById(R.id.textoPassword);

        modificar = (CheckBox) findViewById(R.id.checkBoxModificar);
        crear = (CheckBox)findViewById(R.id.checkBoxCrear);
        persianaGaraje = (CheckBox) findViewById(R.id.checkBoxGaraje);
        calefaccion = (CheckBox)findViewById(R.id.checkBoxCalefaccion);
        aireAcondicionado = (CheckBox) findViewById(R.id.checkBoxAire);

        buttonCrear=(Button) findViewById(R.id.buttonCrear);

        buttonCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_crear, menu);


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
}
