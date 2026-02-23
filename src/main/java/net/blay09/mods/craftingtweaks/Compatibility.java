package net.blay09.mods.craftingtweaks;

import net.blay09.mods.craftingtweaks.addon.GanysDualWorktableTweakProvider;
import net.blay09.mods.craftingtweaks.addon.TerraFirmaCraftTweakProvider;
import net.blay09.mods.craftingtweaks.api.CraftingTweaksAPI;
import net.blay09.mods.craftingtweaks.api.SimpleTweakProvider;
import net.blay09.mods.craftingtweaks.api.TweakProvider;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerPlayer;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.util.EnumFacing;

import cpw.mods.fml.common.Loader;

public final class Compatibility {

    private Compatibility() {}

    public static void vanilla() {
        SimpleTweakProvider provider = CraftingTweaksAPI.registerSimpleProvider("minecraft", ContainerWorkbench.class);
        configureStandardTweakButtons(provider);

        provider = CraftingTweaksAPI.registerSimpleProvider("minecraft", ContainerPlayer.class);
        provider.setGrid(1, 4);
        configureOriginTweakButtons(provider, true, false, true, false, true, false);
    }

    public static void twilightforest() {
        SimpleTweakProvider provider = registerSimpleProvider(
            "TwilightForest",
            "twilightforest.uncrafting.ContainerTFUncrafting");
        if (provider != null) {
            provider.setGrid(2, 9);
            configureStandardTweakButtons(provider);
        }
    }

    public static void tinkersconstruct() {
        SimpleTweakProvider provider = registerSimpleProvider(
            "TConstruct",
            "tconstruct.tools.inventory.CraftingStationContainer");
        if (provider != null) {
            configureStandardTweakButtons(provider);
        }
    }

    public static void thermalexpansion() {
        SimpleTweakProvider provider = registerSimpleProvider(
            "ThermalExpansion",
            "cofh.thermalexpansion.gui.container.device.ContainerWorkbench");
        if (provider != null) {
            provider.setGrid(58, 9);
            configureOriginTweakButtons(provider, true, false, false, false, true, false);
            provider.setPhantomItems(true);
            provider.setAlignToGrid(EnumFacing.WEST);
        }
    }

    public static void thaumcraft4() {
        SimpleTweakProvider provider = registerSimpleProvider(
            "Thaumcraft",
            "thaumcraft.common.container.ContainerArcaneWorkbench");
        if (provider != null) {
            provider.setGrid(2, 9);
            configureTweakButtons(provider, true, true, -12, 40, true, true, -12, 58, true, true, -12, 76);
        }
    }

    public static void rotarycraft() {
        SimpleTweakProvider provider = registerSimpleProvider(
            "RotaryCraft",
            "Reika.RotaryCraft.Containers.ContainerHandCraft");
        if (provider != null) {
            configureStandardTweakButtons(provider);
        }
    }

    public static void natura() {
        SimpleTweakProvider provider = registerSimpleProvider("Natura", "mods.natura.gui.WorkbenchContainer");
        if (provider != null) {
            configureStandardTweakButtons(provider);
        }
    }

    public static void minefactoryreloaded() {
        SimpleTweakProvider provider = registerSimpleProvider(
            "MineFactoryReloaded",
            "powercrystals.minefactoryreloaded.gui.container.ContainerLiquiCrafter");
        if (provider != null) {
            provider.setGrid(0, 9);
            configureOriginTweakButtons(provider, true, false, false, false, true, false);
            provider.setPhantomItems(true);
            provider.setAlignToGrid(EnumFacing.WEST);
        }
    }

    public static void jacb() {
        SimpleTweakProvider provider = registerSimpleProvider("jacb", "tv.vanhal.jacb.gui.BenchContainer");
        if (provider != null) {
            configureStandardTweakButtons(provider);
        }
    }

    public static void draconicevolution() {
        SimpleTweakProvider provider = registerSimpleProvider(
            "DraconicEvolution",
            "com.brandon3055.draconicevolution.common.container.ContainerDraconiumChest");
        if (provider != null) {
            provider.setGrid(241, 9);
            configureOriginTweakButtons(provider, true, false, true, false, true, false);
            provider.setAlignToGrid(EnumFacing.WEST);
        }
    }

    public static void buildcraft() {
        SimpleTweakProvider provider = registerSimpleProvider(
            "BuildCraft|Factory",
            "buildcraft.factory.gui.ContainerAutoWorkbench");
        if (provider != null) {
            provider.setGrid(2, 9);
            provider.setPhantomItems(true);
            configureStandardTweakButtons(provider);
        }
    }

    public static void bluepower() {
        SimpleTweakProvider provider = registerSimpleProvider(
            "bluepower",
            "com.bluepowermod.container.ContainerProjectTable");
        if (provider != null) {
            provider.setGrid(0, 9);
            configureTweakButtons(provider, true, true, 14, 35, true, true, 14, 52, true, false, 0, 0);
        }
    }

    public static void bibliocraft() {
        SimpleTweakProvider provider = registerSimpleProvider(
            "BiblioCraft",
            "jds.bibliocraft.blocks.ContainerFancyWorkbench");
        if (provider != null) {
            provider.setGrid(10, 9);
            configureTweakButtons(provider, true, true, 42, 16, true, true, 42, 34, true, true, 42, 52);
        }
    }

    public static void backpacks() {
        SimpleTweakProvider provider = registerSimpleProvider(
            "Backpack",
            "de.eydamos.backpack.inventory.container.ContainerWorkbenchBackpack");
        if (provider != null) {
            configureOriginTweakButtons(provider, true, true, false, false, true, false);
            provider.setPhantomItems(true);
            provider.setAlignToGrid(EnumFacing.WEST);
        }
    }

