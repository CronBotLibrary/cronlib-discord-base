package jp.cron.base;

import jp.cron.cronlib.api.Listener;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import org.jetbrains.annotations.NotNull;

public class ExampleListener extends Listener {

    @Override
    public void onReady(@NotNull ReadyEvent event) {
        System.out.println("READY!!");
    }
}
