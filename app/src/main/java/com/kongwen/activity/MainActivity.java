package com.kongwen.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.kongwen.R;
import com.kongwen.adapter.HomeAdapter;
import com.kongwen.bean.HomeBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    private List<HomeBean> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initRecyclerView();
    }

    private void initRecyclerView() {
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        loadData();
        HomeAdapter adapter = new HomeAdapter(this, list);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        list = new ArrayList<>();
        HomeBean homeBean1 = new HomeBean("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=2808473634,3574031128&fm=27&gp=0.jpg",
                "跑马灯", new Intent(MainActivity.this, TextViewAlwaysMarqueeActivity.class));
        list.add(homeBean1);
        HomeBean homeBean2 = new HomeBean("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1525344377921&di=bae268b441a1b8c6d81652a5185e5ece&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimgad%2Fpic%2Fitem%2F0b7b02087bf40ad1971fd77d5d2c11dfa8ecceb1.jpg",
                "", null);
        list.add(homeBean2);
        HomeBean homeBean3 = new HomeBean("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1525344438170&di=790dbc8cab67eac732e388499a41a46f&imgtype=0&src=http%3A%2F%2Fpic47.nipic.com%2F20140823%2F12432538_152008542000_2.jpg",
                "", null);
        list.add(homeBean3);
        HomeBean homeBean4 = new HomeBean("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1525939106&di=92bd61a0c734a2c28132709a8364cfcd&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F01823b568643ed32f8759f04ce4b72.jpg",
                "", null);
        list.add(homeBean4);
        HomeBean homeBean5 = new HomeBean("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1525939124&di=4c2f4b631bf3e45764b3702a775ff130&imgtype=jpg&er=1&src=http%3A%2F%2Fpic.90sjimg.com%2Fback_pic%2F00%2F00%2F40%2F82%2F87d7aaf08e7f5476772c523bed7ffdd9.jpg",
                "", null);
        list.add(homeBean5);
        HomeBean homeBean6 = new HomeBean("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1525344422786&di=a6435d9cfada411f6de1cd1eac1dee38&imgtype=0&src=http%3A%2F%2Fpic.58pic.com%2F58pic%2F17%2F25%2F64%2F64H58PICIQp_1024.jpg",
                "", null);
        list.add(homeBean6);
        HomeBean homeBean7 = new HomeBean("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1525344377921&di=bae268b441a1b8c6d81652a5185e5ece&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimgad%2Fpic%2Fitem%2F0b7b02087bf40ad1971fd77d5d2c11dfa8ecceb1.jpg",
                "", null);
        list.add(homeBean7);
        HomeBean homeBean8 = new HomeBean("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1525344377921&di=bae268b441a1b8c6d81652a5185e5ece&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimgad%2Fpic%2Fitem%2F0b7b02087bf40ad1971fd77d5d2c11dfa8ecceb1.jpg",
                "", null);
        list.add(homeBean8);
        HomeBean homeBean9 = new HomeBean("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=2808473634,3574031128&fm=27&gp=0.jpg",
                "", null);
        list.add(homeBean9);
        HomeBean homeBean10 = new HomeBean("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1525939106&di=92bd61a0c734a2c28132709a8364cfcd&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F01823b568643ed32f8759f04ce4b72.jpg",
                "", null);
        list.add(homeBean10);
    }
}
