package com.qf.zhangqiang.baotree.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.qf.zhangqiang.baotree.R;
import com.qf.zhangqiang.baotree.adapter.MyPagerAdapter;
import com.qf.zhangqiang.baotree.fragment.MuDiDiFragment;
import com.qf.zhangqiang.baotree.fragment.SheQuFragment;
import com.qf.zhangqiang.baotree.fragment.TuiJianFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    private ViewPager viewPager;
    private List<Fragment> lists;
    private MyPagerAdapter adapter;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        radioGroup = ((RadioGroup) findViewById(R.id.radioGroupId));

        createFragment();

        adapter = new MyPagerAdapter(getSupportFragmentManager(), lists);

        viewPager.setAdapter(adapter);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rbtuijianId:
                        viewPager.setCurrentItem(0);

                        break;
                    case R.id.rbmudidiId:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.rbshequId:
                        viewPager.setCurrentItem(2);
                        break;
                }
            }
        });

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                for (int i = 0; i < 3; i++) {
                    RadioButton radioButton = (RadioButton) radioGroup.getChildAt(i);
                    radioButton.setChecked(false);
                    radioButton.setTextColor(getResources().getColor(R.color.huise));
                }
                RadioButton radioButton = (RadioButton) radioGroup.getChildAt(position);
                radioButton.setTextColor(Color.WHITE);

            }

            @Override
            public void onPageSelected(int position) {


            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void createFragment() {
        lists = new ArrayList<>();
        lists.add(MuDiDiFragment.newInstance());
        lists.add(SheQuFragment.newIntance());
        lists.add(TuiJianFragment.newInstance());
    }
}
