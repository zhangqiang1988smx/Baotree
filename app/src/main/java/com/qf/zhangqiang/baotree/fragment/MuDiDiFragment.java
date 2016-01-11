package com.qf.zhangqiang.baotree.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qf.zhangqiang.baotree.R;

/**
 * Created by zhangqiang on 16-1-11.
 */
public class MuDiDiFragment extends BaseFragment{
    public static MuDiDiFragment newInstance(){
        MuDiDiFragment fragment = new MuDiDiFragment();
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.mudidifragment,null);
        return view;
    }
}
