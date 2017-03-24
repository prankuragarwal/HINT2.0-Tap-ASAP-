package asap.tapasap;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Pairs_Game extends AppCompatActivity implements View.OnClickListener{

    int[] img;
    int back, back1;
    int pos;
    int prev=0,ctr=1,curr=0,score = 0,previ;
    ImageView[] arr = new ImageView[20];
    int count = 0;
    long starttime, endtime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pair_play);
        back = R.mipmap.card_back1;
        back1 = R.mipmap.card_back1;
        img = new int[]{ R.mipmap.ace1,R.mipmap.eight, R.mipmap.four, R.mipmap.jack, R.mipmap.king, R.mipmap.king2, R.mipmap.queen, R.mipmap.ten, R.mipmap.three, R.mipmap.two, R.mipmap.ace1, R.mipmap.eight, R.mipmap.four, R.mipmap.jack, R.mipmap.king, R.mipmap.king2, R.mipmap.queen, R.mipmap.ten, R.mipmap.three, R.mipmap.two };
        pos = (int) Math.random() % 20;

        arr[0] = (ImageView)findViewById(R.id.imageView3);
        arr[1] = (ImageView)findViewById(R.id.imageView4);
        arr[2] = (ImageView)findViewById(R.id.imageView5);
        arr[3] = (ImageView)findViewById(R.id.imageView6);
        arr[4] = (ImageView)findViewById(R.id.imageView7);
        arr[5] = (ImageView)findViewById(R.id.imageView8);
        arr[6] = (ImageView)findViewById(R.id.imageView9);
        arr[7] = (ImageView)findViewById(R.id.imageView10);
        arr[8] = (ImageView)findViewById(R.id.imageView11);
        arr[9] = (ImageView)findViewById(R.id.imageView12);
        arr[10] = (ImageView)findViewById(R.id.imageView13);
        arr[11] = (ImageView)findViewById(R.id.imageView14);
        arr[12] = (ImageView)findViewById(R.id.imageView15);
        arr[13] = (ImageView)findViewById(R.id.imageView16);
        arr[14] = (ImageView)findViewById(R.id.imageView17);
        arr[15] = (ImageView)findViewById(R.id.imageView18);
        arr[16] = (ImageView)findViewById(R.id.imageView19);
        arr[17] = (ImageView)findViewById(R.id.imageView20);
        arr[18] = (ImageView)findViewById(R.id.imageView21);
        arr[19] = (ImageView)findViewById(R.id.imageView22);

        for ( int i = 0;i < 20;i++ ) {
            arr[i].setOnClickListener(this);
        }
        starttime = System.currentTimeMillis();
    }


    @Override
    public void onClick(View v) {
        Animation animation;
        switch(v.getId()){
            case R.id.imageView3:
                animation = AnimationUtils.loadAnimation(this, R.anim.rotate);

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        arr[0].setImageResource(img[(0+pos)%20]);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }

                });

                v.startAnimation(animation);

                //rest of the code here
                check(0);

                break;

            case R.id.imageView4:
                animation = AnimationUtils.loadAnimation(this, R.anim.rotate);

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        arr[1].setImageResource(img[(1+pos)%20]);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                v.startAnimation(animation);

                //rest of the code here
                check(1);

                break;
            case R.id.imageView5:
                animation = AnimationUtils.loadAnimation(this, R.anim.rotate);

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        arr[2].setImageResource(img[(2+pos)%20]);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                v.startAnimation(animation);

                //rest of the code here
                check(2);

                break;

            case R.id.imageView6:
                animation = AnimationUtils.loadAnimation(this, R.anim.rotate);

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        arr[3].setImageResource(img[(3+pos)%20]);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                v.startAnimation(animation);

                //rest of the code here
                check(3);

                break;

            case R.id.imageView7:
                animation = AnimationUtils.loadAnimation(this, R.anim.rotate);

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        arr[4].setImageResource(img[(4+pos)%20]);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                v.startAnimation(animation);

                //rest of the code here
                check(4);

                break;

            case R.id.imageView8:
                animation = AnimationUtils.loadAnimation(this, R.anim.rotate);

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        arr[5].setImageResource(img[(5+pos)%20]);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                v.startAnimation(animation);

                //rest of the code here
                check(5);

                break;

            case R.id.imageView9:
                animation = AnimationUtils.loadAnimation(this, R.anim.rotate);

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        arr[6].setImageResource(img[(6+pos)%20]);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                v.startAnimation(animation);

                //rest of the code here
                check(6);

                break;

            case R.id.imageView10:
                animation = AnimationUtils.loadAnimation(this, R.anim.rotate);

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        arr[7].setImageResource(img[(7+pos)%20]);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                v.startAnimation(animation);

                //rest of the code here
                check(7);

                break;

            case R.id.imageView11:
                animation = AnimationUtils.loadAnimation(this, R.anim.rotate);

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        arr[8].setImageResource(img[(8+pos)%20]);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                v.startAnimation(animation);

                //rest of the code here
                check(8);

                break;

            case R.id.imageView12:
                animation = AnimationUtils.loadAnimation(this, R.anim.rotate);

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        arr[9].setImageResource(img[(9+pos)%20]);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                v.startAnimation(animation);

                //rest of the code here
                check(9);

                break;

            case R.id.imageView13:
                animation = AnimationUtils.loadAnimation(this, R.anim.rotate);

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        arr[10].setImageResource(img[(10+pos)%20]);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                v.startAnimation(animation);

                //rest of the code here
                check(10);

                break;

            case R.id.imageView14:
                animation = AnimationUtils.loadAnimation(this, R.anim.rotate);

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        arr[11].setImageResource(img[(11+pos)%20]);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                v.startAnimation(animation);

                //rest of the code here
                check(11);

                break;

            case R.id.imageView15:
                animation = AnimationUtils.loadAnimation(this, R.anim.rotate);

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        arr[12].setImageResource(img[(12+pos)%20]);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                v.startAnimation(animation);

                //rest of the code here
                check(12);

                break;
            case R.id.imageView16:
                animation = AnimationUtils.loadAnimation(this, R.anim.rotate);

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        arr[13].setImageResource(img[(13+pos)%20]);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                v.startAnimation(animation);

                //rest of the code here
                check(13);

                break;
            case R.id.imageView17:
                animation = AnimationUtils.loadAnimation(this, R.anim.rotate);

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        arr[14].setImageResource(img[(14+pos)%20]);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                v.startAnimation(animation);

                //rest of the code here
                check(14);

                break;

            case R.id.imageView18:
                animation = AnimationUtils.loadAnimation(this, R.anim.rotate);

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        arr[15].setImageResource(img[(15+pos)%20]);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                v.startAnimation(animation);

                //rest of the code here
                check(15);
                break;
            case R.id.imageView19:
                animation = AnimationUtils.loadAnimation(this, R.anim.rotate);

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        arr[16].setImageResource(img[(16+pos)%20]);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                v.startAnimation(animation);

                //rest of the code here
                check(16);
                break;
            case R.id.imageView20:
                animation = AnimationUtils.loadAnimation(this, R.anim.rotate);

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        arr[17].setImageResource(img[(17+pos)%20]);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                v.startAnimation(animation);

                //rest of the code here
                check(17);

                break;
            case R.id.imageView21:
                animation = AnimationUtils.loadAnimation(this, R.anim.rotate);

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        arr[18].setImageResource(img[(18+pos)%20]);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                v.startAnimation(animation);
                check(18);

                //rest of the code here

                break;
            case R.id.imageView22:
                animation = AnimationUtils.loadAnimation(this, R.anim.rotate);

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        arr[19].setImageResource(img[(19+pos)%20]);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                v.startAnimation(animation);

                //rest of the code here
                check(19);

                break;
        }
    }

    public void check (int i)
    {
        if (ctr%2 == 1 ) {
            reset();
            prev = (i+pos)%20;
            arr[i].setImageResource(img[prev]);
            previ = i;
            ctr++;
            //arr[i].setImageResource(back);
        } else {
            curr = (i+pos)%20;
            if ( prev == ((curr + 10)%20) || prev == ((curr - 10)%20) ) {
                score++;
                arr[previ].setVisibility(View.INVISIBLE);
                arr[i].setVisibility(View.INVISIBLE);
                count += 2;
               //Log.v("anything", String.valueOf(count));

            }
           // reset();
            //arr[previ].setImageResource(back1);
            //arr[i].setImageResource(back);
            //Log.v("anything",previ+" "+i+" 3");
            ctr++;
        }
        if (count == 20){
            endtime = System.currentTimeMillis();
            long total = endtime - starttime;
            total = total/1000;
            AlertDialog.Builder b = new AlertDialog.Builder(Pairs_Game.this);
            //Log.v("tsfst", String.valueOf(total));
            b.setTitle("Game Over");
            b.setMessage("Your time was " + total);
            b.setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent i = new Intent(Pairs_Game.this, Pairs_Game.class);
                    finish();
                    startActivity(i);
                }
            });

            b.setNegativeButton("Go to Home Page", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                    //add home page intent
                }
            });
            b.show();
        }
    }

    public void reset ()
    {
        for (int i = 0;i < 20;i++ ) {
            arr[i].setImageResource(back1);
        }
    }
}