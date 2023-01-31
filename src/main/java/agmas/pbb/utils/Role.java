package agmas.pbb.utils;

import org.bukkit.ChatColor;

public enum Role {

    PRISONER("Prisoner", ChatColor.GOLD),
    NURSE("Nurse", ChatColor.LIGHT_PURPLE),
    GUARD("Guard", ChatColor.BLUE),
    SWAT("SWAT", ChatColor.DARK_GRAY),
    WARDEN("Warden", ChatColor.RED);

    public String displayName;
    public ChatColor roleColor;

    Role(String displayName, ChatColor roleColor) {this.displayName = displayName; this.roleColor = roleColor;}
}
