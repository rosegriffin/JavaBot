package RWC.BotCommand;

import RWC.Bot.Bot;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

//Hey my name is Franco. I am making some modifications to the code.

public class Meet extends Command {
	
	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent event, String[] args) {
		EmbedBuilder meet = new EmbedBuilder();
		meet.setTitle("📅 Meeting Schedule");
		meet.setDescription("Weekly meeting schedule");
		meet.addField("THURSDAY","5-6 PM",false);
		meet.setColor(0x3452eb);
		meet.setFooter("Here you go!",event.getMember().getUser().getAvatarUrl());
		
		event.getChannel().sendMessageEmbeds(meet.build()).queue();
		meet.clear();
	}

	@Override
	public String getName() {
		return "Meet";
	}
	
	@Override
	public int getCategory() {
		return 1;
	}
	
	@Override
	public String getDescription() {
		return "Displays club meeting times";
	}

	@Override
	public String getExample() {
		return getDescription() + "\nExample: " + Bot.PREFIX + "" + getName();
	}



}