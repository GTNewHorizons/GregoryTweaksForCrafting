package net.blay09.mods.craftingtweaks.config;

import com.gtnewhorizon.gtnhlib.config.Config;

import net.blay09.mods.craftingtweaks.CraftingTweaks;

@Config(modid = CraftingTweaks.MOD_ID, filename = "craftingtweaks-general")
@Config.Comment("General configuration options for Crafting Tweaks.")
public class CraftingTweaksConfig {

    @Config.Comment(
        "This option is toggled by the 'Toggle Buttons' key that can be defined in the Controls settings.")
    @Config.DefaultBoolean(false)
    public static boolean hideButtons;

    @Config.Comment("Set this to true if you don't want the tweak buttons' tooltips to show.")
    @Config.DefaultBoolean(false)
    public static boolean hideButtonTooltips;

    @Config.Sync
    @Config.Comment(
        "Set this to true if you want the (de)compress feature to work outside of crafting GUIs (only works if installed on server).")
    @Config.DefaultBoolean(false)
    public static boolean compressAnywhere;
}
