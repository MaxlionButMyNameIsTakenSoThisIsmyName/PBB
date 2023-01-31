package agmas.pbb.utils;

//for things that happen constantly, resetting player to prisoner, etc.

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class Repeated {
    // lol funny function name!!!!!! lmao!!!!!!!!!
    public static void prisonerify(Player p) {
        p.getInventory().clear();
        Var.roleHashMap.put(p.getUniqueId(), Role.PRISONER);
        setKit(p);
    }

    public static void setKit(Player p) {
        if (Var.getPlayerRole(p).equals(Role.PRISONER)) {
            ItemStack orangechest = new ItemStack(Material.LEATHER_CHESTPLATE);
            LeatherArmorMeta chestmeta = (LeatherArmorMeta) orangechest.getItemMeta();
            chestmeta.setColor(Color.fromRGB(208, 133, 22));
            chestmeta.setDisplayName("Prisoner Chestplate");
            orangechest.setItemMeta(chestmeta);

            ItemStack orangeleg = new ItemStack(Material.LEATHER_LEGGINGS);
            LeatherArmorMeta orangelegItemMeta = (LeatherArmorMeta) orangeleg.getItemMeta();
            orangelegItemMeta.setColor(Color.fromRGB(208, 133, 22));
            orangelegItemMeta.setDisplayName("Prisoner Leggings");
            orangeleg.setItemMeta(orangelegItemMeta);

            ItemStack orangeboot = new ItemStack(Material.LEATHER_BOOTS);
            LeatherArmorMeta orangebootItemMeta = (LeatherArmorMeta) orangeboot.getItemMeta();
            orangebootItemMeta.setColor(Color.fromRGB(40, 20, 2));
            orangebootItemMeta.setDisplayName("Prisoner Boots");
            orangeboot.setItemMeta(orangebootItemMeta);

            p.getInventory().setChestplate(orangechest);
            p.getInventory().setLeggings(orangeleg);
            p.getInventory().setBoots(orangeboot);
        }
    }
}
