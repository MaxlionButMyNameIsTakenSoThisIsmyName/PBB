package agmas.pbb.utils;

import org.bukkit.ChatColor;

public enum Role {

    PRISONER("Prisoner", ChatColor.GOLD, ChatColor.DARK_GRAY),
    NURSE("Nurse", ChatColor.LIGHT_PURPLE, ChatColor.GRAY),
    GUARD("Guard", ChatColor.BLUE, ChatColor.GRAY),
    SWAT("SWAT", ChatColor.DARK_GRAY, ChatColor.GRAY),
    WARDEN("Warden", ChatColor.RED, ChatColor.WHITE);

    public String displayName;
    public ChatColor ChattingColor;
    public ChatColor roleColor;

    Role(String displayName, ChatColor roleColor, ChatColor ChattingColor) {this.displayName = displayName; this.roleColor = roleColor; this.ChattingColor = ChattingColor;}
}
