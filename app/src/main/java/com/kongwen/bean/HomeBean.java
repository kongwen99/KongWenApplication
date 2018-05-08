package com.kongwen.bean;

import android.content.Intent;

/**
 * Created by PEO on 2018/5/3.
 */

public class HomeBean {
    private String imgUrl;
    private String title;
    private Intent intent;

    public HomeBean(String imgUrl, String title, Intent intent) {
        this.imgUrl = imgUrl;
        this.title = title;
        this.intent = intent;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Intent getIntent() {
        return intent;
    }

    public void setIntent(Intent intent) {
        this.intent = intent;
    }
}
