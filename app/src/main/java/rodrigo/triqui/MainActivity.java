package rodrigo.triqui;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity implements DialogInterface.OnClickListener{
    int [] tablero = new  int[9];
    ImageView uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve;
    boolean gana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uno = (ImageView) findViewById(R.id.uno);
        dos = (ImageView) findViewById(R.id.dos);
        tres = (ImageView) findViewById(R.id.tres);
        cuatro = (ImageView) findViewById(R.id.cuatro);
        cinco = (ImageView) findViewById(R.id.cinco);
        seis = (ImageView) findViewById(R.id.seis);
        siete = (ImageView) findViewById(R.id.siete);
        ocho = (ImageView) findViewById(R.id.ocho);
        nueve = (ImageView) findViewById(R.id.nueve);


       for (int i=0; i<=8; i++){
           tablero[i]=0;

       }
        uno.setOnClickListener((View.OnClickListener) this);
        dos.setOnClickListener((View.OnClickListener) this);
        tres.setOnClickListener((View.OnClickListener) this);
        cuatro.setOnClickListener((View.OnClickListener) this);
        cinco.setOnClickListener((View.OnClickListener) this);
        seis.setOnClickListener((View.OnClickListener) this);
        siete.setOnClickListener((View.OnClickListener) this);
        ocho.setOnClickListener((View.OnClickListener) this);
        nueve.setOnClickListener((View.OnClickListener) this);
    }

 //   @Override
 //   public void onClick(DialogInterface dialog, int which) {

//        switch (onCreateView().getId()){
//            case R.id.uno:
 //               uno.setImageResource(R.drawable.x);
        }


//    }
//}
