package com.kongwen.aidl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kongwen.R;

/**
 * 客户端：首先绑定远程服务，绑定成功后将远程服务器端返回的Binder对象转换成AIDL接口
 * 通过这个接口可以调用远程服务器端的方法
 */
public class BookManagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_manager);
    }
}
