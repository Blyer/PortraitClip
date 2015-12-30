package com.ysy.portraitclip;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

import com.ysy.portraitclip.view.ClipImageView;

public class MainActivity extends Activity {

    private ImageView img_result;
    private ClipImageView img_clip;
    private Button btn_clip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        img_result = (ImageView) findViewById(R.id.img_result);
        btn_clip = (Button) findViewById(R.id.btn_clip);
        img_clip = (ClipImageView) findViewById(R.id.img_clip);
        img_clip.setSrc(BitmapFactory.decodeResource(getResources(), R.mipmap.default_ad_img));

        btn_clip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_result.setImageBitmap(img_clip.getClipImageBitmap());
            }
        });
    }
}
