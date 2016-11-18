package com.uis.thanl2.gameproject;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView cat, heart1, heart2, heart3;
    private LayoutInflater layoutInflater;
    private RelativeLayout relativeLayout;
    private TextView score;
    private Button jumpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        //get the hearts
        heart1 = (ImageView) this.findViewById(R.id.heart1);
        heart2 = (ImageView) this.findViewById(R.id.heart3);
        heart3 = (ImageView) this.findViewById(R.id.heart3);
        //get the score text field
        score = (TextView) this.findViewById(R.id.score);
        //get the jump button
        jumpButton = (Button) this.findViewById(R.id.jumpButton);
        relativeLayout = (RelativeLayout) findViewById(R.id.activity_main);
        layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        /*
        *
        * Cat Stuff */
        //set the background of the imageview to the cat
        cat = (ImageView) layoutInflater.inflate(
                R.layout.cat_view, null);
        cat.setBackgroundResource(R.drawable.cat_animation);

        //create an animation drawable object
        AnimationDrawable catAnimate = (AnimationDrawable) cat.getBackground();
        catAnimate.start();

        Display size = getWindowManager().getDefaultDisplay();
        Point mDisplaySize = new Point();
        size.getSize(mDisplaySize);
        System.out.println(mDisplaySize.y);
        System.out.println(mDisplaySize.x);

        cat.setX(0);
        cat.setY(0);
        cat.setScaleX(.23f);
        cat.setScaleY(.23f);
        relativeLayout.addView(cat, 0);
    }
}