    public static void railcraft() {
        SimpleTweakProvider provider = registerSimpleProvider(
            "Railcraft",
            "mods.railcraft.common.gui.containers.ContainerCartWork");
        if (provider != null) {
            configureStandardTweakButtons(provider);
        }
        provider = registerSimpleProvider("Railcraft", "mods.railcraft.common.gui.containers.ContainerRollingMachine");
        if (provider != null) {
            provider.setGrid(2, 9);
            configureOriginTweakButtons(provider, true, true, false, false, true, true);
            provider.setAlignToGrid(EnumFacing.WEST);
        }
    }

    public static void ganyssurface() {
        SimpleTweakProvider provider = registerSimpleProvider(
            "ganyssurface",
            "ganymedes01.ganyssurface.inventory.ContainerWorkTable");
        if (provider != null) {
            configureStandardTweakButtons(provider);
        }
        registerProvider(
            "ganymedes01.ganyssurface.inventory.ContainerDualWorkTable",
            new GanysDualWorktableTweakProvider());
    }

    public static void appliedenergistics2() {
        SimpleTweakProvider provider = registerSimpleProvider(
            "appliedenergistics2",
            "appeng.container.implementations.ContainerCraftingTerm");
        if (provider != null) {
            provider.setGrid(5, 9);
            configureStandardTweakButtons(provider);
        }
        provider = registerSimpleProvider(
            "appliedenergistics2",
            "appeng.container.implementations.ContainerPatternTerm");
        if (provider != null) {
            provider.setGrid(5, 9);
            configureOriginTweakButtons(provider, true, false, false, false, true, false);
            provider.setPhantomItems(true);
            provider.setAlignToGrid(EnumFacing.WEST);
        }
    }

    public static void avaritia() {
        SimpleTweakProvider provider = registerSimpleProvider(
            "Avaritia",
            "fox.spiteful.avaritia.gui.ContainerExtremeCrafting");
        if (provider != null) {
            provider.setGrid(1, 81);
            configureOriginTweakButtons(provider, false, false, true, true, true, true);
            provider.setAlignToGrid(EnumFacing.WEST);
        }
    }

    public static void forestry() {
        SimpleTweakProvider provider = registerSimpleProvider("Forestry", "forestry.factory.gui.ContainerWorktable");
        if (provider != null) {
            provider.setGrid(54, 9);
            configureOriginTweakButtons(provider, true, true, false, false, true, true);
            provider.setPhantomItems(true);
            provider.setAlignToGrid(EnumFacing.WEST);
        }
    }

    public static void terrafirmacraft() {
        registerProvider("com.bioxx.tfc.Containers.ContainerPlayerTFC", new TerraFirmaCraftTweakProvider());
    }

    private static SimpleTweakProvider registerSimpleProvider(String modid, String className) {
        if (!isModAvailable(modid)) {
            return null;
        }

        try {
            Class<? extends Container> containerClass = Class.forName(className)
                .asSubclass(Container.class);
            return CraftingTweaksAPI.registerSimpleProvider(modid, containerClass);
        } catch (ClassNotFoundException | ClassCastException e) {
            CraftingTweaks.logger.warn(
                "Could not register Crafting Tweaks addon for {} using class {} - internal names may have changed.",
                modid,
                className,
                e);
            return null;
        }
    }

    private static void registerProvider(String className, TweakProvider provider) {
        if (!isModAvailable(provider.getModId())) {
            return;
        }

        try {
            Class<? extends Container> containerClass = Class.forName(className)
                .asSubclass(Container.class);
            CraftingTweaksAPI.registerProvider(containerClass, provider);
        } catch (ClassNotFoundException | ClassCastException e) {
            CraftingTweaks.logger.warn(
                "Could not register Crafting Tweaks addon for {} using class {} - internal names may have changed.",
                provider.getModId(),
                className,
                e);
        }
    }

    private static boolean isModAvailable(String modid) {
        return "minecraft".equals(modid) || Loader.isModLoaded(modid);
    }

    private static void configureStandardTweakButtons(SimpleTweakProvider provider) {
        configureOriginTweakButtons(provider, true, true, true, true, true, true);
        provider.setAlignToGrid(EnumFacing.WEST);
    }

    private static void configureOriginTweakButtons(SimpleTweakProvider provider, boolean rotateEnabled,
        boolean rotateShowButton, boolean balanceEnabled, boolean balanceShowButton, boolean clearEnabled,
        boolean clearShowButton) {
        configureTweakButtons(
            provider,
            rotateEnabled,
            rotateShowButton,
            0,
            0,
            balanceEnabled,
            balanceShowButton,
            0,
            0,
            clearEnabled,
            clearShowButton,
            0,
            0);
    }

    private static void configureTweakButtons(SimpleTweakProvider provider, boolean rotateEnabled,
        boolean rotateShowButton, int rotateButtonX, int rotateButtonY, boolean balanceEnabled,
        boolean balanceShowButton, int balanceButtonX, int balanceButtonY, boolean clearEnabled,
        boolean clearShowButton, int clearButtonX, int clearButtonY) {
        provider.setTweakRotate(rotateEnabled, rotateShowButton, rotateButtonX, rotateButtonY);
        provider.setTweakBalance(balanceEnabled, balanceShowButton, balanceButtonX, balanceButtonY);
        provider.setTweakClear(clearEnabled, clearShowButton, clearButtonX, clearButtonY);
    }
}
