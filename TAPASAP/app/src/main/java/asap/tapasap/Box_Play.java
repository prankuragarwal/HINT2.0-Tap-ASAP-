package asap.tapasap;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Box_Play extends AppCompatActivity implements View.OnClickListener{

    int[] images;
    int[] n = {-1,-1,-1,-1,-1,-1};
    int []show = {-1,-1,-1,-1,-1,-1};
    int[] opt = {-1,-1,-1};
    int sel, tt, score = 0;
    ImageView boxopen, boxclose;
    ImageView b1,b2,b3,b4,b5,b6, c1,c2,c3,c4,c5,o1,o2,o3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_box__play);
        /*android.app.ActionBar bar = getActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffc000")));*/
        boxopen = (ImageView)findViewById(R.id.imageView8);
        boxclose = (ImageView)findViewById(R.id.imageView7);
        b1 = (ImageView)findViewById(R.id.imageView9);
        b2 = (ImageView)findViewById(R.id.imageView10);
        b3 = (ImageView)findViewById(R.id.imageView11);
        b4 = (ImageView)findViewById(R.id.imageView12);
        b5 = (ImageView)findViewById(R.id.imageView13);
        b6 = (ImageView)findViewById(R.id.imageView14);
        c1 = (ImageView)findViewById(R.id.imageView15);
        c2 = (ImageView)findViewById(R.id.imageView16);
        c3 = (ImageView)findViewById(R.id.imageView17);
        c4 = (ImageView)findViewById(R.id.imageView18);
        c5 = (ImageView)findViewById(R.id.imageView19);
        o1 = (ImageView)findViewById(R.id.imageView20);
        o2 = (ImageView)findViewById(R.id.imageView21);
        o3 = (ImageView)findViewById(R.id.imageView22);
        images = new int[] {R.mipmap.box1,R.mipmap.box2,R.mipmap.box3,R.mipmap.box4,R.mipmap.box5,R.mipmap.box6,R.mipmap.box7,
                R.mipmap.box8,R.mipmap.box9,R.mipmap.box10,R.mipmap.box11,R.mipmap.box12,R.mipmap.box13,R.mipmap.box14,R.mipmap.box15};
        b1.setVisibility(View.INVISIBLE);
        b2.setVisibility(View.INVISIBLE);
        b3.setVisibility(View.INVISIBLE);
        b4.setVisibility(View.INVISIBLE);
        b5.setVisibility(View.INVISIBLE);
        b6.setVisibility(View.INVISIBLE);
        c1.setVisibility(View.INVISIBLE);
        c2.setVisibility(View.INVISIBLE);
        c3.setVisibility(View.INVISIBLE);
        c4.setVisibility(View.INVISIBLE);
        c5.setVisibility(View.INVISIBLE);
        o1.setVisibility(View.INVISIBLE);
        o2.setVisibility(View.INVISIBLE);
        o3.setVisibility(View.INVISIBLE);
        o1.setVisibility(View.INVISIBLE);
        Animation anim = AnimationUtils.loadAnimation(this,R.anim.fadein);
        Animation anim1 = AnimationUtils.loadAnimation(this,R.anim.fadeout);
        boxclose.setVisibility(View.VISIBLE);
        boxclose.setAnimation(anim);
        boxclose.setAnimation(anim1);
        boxclose.setVisibility(View.INVISIBLE);
        boxopen.setVisibility(View.VISIBLE);
        boxopen.setAnimation(anim);
        boxopen.setAnimation(anim1);
        boxopen.setVisibility(View.INVISIBLE);
        fun();
        o1.setOnClickListener(this);
        o2.setOnClickListener(this);
        o3.setOnClickListener(this);
    }

    void fun(){
        fun5();
        Animation anim2 = AnimationUtils.loadAnimation(this,R.anim.itemdis);
        b1.setImageResource(images[show[0]]);
        b2.setImageResource(images[show[1]]);
        b3.setImageResource(images[show[2]]);
        b4.setImageResource(images[show[3]]);
        b5.setImageResource(images[show[4]]);
        b6.setImageResource(images[show[5]]);
        b1.setVisibility(View.VISIBLE);
        b2.setVisibility(View.VISIBLE);
        b3.setVisibility(View.VISIBLE);
        b4.setVisibility(View.VISIBLE);
        b5.setVisibility(View.VISIBLE);
        b6.setVisibility(View.VISIBLE);
        b1.setAnimation(anim2);
        b2.setAnimation(anim2);
        b3.setAnimation(anim2);
        b4.setAnimation(anim2);
        b5.setAnimation(anim2);
        b6.setAnimation(anim2);
        b1.setVisibility(View.INVISIBLE);
        b2.setVisibility(View.INVISIBLE);
        b3.setVisibility(View.INVISIBLE);
        b4.setVisibility(View.INVISIBLE);
        b5.setVisibility(View.INVISIBLE);
        b6.setVisibility(View.INVISIBLE);
        /*fun4();
        c1.setImageResource(images[show[4]]);
        c2.setImageResource(images[show[1]]);
        c3.setImageResource(images[show[3]]);
        c4.setImageResource(images[show[2]]);
        c5.setImageResource(images[show[0]]);
        c1.setVisibility(View.VISIBLE);
        c2.setVisibility(View.VISIBLE);
        c3.setVisibility(View.VISIBLE);
        c4.setVisibility(View.VISIBLE);
        c5.setVisibility(View.VISIBLE);*/
        optt();
        o1.setImageResource(images[opt[0]]);
        o2.setImageResource(images[opt[1]]);
        o3.setImageResource(images[opt[2]]);
        o2.setVisibility(View.VISIBLE);
        o3.setVisibility(View.VISIBLE);
        o1.setVisibility(View.VISIBLE);
    }

    void optt() {
        tt = (int) Math.random() % 3;
        opt[tt] = sel;
        if (tt == 0){
            opt[1] = sel + 10;
            opt[1] %= 15;
            opt[2] = sel + 11;
            opt[2] %= 15;
        } else if (tt == 1){
            opt[0] = sel + 10;
            opt[0] %= 15;
            opt[2] = sel + 11;
            opt[2] %= 15;
        } else if (tt == 2){
            opt[1] = sel + 10;
            opt[1] %= 15;
            opt[0] = sel + 11;
            opt[0] %= 15;
        }
    }

    void fun5() {
        int i;
        /*for (i = 0; i < 6; i++){
            n[i] = -1;
        }*/
        n[0] = (int)Math.random() % 15;
        for(i = 1; i <= 5; i++){
            n[i] = (n[0] + i) % 15;
        }
        for (i = 0; i < 6; i++){
            show[i] = n[i];
        }
    }

    void fun4() {
        int i, j = 0;
        sel = (int)Math.random() % 6;
        sel = n[sel];
        for (i = 0; i < 6; i++){
            if (i != sel){
                show[j++] = n[i];
            }
        }
    }

    @Override
    public void onClick(View v) {
        int get;
        switch(v.getId()){
            case R.id.imageView20:
                if(sel == opt[0]){
                    score++;
                    c1.setVisibility(View.INVISIBLE);
                    c2.setVisibility(View.INVISIBLE);
                    c3.setVisibility(View.INVISIBLE);
                    c4.setVisibility(View.INVISIBLE);
                    c5.setVisibility(View.INVISIBLE);
                    o2.setVisibility(View.INVISIBLE);
                    o3.setVisibility(View.INVISIBLE);
                    o1.setVisibility(View.INVISIBLE);
                    fun();
                } else {
                    AlertDialog.Builder b = new AlertDialog.Builder(Box_Play.this);
                    b.setTitle("GAME OVER");
                    b.setMessage("Your score was " + score);
                    b.setPositiveButton("Play Again!", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(Box_Play.this, Box_Play.class);

                            finish();

                            startActivity(i);
                        }
                    });
                    score = 0;

                    b.setNegativeButton("Go to HomePage", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Intent i = new Intent(PlayGame.this, Home.class);

                            finish();
                            System.exit(0);
                            //startActivity(i);

                        }
                    });
                    b.show();
                }
                break;
            case R.id.imageView21:
                if(sel == opt[1]){
                    score++;
                    fun();
                } else {
                    AlertDialog.Builder b = new AlertDialog.Builder(Box_Play.this);
                    b.setTitle("GAME OVER");
                    b.setMessage("Your score was " + score);
                    b.setPositiveButton("Play Again!", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(Box_Play.this, Box_Play.class);

                            finish();

                            startActivity(i);
                        }
                    });
                    score = 0;

                    b.setNegativeButton("Go to HomePage", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Intent i = new Intent(PlayGame.this, Home.class);

                            finish();
                            System.exit(0);
                            //startActivity(i);

                        }
                    });
                    b.show();
                }
                break;
            case R.id.imageView22:
                if(sel == opt[2]){
                    score++;
                    fun();
                } else {
                    AlertDialog.Builder b = new AlertDialog.Builder(Box_Play.this);
                    b.setTitle("GAME OVER");
                    b.setMessage("Your score was " + score);
                    b.setPositiveButton("Play Again!", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(Box_Play.this, Box_Play.class);

                            finish();

                            startActivity(i);
                        }
                    });
                    score = 0;

                    b.setNegativeButton("Go to HomePage", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Intent i = new Intent(PlayGame.this, Home.class);

                            finish();
                            System.exit(0);
                            //startActivity(i);

                        }
                    });
                    b.show();
                }
                break;
        }
    }
}
