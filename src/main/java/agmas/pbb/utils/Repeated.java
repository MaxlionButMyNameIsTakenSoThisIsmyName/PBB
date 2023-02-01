package agmas.pbb.utils;

//for things that happen constantly, resetting player to prisoner, etc.

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerAnimationEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class Repeated {
    // lol funny function name!!!!!! lmao!!!!!!!!!
    public static void prisonerify(Player p) {
        p.getInventory().clear();
        Var.roleHashMap.put(p.getUniqueId(), Role.PRISONER);
        setKit(p);
    }



    public static void setKit(Player p) {
        if (Var.getPlayerRole(p).equals(Role.GUARD)) {
            p.getInventory().clear();
            ItemStack wardenSword = new ItemStack(Material.IRON_SWORD);
            wardenSword.addEnchantment(Enchantment.DAMAGE_ALL, 1);
            wardenSword.addEnchantment(Enchantment.DURABILITY, 2);
            p.getInventory().addItem(wardenSword);

            ItemStack card = new ItemStack(Material.TRIPWIRE_HOOK);
            ItemMeta cardm = card.getItemMeta();
            cardm.setDisplayName(ChatColor.BLUE + "Keycard " + ChatColor.RED + "[CONTRABAND]");
            card.setItemMeta(cardm);
            p.getInventory().addItem(card);
            p.getInventory().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
            p.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
            p.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
            p.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
        }
        if (Var.getPlayerRole(p).equals(Role.WARDEN)) {
            p.getInventory().clear();
            ItemStack wardenSword = new ItemStack(Material.DIAMOND_SWORD);
            wardenSword.addEnchantment(Enchantment.DAMAGE_ALL, 2);
            wardenSword.addEnchantment(Enchantment.DURABILITY, 2);
            p.getInventory().addItem(wardenSword);

            ItemStack card = new ItemStack(Material.TRIPWIRE_HOOK);
            ItemMeta cardm = card.getItemMeta();
            cardm.setDisplayName(ChatColor.BLUE + "Keycard " + ChatColor.RED + "[CONTRABAND]");
            card.setItemMeta(cardm);
            p.getInventory().addItem(card);
            p.getInventory().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
            p.getInventory().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
            p.getInventory().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
            p.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
        }
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
