package jp.cron.base;

import jp.cron.cronlib.Application;

public class DebugApplication extends Application {

    public DebugApplication() {
        super();
        this.debug = true;
        this.sourceClass = DebugApplication.class;
    }
}
