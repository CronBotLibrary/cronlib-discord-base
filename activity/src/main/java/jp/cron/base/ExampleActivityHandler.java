package jp.cron.base;

import jp.cron.cronlib.Application;
import jp.cron.cronlib.api.JavaActivityHandler;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class ExampleActivityHandler extends JavaActivityHandler {
    Application app;

    public ExampleActivityHandler(Application app) {
        super(app);
        this.app = app;
    }

    @Override
    public Activity getActivity() {
        JDA jda = this.app.bot.getJda();
        return Activity.playing(jda.getGuilds().size()+"サーバー | Developed by cron.jp");
    }

    @Override
    public OnlineStatus getOnlineStatus() {
        return OnlineStatus.IDLE;
    }
}
