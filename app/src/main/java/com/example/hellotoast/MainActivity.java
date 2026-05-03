package com.example.hellotoast;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Liaison m3a les composants XML
        EditText inputSurface = findViewById(R.id.input_surface);
        EditText inputPieces = findViewById(R.id.input_pieces);
        CheckBox checkPiscine = findViewById(R.id.checkbox_piscine);
        Button buttonCalcul = findViewById(R.id.button_calcul);
        TextView result = findViewById(R.id.result);

        buttonCalcul.setOnClickListener(v -> {

            // Validation
            if (inputSurface.getText().toString().isEmpty() ||
                    inputPieces.getText().toString().isEmpty()) {

                Toast.makeText(this,
                        "Veuillez remplir tous les champs",
                        Toast.LENGTH_SHORT).show();
                return;
            }

            // Récupération des valeurs
            double surface = Double.parseDouble(inputSurface.getText().toString());
            int pieces = Integer.parseInt(inputPieces.getText().toString());
            boolean hasPiscine = checkPiscine.isChecked();

            // Calcul
            double impotBase = surface * 2.0;          // 2 dh / m²
            double impotSupp = pieces * 75.0;          // 75 dh / pièce
            double impotPiscine = hasPiscine ? 100.0 : 0.0;
            double total = impotBase + impotSupp + impotPiscine;

            // Affichage
            String resultat = "Impôt de base : " + impotBase + "\n" +
                    "Impôt supplémentaire : " + impotSupp + "\n" +
                    "Impôt Total : " + total;

            result.setText(resultat);
        });
    }
}