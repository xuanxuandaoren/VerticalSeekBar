# VerticalSeekBar

竖直滑动条 ，用起来比较方便

### VerticalSeekBar 竖直滑动条

#### 新加功能


```
  /**
     * 设置滑动方向，
     * 0代表从下向上滑
     * 1代表从下向上滑
     *
     * @param orientation
     */
    public void setOrientation(int orientation) 
```

#### 功能
##### 默认模式
默认的状态

![这里写图片描述](http://img.blog.csdn.net/20170420112732277?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvZ29uZ3ppd3VzaHVhbmc=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
##### 设置未选定的颜色

```
 verticalSeekBar.setUnSelectColor(Color.GREEN);
```
效果图
![这里写图片描述](http://img.blog.csdn.net/20170420112834043?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvZ29uZ3ppd3VzaHVhbmc=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
##### 设置选定的颜色

```
   verticalSeekBar.setSelectColor(Color.RED);
```
效果图
![这里写图片描述](http://img.blog.csdn.net/20170420112923700?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvZ29uZ3ppd3VzaHVhbmc=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
##### 设置内部线条的粗细

```
//    单位为dp
       verticalSeekBar.setmInnerProgressWidth(10);
       //单位为px
//     verticalSeekBar.setmInnerProgressWidthPx(15);

```
效果图
![这里写图片描述](http://img.blog.csdn.net/20170420113005663?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvZ29uZ3ppd3VzaHVhbmc=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
##### 设置滑动图片

```
   verticalSeekBar.setThumb(R.mipmap.star);
```
效果图
![这里写图片描述](http://img.blog.csdn.net/20170420113056289?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvZ29uZ3ppd3VzaHVhbmc=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
##### 设置滑动图片大小

```
  
        verticalSeekBar.setThumb(R.mipmap.star);
//单位是px
        verticalSeekBar.setThumbSizePx(100, 100);
        //单位是dp
//        verticalSeekBar.setThumbSize(50,50);
```
效果图
![这里写图片描述](http://img.blog.csdn.net/20170420113138373?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvZ29uZ3ppd3VzaHVhbmc=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
##### 设置进度

```
   verticalSeekBar.setProgress(80);
```
##### 设置滑动监听

```
     verticalSeekBar.setOnSlideChangeListener(this);
       /**
     * 开始滑动
     * @param slideView
     * @param progress
     */
    @Override
    public void onStart(VerticalSeekBar slideView, int progress) {

    }

    /**
     * 滑动过程中
     * @param slideView
     * @param progress
     */
    @Override
    public void onProgress(VerticalSeekBar slideView, int progress) {

    }

    /**
     * 结束滑动
     * @param slideView
     * @param progress
     */
    @Override
    public void onStop(VerticalSeekBar slideView, int progress) {

    }
```
#### 使用方法

 1. 在github下载项目 ，[项目源码](https://github.com/xuanxuandaoren/VerticalSeekBar)
 2. 把源码拷到自己项目下 ![这里写图片描述](http://img.blog.csdn.net/20170420105330769?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvZ29uZ3ppd3VzaHVhbmc=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
 3. 在布局中引用
	 ```
	 <?xml version="1.0" encoding="utf-8"?> 
	 <LinearLayout  xmlns:android="http://schemas.android.com/apk/res/android"
	    xmlns:tools="http://schemas.android.com/tools"
	    android:layout_width="match_parent"
	    android:layout_height="match_parent"
	    android:background="#ccc"
	    tools:context="zhuyuguang.com.verticalseekbar.MainActivity"> 
	<zhuyuguang.com.verticalseekbar.view.VerticalSeekBar
	        android:id="@+id/verticalSeekBar"
	        android:layout_width="80dp"
	        android:layout_height="200dp" />
	</LinearLayout>
	```
 4. 在代码中查找
private VerticalSeekBar verticalSeekBar;

```
  private VerticalSeekBar verticalSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        verticalSeekBar = (VerticalSeekBar) findViewById(R.id.verticalSeekBar);

    }
```

