package edu.uph.m24si2.kalkulator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.graphics.shapes.AngleMeasurer;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText edtAngka1, edtAngka2;
    private Button tambah, kurang, bagi;
    private TextView txvHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        edtAngka1=findViewById(R.id.edtAngka1);
        edtAngka2=findViewById(R.id.edtAngka2);
        tambah=findViewById(R.id.tambah);
        kurang=findViewById(R.id.kurang);
        bagi=findViewById(R.id.bagi);
        txvHasil=findViewById(R.id.txvHasil);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            int Angka1,Angka2;
            Double hasil;
            Angka1= Integer.parseInt(edtAngka1.getText().toString());
            Angka2= Integer.parseInt(edtAngka2.getText().toString());
            hasil=(double) (Angka1+Angka2);
            txvHasil.setText(("Hasil : "+hasil));
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            int Angka1,Angka2;
            Double hasil;
            Angka1= Integer.parseInt(edtAngka1.getText().toString());
            Angka2= Integer.parseInt(edtAngka2.getText().toString());
            hasil=(double) (Angka1-Angka2);
            txvHasil.setText("Hasil : "+hasil);
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Angka1, Angka2;
                Double hasil;
                Angka1= Integer.parseInt(edtAngka1.getText().toString());
                Angka2= Integer.parseInt(edtAngka2.getText().toString());
                hasil=(double) (Angka1/ Angka2);
                txvHasil.setText("Hasil : "+hasil);
            }
        });

    }
}