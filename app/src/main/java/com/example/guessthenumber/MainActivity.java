package com.example.guessthenumber;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Local variables for UI components
        EditText editGuessInput = findViewById(R.id.editGuessInput);
        Button buttonGuess = findViewById(R.id.buttonGuess);
        Button buttonReset = findViewById(R.id.buttonReset);
        TextView textResultView = findViewById(R.id.textResultView);

        // Generate first random number
        generateRandomNumber();

        // Guess button click (using lambda)
        buttonGuess.setOnClickListener(view -> {
            String input = editGuessInput.getText().toString().trim();

            if (input.isEmpty()) {
                Toast.makeText(MainActivity.this,
                        getString(R.string.toast_enter_number),
                        Toast.LENGTH_SHORT).show();
                return;
            }

            int guess = Integer.parseInt(input);

            if (guess < randomNumber) {
                textResultView.setText(getString(R.string.result_too_low));
            } else if (guess > randomNumber) {
                textResultView.setText(getString(R.string.result_too_high));
            } else {
                textResultView.setText(getString(R.string.result_correct));
            }

            editGuessInput.setText(""); // Clear input
        });

        // Reset button click (using lambda)
        buttonReset.setOnClickListener(view -> {
            generateRandomNumber();
            textResultView.setText("");
            editGuessInput.setText("");
            Toast.makeText(MainActivity.this,
                    getString(R.string.toast_new_game),
                    Toast.LENGTH_SHORT).show();
        });
    }

    // Generate a random number between 1 and 100
    private void generateRandomNumber() {
        randomNumber = new Random().nextInt(100) + 1;
    }
}
