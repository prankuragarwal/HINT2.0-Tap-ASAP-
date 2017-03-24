package asap.tapasap;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class TapOutHome extends AppCompatActivity implements View.OnClickListener{
    TextView activityName;
    TextView pl;
    ImageView mainlogo;
    int pressed = 0;
    private Toolbar toolbarMain;
    LinearLayout play;
    ImageView abtus;
    private ScrollView abtsc;
    int abtOpened = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tap_out_home);
        System.gc();
        play =(LinearLayout) findViewById(R.id.pp);
        pl = (TextView) findViewById(R.id.play);
        toolbarMain.setNavigationIcon(null);
        play.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.pp:
                Intent inte = new Intent(this, TapOutPlayGame.class);
                startActivity(inte);
                break;
            default:
                pressed = 0;
                break;
        }
    }
    @Override
    public void onBackPressed() {
        if (pressed == 0) {
            Toast.makeText(TapOutHome.this, "Press Again to Exit", Toast.LENGTH_SHORT).show();
            pressed = 1;
        } else if (pressed == 1) {
            super.onBackPressed();
        }
    }
}