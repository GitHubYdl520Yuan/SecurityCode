package com.jykj.yl.securitycode.app;

import android.app.Application;

import com.jykj.yl.securitycode.helper.ShareHelper;
import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;


/**
 * 功能：全局的单例模式的Application
 */
public class ShopApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化日志库
        Logger.init("SHOP").logLevel(LogLevel.FULL);
        ShareHelper.init(this);//初始化ShareHelper
    }
}
