package asap.tapasap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView i1,i2,i3,i4,i5,i6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.gc();
        i1 = (ImageView)findViewById(R.id.imageView2);
        i2 = (ImageView)findViewById(R.id.imageView3);
        i3 = (ImageView)findViewById(R.id.imageView4);
        i4 = (ImageView)findViewById(R.id.imageView5);
        i5 = (ImageView)findViewById(R.id.imageView6);
        i1.setOnClickListener(this);
        i2.setOnClickListener(this);
        i3.setOnClickListener(this);
        i4.setOnClickListener(this);
        i5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent inte1,inte2,inte3,inte4;
        switch (v.getId()){
            case R.id.imageView2: //pairs
                inte1 = new Intent(MainActivity.this, Pairs_Game.class);
                startActivity(inte1);
                break;
            case R.id.imageView3: //box
                inte2 = new Intent(MainActivity.this, Box_Play.class);
                startActivity(inte2);
                break;
            case R.id.imageView4: //pics
                inte3 = new Intent(MainActivity.this, TapOutHome.class);
                startActivity(inte3);
                break;
            case R.id.imageView5: //cups
                inte4 = new Intent(MainActivity.this, Cups_Play.class);
                startActivity(inte4);
                break;
            case R.id.imageView6: //word
                break;
        }
    }
}
