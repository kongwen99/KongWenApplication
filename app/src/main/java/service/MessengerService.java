package service;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

import com.kongwen.common.MyConstants;

/**
 * Messager进程间通信-服务端代码
 */

public class MessengerService extends Service {

    //处理客户端发送的消息
    private static class MessengerHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case MyConstants.MSG_FROM_CLIENT:
                    Log.i(MyConstants.TAG, "Receive msg from Client:" + msg.getData().getString("msg"));
                    //收到消息后，回复一条信息给客户端
                    Messenger client = msg.replyTo;
                    Message replyMsg = Message.obtain(null, MyConstants.MSG_FROM_SERVER);
                    Bundle bundle = new Bundle();
                    bundle.putString("reply", "服务器端已经收到客户端的回复！");
                    replyMsg.setData(bundle);
                    try {
                        client.send(replyMsg);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    super.handleMessage(msg);
            }

        }

    }

    private final Messenger mMessenger = new Messenger(new MessengerHandler());

    @Override
    public IBinder onBind(Intent intent) {
        return mMessenger.getBinder();
    }
}
