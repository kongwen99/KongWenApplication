package com.kongwen.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kongwen.R;
import com.kongwen.activity.MainActivity;
import com.kongwen.bean.HomeBean;
import com.kongwen.common.GlideLoader;
import com.kongwen.common.Utils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by PEO on 2018/5/3.
 */

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeHolder> {
    private Context mContext;
    private List<HomeBean> mList = new ArrayList<>();

    public HomeAdapter(Context mContext, List<HomeBean> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @Override
    public HomeHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home, parent, false);
        final HomeHolder holder = new HomeHolder(view);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                if (mList.get(position).getIntent() != null){
                    Intent intent = new Intent(mList.get(position).getIntent());
                    mContext.startActivity(intent);
                }

            }
        });

        return holder;
    }

    @Override
    public void onBindViewHolder(HomeHolder holder, int position) {
        //获取屏幕宽度
        DisplayMetrics metrics = new DisplayMetrics();
        ((MainActivity) mContext).getWindowManager().getDefaultDisplay().getMetrics(metrics);
        ViewGroup.LayoutParams params = holder.cardView.getLayoutParams();
        //因为是3列，设置item宽度为1/3
        int width = metrics.widthPixels;
        params.width = width / 3;
        //设置item的高度随机
        params.height = (int) (200 + Math.random() * 400);
        holder.cardView.setLayoutParams(params);
        //加载图片
        GlideLoader.displayTmb(mContext, holder.img, mList.get(position).getImgUrl());
        //加载文字
        Utils.injectTextDefalut(holder.txt, mList.get(position).getTitle(), "");
    }

    @Override
    public int getItemCount() {
        return Utils.size(mList);
    }

    class HomeHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.img)
        ImageView img;
        @BindView(R.id.txt)
        TextView txt;
        @BindView(R.id.cardView)
        CardView cardView;

        public HomeHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
