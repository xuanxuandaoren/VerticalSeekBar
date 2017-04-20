package zhuyuguang.com.verticalseekbar;

import android.app.Activity;
import android.os.Bundle;

import zhuyuguang.com.verticalseekbar.view.VerticalSeekBar;

public class MainActivity extends Activity {

    private VerticalSeekBar verticalSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
//        verticalSeekBar.setThumbSize(80,80);
    }

    private void initView() {
        verticalSeekBar = (VerticalSeekBar) findViewById(R.id.verticalSeekBar);
    }
}
