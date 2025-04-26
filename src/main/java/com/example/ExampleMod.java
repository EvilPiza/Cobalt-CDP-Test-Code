package com.example;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import com.github.evilpiza.cobaltcdp.RichPresence;

@Mod(modid = "examplemod", useMetadata=true)
public class ExampleMod {
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        RichPresence MightyMinerv2When = new RichPresence();
        MightyMinerv2When.init();   // You HAVE to run init before doing anything!!
        MightyMinerv2When.SetDiscordAppID(" APP ID GOES HERE ");
        MightyMinerv2When.SetPresence("Playing Minecraft", "omg cobalt omg");
    }
}
