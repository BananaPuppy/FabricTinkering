package net.bruhcraft.fabrictinkering.registries.items.parts;

import net.bruhcraft.fabrictinkering.MainClass;
import net.bruhcraft.fabrictinkering.registries.items.PartItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Set;

import static net.bruhcraft.fabrictinkering.MainClass.MOD_ID;
import static net.bruhcraft.fabrictinkering.registries.ModRegisters.MATERIAL_REGISTRY;

public class repair_kit extends PartItem {
    //TODO: TURN LIST<STRING> INTO REGISTRY.MATERIAL
    static List<String> materials = List.of("aluminum","amethyst_bronze","bamboo","blazing_bone","bloodbone","bone","bronze","chorus","cobalt","constantan","copper","copper_oxidized","darkthread","electrum","ender_pearl","enderslime","flint","flint_basalt","glass","gold","hepatizon","invar","iron","iron_oxidized","lead","leather","manyullyn","nahuati","necromium","necrotic_bone","osmium","phantom","pig_iron","plated_slimewood","platinum","queens_slime","rock_andesite","rock_blackstone","rock_deepslate","rock_diorite","rock_granite","rock_stone","rose_gold","rotten_flesh","scorched_stone","seared_stone","silver","slimesteel","slimewood_bloodshroom","slimewood_greenheart","slimewood_skyroot","steel","string","tungsten","whitestone","whitestone_end","wood","wood_acacia","wood_birch","wood_crimson","wood_dark_oak","wood_jungle","wood_oak","wood_spruce","wood_warped");

    public repair_kit(FabricItemSettings settings) {
        super(settings);
    }


    public static float getMaterialNBT(ItemStack itemStack){
        NbtCompound nbt = itemStack.getNbt();
        if(nbt != null && nbt.contains("material")){
            String material = nbt.getString("material");
            Identifier identifier = Identifier.tryParse(material);
            if(MATERIAL_REGISTRY.get(identifier) != null){
                return MATERIAL_REGISTRY.get(identifier).getPredicate();
            }
        }
        return 0.0f;
    }
}
