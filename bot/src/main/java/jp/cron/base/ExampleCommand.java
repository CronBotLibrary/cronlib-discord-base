package jp.cron.base;

import com.jagrosh.jdautilities.command.SlashCommandEvent;
import jp.cron.cronlib.api.Command;
import jp.cron.cronlib.api.Listener;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.interactions.DiscordLocale;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class ExampleCommand extends Command {

    public ExampleCommand() {
        this.name = "ping";
        this.descriptionLocalization = new HashMap<>();
        this.descriptionLocalization.put(DiscordLocale.JAPANESE, "pingを表示");
    }


    @Override
    protected void execute(SlashCommandEvent event) {

        event.reply("Ping: "+event.getJDA().getGatewayPing()+"ms").queue();

    }
}
