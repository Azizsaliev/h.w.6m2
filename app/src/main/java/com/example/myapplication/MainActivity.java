package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 private Button btn_1;
 private TextView first,second,third;
 private EditText edt1,edt2;

    @Override
    protected   void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_1 = findViewById(R.id.btn_1);
        first = findViewById(R.id.txt_view1);
        edt1 = findViewById(R.id.edt_1);
        edt2 = findViewById(R.id.edt_2);
        third = findViewById(R.id.txt_view3);


        edt1.setOnKeyListener((View.OnKeyListener) (view, i, keyEvent) -> {
            if (edt1.getText().toString().length() == 0) {
                btn_1.setBackgroundColor(getColor(R.color.gray));
            } else {
                btn_1.setBackgroundColor(getColor(R.color.orange));
            }
            return false;
        });
        btn_1.setOnClickListener(view -> {
            Toast toast = new Toast(MainActivity.this);
            if (edt1.getText().toString().equals("admin") && edt2.getText().toString().equals("admin")) {
                first.setVisibility(View.GONE);
                third.setVisibility(View.GONE);
                btn_1.setVisibility(View.GONE);
                edt1.setVisibility(View.GONE);
                edt2.setVisibility(View.GONE);

                toast.setText("Вы успешно зарегистрировались.");
            } else {
                toast.setText("Неправильный логин и пароль");
            }

            toast.show();
        });




    }
}