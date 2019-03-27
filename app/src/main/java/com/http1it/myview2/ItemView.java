package com.http1it.myview2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ItemView extends LinearLayout {
    private TextView tvLeft, tvRight;
    private ImageView ivRight;
    private RelativeLayout rlItem;

    public ItemView(Context context, AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater.from(context).inflate(R.layout.item_layout, this);
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.ItemView);
        tvLeft = findViewById(R.id.tvLeft);
        tvRight = findViewById(R.id.tvRight);
        ivRight = findViewById(R.id.ivRight);
        String leftText = array.getString(R.styleable.ItemView_leftText);
        String rightText = array.getString(R.styleable.ItemView_rightText);
        boolean showArrow = array.getBoolean(R.styleable.ItemView_showArrow, true);
        setView(leftText, rightText, showArrow);
        array.recycle();

        //获取布局--设置点击事件
        rlItem = findViewById(R.id.rlItem);
    }

    public void setView(String leftText, String rightText, boolean isShowArrow) {
        if (leftText != null) {
            tvLeft.setText(leftText);
        }
        if (rightText != null) {
            tvRight.setText(rightText);
        }
        if (isShowArrow) {

        } else {
            ivRight.setVisibility(INVISIBLE);//隐藏
        }
    }

    /**
     * 点击事件
     */
    public void setOnClickView(OnClickListener l) {
        rlItem.setOnClickListener(l);
    }

}
