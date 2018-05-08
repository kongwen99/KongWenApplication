// 服务器端的AIDL接口，该接口中的方法暴露给客户端调用
//AIDL接口中只支持声明方法，不支持声明静态常量，这一点区别于传统接口
package com.kongwen.aidl;

import com.kongwen.aidl.Book;

interface IBookManager {
    //从远程服务器获取图书列表
    List<Book> getBookList();
    //向图书列表中增加一本书
    void addBook(in Book book);
}
