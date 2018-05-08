package com.kongwen.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;

/**
 * TextView内容超出宽度之后始终滚动显示（不获取焦点的情况下也会滚动显示）
 */

public class TextViewAlwaysMarqueeView extends android.support.v7.widget.AppCompatTextView {

    public TextViewAlwaysMarqueeView(Context context) {

        super(context);

        // TODO Auto-generated constructor stub
    }

    public TextViewAlwaysMarqueeView(Context context, AttributeSet attrs) {

        super(context, attrs);

        // TODO Auto-generated constructor stub
    }

    public TextViewAlwaysMarqueeView(Context context, AttributeSet attrs, int defStyle) {

        super(context, attrs, defStyle);

        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean isFocused() {

        return true;

    }

    @Override
    protected void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) {

        // TODO Auto-generated method stub
        // fobid call parent constructor
        // super.onFocusChanged(focused, direction, previouslyFocusedRect);
    }
}
