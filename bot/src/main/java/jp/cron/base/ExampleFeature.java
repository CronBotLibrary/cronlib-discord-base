package jp.cron.base;

import jp.cron.cronlib.api.JavaFeature;

public class ExampleFeature extends JavaFeature {
    @Override
    protected void onEnable() {
        this.getApp().bot.registerCommand(new ExampleCommand(), this);
        this.getApp().bot.registerListener(new ExampleListener(), this);
    }

    @Override
    protected void onDisable() {

    }
}