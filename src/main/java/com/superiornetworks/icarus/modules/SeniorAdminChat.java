package com.superiornetworks.icarus.modules;

import com.superiornetworks.icarus.ICM_Rank;
import com.superiornetworks.icarus.IcarusMod;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SeniorAdminChat extends IcarusModule
{

    public SeniorAdminChat(IcarusMod plugin)
    {
        super(plugin);
    }

    public static void chat(CommandSender sender, String message)
    {
        for (Player p : Bukkit.getOnlinePlayers())
        {
            if (ICM_Rank.isRankOrHigher(p, ICM_Rank.Rank.SENIOR))
            {
                // Some strange ass colour codes being used here...
                p.sendMessage("§f[§bADMIN§f] §4" + sender.getName() + ChatColor.GRAY + " [" + ChatColor.DARK_PURPLE + ICM_Rank.getRank(sender) + ChatColor.GRAY + "] "+ ChatColor.AQUA + message);
            }
        }
    }
}
