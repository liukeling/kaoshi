package exam.liukeling.zzptc.com.exam_liukeling;

import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class Wellcom extends AppCompatActivity {

    ViewPager viewpager;
    ImageView point1, point2, point3, point4, point5;
    int[] Ids = {
            R.mipmap.start_i1, R.mipmap.start_i2, R.mipmap.start_i3, R.mipmap.start_i4, R.mipmap.start_i5
    };
    Button tiyan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellcom);
        point1 = (ImageView) findViewById(R.id.point1);
        point2 = (ImageView) findViewById(R.id.point2);
        point3 = (ImageView) findViewById(R.id.point3);
        point4 = (ImageView) findViewById(R.id.point4);
        point5 = (ImageView) findViewById(R.id.point5);
        viewpager = (ViewPager) findViewById(R.id.viewpager);
        tiyan = (Button) findViewById(R.id.tiyan);
        viewpager.setAdapter(new MyPagerAdapter());

        point1.setImageResource(R.drawable.point_selected);
        point2.setImageResource(R.drawable.point_nuselected);
        point3.setImageResource(R.drawable.point_nuselected);
        point4.setImageResource(R.drawable.point_nuselected);
        point5.setImageResource(R.drawable.point_nuselected);
        tiyan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Wellcom.this, Yindao.class));
                Wellcom.this.finish();
            }
        });
        viewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                switch (position){
                    case 0:
                        point1.setImageResource(R.drawable.point_selected);
                        point2.setImageResource(R.drawable.point_nuselected);
                        point3.setImageResource(R.drawable.point_nuselected);
                        point4.setImageResource(R.drawable.point_nuselected);
                        point5.setImageResource(R.drawable.point_nuselected);
                        break;
                    case 1:
                        point2.setImageResource(R.drawable.point_selected);
                        point1.setImageResource(R.drawable.point_nuselected);
                        point3.setImageResource(R.drawable.point_nuselected);
                        point4.setImageResource(R.drawable.point_nuselected);
                        point5.setImageResource(R.drawable.point_nuselected);
                        break;
                    case 2:
                        point3.setImageResource(R.drawable.point_selected);
                        point2.setImageResource(R.drawable.point_nuselected);
                        point1.setImageResource(R.drawable.point_nuselected);
                        point4.setImageResource(R.drawable.point_nuselected);
                        point5.setImageResource(R.drawable.point_nuselected);
                        break;
                    case 3:
                        point4.setImageResource(R.drawable.point_selected);
                        point2.setImageResource(R.drawable.point_nuselected);
                        point3.setImageResource(R.drawable.point_nuselected);
                        point1.setImageResource(R.drawable.point_nuselected);
                        point5.setImageResource(R.drawable.point_nuselected);
                        break;
                    case 4:
                        point5.setImageResource(R.drawable.point_selected);
                        point2.setImageResource(R.drawable.point_nuselected);
                        point3.setImageResource(R.drawable.point_nuselected);
                        point4.setImageResource(R.drawable.point_nuselected);
                        point1.setImageResource(R.drawable.point_nuselected);
                        break;
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
    private class MyPagerAdapter extends PagerAdapter{

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            if(object instanceof View) {
                container.removeView((View) object);
            }
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            ImageView iv_item = new ImageView(Wellcom.this);
            iv_item.setImageResource(Ids[position]);
            container.addView(iv_item);
            return iv_item;
        }

        @Override
        public int getItemPosition(Object object) {
            return super.getItemPosition(object);
        }

        @Override
        public int getCount() {
            return Ids.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return (view == object);
        }
    }
}
