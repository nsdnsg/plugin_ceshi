package net.mcbbs.mxddl;

public class plugin2 {
	extends JavaPlugin implements Listener
	 @Override

	 public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){if (cmd.getName().equalsIgnoreCase("[ЦёБо]")){
	 sender.sendMessage("HAYO");
	 return true;
	 }
	 return false;
	 }
}