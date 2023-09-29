package com.phuoc.songuyento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtso;
    Button ktra;

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);
        ktra = findViewById(R.id.kiemtra);
        edtso = findViewById(R.id.so);

        ktra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int dem = 0;
                int so = Integer.parseInt(String.valueOf(edtso.getText()));
                for (int i=1; i<=so; i++) {
                    if (so % i == 0 ) {
                        dem = dem + 1;
                    }
                }
                if (dem == 2) {
                    tv.setVisibility(View.VISIBLE);
                    tv.setText("Là số nguyên tố");
                } else {
                    tv.setVisibility(View.VISIBLE);
                    tv.setText("Không Là số nguyên tố");
                }
            }
        });
    }
}