package com.karla.direccionip;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText octal1, octal2, octal3, octal4, m;
    TextView nId1, nId2, nId3, nId4;
    TextView mask1, mask2, mask3, mask4;
    int m1, m2, m3, m4;
    float x, y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        octal1 = (EditText) findViewById(R.id.Oct1);
        octal2 = (EditText) findViewById(R.id.Oct2);
        octal3 = (EditText) findViewById(R.id.Oct3);
        octal4 = (EditText) findViewById(R.id.Oct4);
        m = (EditText) findViewById(R.id.mask);

        Button botonCalcular = findViewById(R.id.btnCalcular);
        ImageButton botonLimpiar = findViewById(R.id.btnLimpiar);

        final TextView nId1 = (TextView) findViewById(R.id.NetID1);
        final TextView nId2 = (TextView) findViewById(R.id.NetID2);
        final TextView nId3 = (TextView) findViewById(R.id.NetID3);
        final TextView nId4 = (TextView) findViewById(R.id.NetID4);

        final TextView mask1 = (TextView) findViewById(R.id.M1);
        final TextView mask2 = (TextView) findViewById(R.id.M2);
        final TextView mask3 = (TextView) findViewById(R.id.M3);
        final TextView mask4 = (TextView) findViewById(R.id.M4);

        botonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int mascara = Integer.valueOf(m.getText().toString());
                int o1 = Integer.valueOf(octal1.getText().toString());
                int o2 = Integer.valueOf(octal2.getText().toString());
                int o3 = Integer.valueOf(octal3.getText().toString());
                int o4 = Integer.valueOf(octal4.getText().toString());


                int[] mascaraDecimal = Mascara.plecaADecimal(mascara);

                int NetId_01 = o1 & mascaraDecimal[0];
                int NetId_02 = o2 & mascaraDecimal[1];
                int NetId_03 = o3 & mascaraDecimal[2];
                int NetId_04 = o4 & mascaraDecimal[3];

                int broad_01 = NetId_01 ^ (~mascaraDecimal[0]);
                int broad_02 = NetId_02 ^ (~mascaraDecimal[1]);
                int broad_03 = NetId_03 ^ (~mascaraDecimal[2]);
                int broad_04 = NetId_04 ^ (~mascaraDecimal[3]);



            }
        });

        botonLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                octal1.setText("");
                octal2.setText("");
                octal3.setText("");
                octal4.setText("");
                m.setText("");

                mask1.setText("");
                mask2.setText("");
                mask3.setText("");
                mask4.setText("");

                nId1.setText("");
                nId2.setText("");
                nId3.setText("");
                nId4.setText("");


            }
        });
    }

}
