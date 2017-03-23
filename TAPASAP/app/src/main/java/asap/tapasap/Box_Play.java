package asap.tapasap;

import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
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
    int sel;
    ImageView boxopen, boxclose;
    ImageView b1,b2,b3,b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_box__play);
        android.app.ActionBar bar = getActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffc000")));
        boxopen = (ImageView)findViewById(R.id.imageView8);
        boxclose = (ImageView)findViewById(R.id.imageView7);
        b1 = (ImageView)findViewById(R.id.imageView9);
        b2 = (ImageView)findViewById(R.id.imageView10);
        b3 = (ImageView)findViewById(R.id.imageView11);
        b4 = (ImageView)findViewById(R.id.imageView12);
        b5 = (ImageView)findViewById(R.id.imageView13);
        b6 = (ImageView)findViewById(R.id.imageView14);
        images = new int[] {R.mipmap.box1,R.mipmap.box2,R.mipmap.box3,R.mipmap.box4,R.mipmap.box5,R.mipmap.box6,R.mipmap.box7,
                R.mipmap.box8,R.mipmap.box9,R.mipmap.box10,R.mipmap.box11,R.mipmap.box12,R.mipmap.box13,R.mipmap.box14,R.mipmap.box15};
        b1.setVisibility(View.GONE);
        b2.setVisibility(View.GONE);
        b3.setVisibility(View.GONE);
        b4.setVisibility(View.GONE);
        b5.setVisibility(View.GONE);
        b6.setVisibility(View.GONE);
        Animation anim = AnimationUtils.loadAnimation(this,R.anim.fadein);
        Animation anim1 = AnimationUtils.loadAnimation(this,R.anim.fadeout);
        boxclose.setAnimation(anim);
        boxclose.setAnimation(anim1);
        boxclose.setVisibility(View.GONE);
        boxopen.setVisibility(View.VISIBLE);
        boxopen.setAnimation(anim);
        boxopen.setAnimation(anim1);
        boxopen.setVisibility(View.GONE);
        fun();
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
        fun4();

    }
    void fun5() {
        int i;
        for (i = 0; i < 6; i++){
            n[i] = -1;
        }
        n[0] = (int)Math.random() % 15;
        for(i = 1; i < 5; i++){
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

    }
}
