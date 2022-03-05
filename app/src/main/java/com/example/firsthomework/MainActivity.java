package com.example.firsthomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editNumber, editEmail, editPassword;
    private ImageView imageView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNumber = findViewById(R.id.et_input_number);
        editEmail = findViewById(R.id.et_input_mail);
        editPassword = findViewById(R.id.et_input_password);
        button = findViewById(R.id.btn_submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editNumber.length() != 9) {
                    editNumber.setError("Введите номер равный 9 символам");
                    Toast.makeText(MainActivity.this, "Введите номер равный 9 символам", Toast.LENGTH_SHORT).show();
                }else {
                    editNumber.getText().clear();
                    editEmail.getText().clear();
                    editPassword.getText().clear();
                    Toast.makeText(MainActivity.this, "Успешно!", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
}