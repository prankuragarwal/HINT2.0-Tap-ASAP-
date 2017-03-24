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

public class Cups_Play extends AppCompatActivity{

    int red_index, blue_index;
    int chosen_red, chosen_blue;
    int level = 1;
    int cups[] = new int[5];
    int score = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cups_play);
        red_index = (int)Math.random() % 5;
        blue_index = -1;
        while(blue_index == -1 || red_index == blue_index)
            blue_index = (int)Math.random() % 5;
            for(int i = 0; i < 5; i++)
                cups[i] = 0;
            cups[red_index] = 1;
            cups[blue_index] = 2;
        while(true) {
            for (int i = 0; i < level; i++) {
                flip();
            }
            choose();
            check();
        }
    }

    void flip() {
        int first_index = (int)Math.random() % 5;
        int second_index = -1;
        while(second_index == -1 || first_index == second_index)
            second_index = (int)Math.random() % 5;

        int temp = cups[first_index];
        cups[first_index] = cups[second_index];
        cups[second_index] = temp;
    }

    void choose() {

    }

    void check() {
        if(cups[chosen_red] == 0 || cups[chosen_blue] == 0)
            over();
        else {
            if(chosen_red == red_index)
                score += 2;
            else
                score += 1;
        }
    }

    void over() {

    }
}
