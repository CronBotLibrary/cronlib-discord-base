package jp.cron.base;

import jp.cron.cronlib.api.JavaFeature;

public class ExampleActivity extends JavaFeature {
    @Override
    protected void onEnable() {
        this.getApp().bot.setActivityHandler(new ExampleActivityHandler(this.getApp()), this);
    }

    @Override
    protected void onDisable() {

    }
}