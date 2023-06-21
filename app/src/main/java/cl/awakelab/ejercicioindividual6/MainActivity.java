package cl.awakelab.ejercicioindividual6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText textName = findViewById(R.id.editTextNombre);
        EditText textLastName = findViewById(R.id.editTextApellido);
        EditText textEmail = findViewById(R.id.editTextEmail);
        EditText textPass = findViewById(R.id.editTextPassword);

        Button btnCreate = findViewById(R.id.button);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = textName.getText().toString();
                String lastName = textLastName.getText().toString();
                String email = textEmail.getText().toString();
                String pass = textPass.getText().toString();

                String texto = "Usuario: " + name + " " + lastName + " Email: " + email + " Contraseña: " + pass;

                if(name.isEmpty() || lastName.isEmpty() || email.isEmpty() || pass.isEmpty()) {
                    Toast.makeText(getBaseContext(), "Faltan campos por completar", Toast.LENGTH_LONG).show();
                }

                Toast.makeText(getBaseContext(), texto, Toast.LENGTH_LONG).show();

            }
        });

    }

}
