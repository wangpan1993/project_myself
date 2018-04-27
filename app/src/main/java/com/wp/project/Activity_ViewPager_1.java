package com.wp.project;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用viewpager实现卡片效果
 * android:clipChildren="false"属性使用
 *
 * 文章参考：https://blog.csdn.net/u012702547/article/details/52334161?locationNum=8
 */
public class Activity_ViewPager_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager_1);
        initView();
    }

    private void initView() {
        ViewPager viewPager=(ViewPager) findViewById(R.id.viewpager);
        viewPager.setPageMargin(50);//两个卡片之间的间距——单位px，自行转dp
        List<Integer> list=new ArrayList<>();
        list.add(R.drawable.p001);
        list.add(R.drawable.p001);
        list.add(R.drawable.p001);
        list.add(R.drawable.p001);
        list.add(R.drawable.p001);
        MyVpAdater adater=new MyVpAdater(this, list);

        viewPager.setAdapter(adater);
        viewPager.setCurrentItem(100);
    }


    public class MyVpAdater extends PagerAdapter {
        private List<Integer> list;
        private Context context;

        public MyVpAdater(Context context, List<Integer> list) {
            this.context=context;
            this.list=list;
        }

        @Override
        public int getCount() {
            return 200;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            ImageView iv=new ImageView(context);
            iv.setImageResource(list.get(position % list.size()));
            container.addView(iv);
            return iv;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
    }

}
