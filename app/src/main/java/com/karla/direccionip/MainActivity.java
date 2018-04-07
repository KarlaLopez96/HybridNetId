package com.karla.direccionip;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import static java.lang.Math.pow;

public class MainActivity extends AppCompatActivity {
    EditText octal1, octal2, octal3, octal4, m;
    TextView nId1, nId2, nId3, nId4;

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

        final TextView broad1 = (TextView) findViewById(R.id.broadId1);
        final TextView broad2 = (TextView) findViewById(R.id.broadId2);
        final TextView broad3 = (TextView) findViewById(R.id.broadId3);
        final TextView broad4 = (TextView) findViewById(R.id.broadId4);

        final TextView host2 = (TextView) findViewById(R.id.host1);
        final TextView red = (TextView ) findViewById(R.id.broad4);
        final TextView host3 = (TextView) findViewById(R.id.broad5);

        botonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int mascara = Integer.valueOf(m.getText().toString());
                int o1 = Integer.valueOf(octal1.getText().toString());
                int o2 = Integer.valueOf(octal2.getText().toString());
                int o3 = Integer.valueOf(octal3.getText().toString());
                int o4 = Integer.valueOf(octal4.getText().toString());

                int[] mascaraDecimal = Mascara.plecaADecimal(mascara);

                //Calculando la net ID.
                int NetId_01 = o1 & mascaraDecimal[0];
                int NetId_02 = o2 & mascaraDecimal[1];
                int NetId_03 = o3 & mascaraDecimal[2];
                int NetId_04 = o4 & mascaraDecimal[3];

                nId1.setText(""+NetId_01);
                nId2.setText(""+NetId_02);
                nId3.setText(""+NetId_03);
                nId4.setText(""+NetId_04);

                //Calculando el broadcast.
                int broad_01 = (o1 | (255-mascaraDecimal[0]));
                int broad_02 = (o2 | (255-mascaraDecimal[1]));
                int broad_03 = (o3 | (255-mascaraDecimal[2]));
                int broad_04 = (o4 | (255-mascaraDecimal[3]));

                broad1.setText(""+broad_01);
                broad2.setText(""+broad_02);
                broad3.setText(""+broad_03);
                broad4.setText(""+broad_04);

                //Calculando el número de host disponibles.
                int host = (int) (pow(2,32-mascara)-2);
                host2.setText(""+host);

                //Calculando la parte de red y parte de host.
                switch (mascaraDecimal [4]){
                    case 0:
                        red.setText(o1+".x.x.x");
                        host3.setText("x."+o2+"."+o3+"."+o4);
                        break;

                    case 1:
                        red.setText(o1+"."+o2+".x.x");
                        host3.setText("x.x."+o3+"."+o4);
                        break;

                    case 2:
                        red.setText(o1+"."+o2+"."+o3+".x");
                        host3.setText("x.x.x."+o4);
                        break;
                }

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

                broad1.setText("");
                broad2.setText("");
                broad3.setText("");
                broad4.setText("");

                host2.setText("");

                nId1.setText("");
                nId2.setText("");
                nId3.setText("");
                nId4.setText("");

                red.setText("");
                host3.setText("");

            }
        });
    }

}
