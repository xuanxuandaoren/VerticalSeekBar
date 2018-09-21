package zhuyuguang.com.verticalseekbar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import zhuyuguang.com.verticalseekbar.view.VerticalSeekBar;

public class MainActivity extends Activity implements VerticalSeekBar.SlideChangeListener {

    private VerticalSeekBar verticalSeekBar;
    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        verticalSeekBar = (VerticalSeekBar) findViewById(R.id.verticalSeekBar);

//        verticalSeekBar.setUnSelectColor(Color.GREEN);
//        verticalSeekBar.setSelectColor(Color.RED);

//        verticalSeekBar.setmInnerProgressWidth(10);
//        verticalSeekBar.setmInnerProgressWidthPx(15);

//        verticalSeekBar.setThumb(R.mipmap.star);
//单位是px
        verticalSeekBar.setThumbSizePx(100, 100);
        //单位是dp
//        verticalSeekBar.setThumbSize(50,50);
        verticalSeekBar.setProgress(80);
        verticalSeekBar.setMaxProgress(1000);

        verticalSeekBar.setOrientation(0);
        verticalSeekBar.setOnSlideChangeListener(this);
    }


    /**
     * 开始滑动
     *
     * @param slideView
     * @param progress
     */
    @Override
    public void onStart(VerticalSeekBar slideView, int progress) {

    }

    /**
     * 滑动过程中
     *
     * @param slideView
     * @param progress
     */
    @Override
    public void onProgress(VerticalSeekBar slideView, int progress) {
        textview.setText(progress + "");
    }

    /**
     * 结束滑动
     *
     * @param slideView
     * @param progress
     */
    @Override
    public void onStop(VerticalSeekBar slideView, int progress) {

    }

    private void initView() {
        textview = (TextView) findViewById(R.id.textview);
    }
}
