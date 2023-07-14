package net.bruhcraft.fabrictinkering.util;

import net.minecraft.util.Identifier;

import static net.bruhcraft.fabrictinkering.MainClass.MOD_ID;

public class Util {
    public static Identifier identifierFromPath(String path){
        path = path.replaceAll("[^a-z0-9/._-]+", "");
        return new Identifier(MOD_ID, path);
    }
}
