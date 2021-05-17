package com.example.drawabletest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView image;
    private int level = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.imageVolume);
        image.setImageLevel(level);
    }

    /**
     * Metodo onclick para los dos botones dependiendo de que boton se ha oprimido
     * @param view
     */
    public void changeVolume(View view) {
        switch (view.getId()){
            case R.id.decrease_btn:
                if (level > 0){
                    level --;
                    image.setImageLevel(level);
                }
                break;
            case R.id.increase_btn:
                if (level < 3){
                    level ++;
                    image.setImageLevel(level);
                }
                break;
            default: break;
        }
    }
}