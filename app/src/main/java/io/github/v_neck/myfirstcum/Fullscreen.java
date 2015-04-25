package io.github.v_neck.myfirstcum;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by McLovin on 4/19/15.
 */
public class Fullscreen extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_my);
        setContentView(R.layout.activity_display_message);
    }
}
// see http://androidsnippets.com/how-to-make-an-activity-fullscreen