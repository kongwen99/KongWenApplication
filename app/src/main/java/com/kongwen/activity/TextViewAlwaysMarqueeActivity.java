/**
 * TextView内容超出宽度之后始终滚动显示（不获取焦点的情况下也会滚动显示）
 */
package com.kongwen.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.kongwen.R;
import com.kongwen.common.Utils;
import com.kongwen.databinding.ActivityTextviewAlwaysMarqueeBinding;

public class TextViewAlwaysMarqueeActivity extends BaseActivity {

    private ActivityTextviewAlwaysMarqueeBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_textview_always_marquee);
        setTitle("跑马灯和DataBinding");

        mBinding.txt.setSelected(true);
        Utils.getUid(this);
    }
}
