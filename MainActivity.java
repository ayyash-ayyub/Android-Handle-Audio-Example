package magis.app.mysong;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

      ImageButton btnHijau,btnMerah;
     MediaPlayer mp,mp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnHijau = (ImageButton)findViewById(R.id.imageButton);
        btnMerah = (ImageButton)findViewById(R.id.imageButton2);

        mp = MediaPlayer.create(getApplicationContext(),R.raw.bunyi1);
        mp2 = MediaPlayer.create(getApplicationContext(),R.raw.bunyi2);

        btnHijau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnHijau.setEnabled(false);
                btnMerah.setEnabled(false);
                mainkanHijau();
            }
        });


        btnMerah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnMerah.setEnabled(false);
                btnHijau.setEnabled(false);
                mainkanMerah();
            }
        });
    }



    public void mainkanHijau(){

        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                btnHijau.setEnabled(true);
                btnMerah.setEnabled(true);
            }
        });
    }

        
   
    }





    public void mainkanMerah(){

        mp2.start();
        mp2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                btnMerah.setEnabled(true);
                btnHijau.setEnabled(true);
            }
        });
    }




}
