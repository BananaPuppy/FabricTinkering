package net.bruhcraft.fabrictinkering.types;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.List;

public class Part {
    private final String path;
    private List<Material> materials;
    private final Item baseItem;

    public Part(String name, Item baseItem){
        this.path = name;
        this.baseItem = baseItem;
    }

    public void setMaterials(List<Material> materials){
        this.materials = materials;
    }

    public void addMaterial(Material material){
        this.materials.add(material);
    }

    public void removeMaterial(Material material){
        this.materials.remove(material);
    }

    public List<Material> getMaterials(){
        return this.materials;
    }

    public boolean containsMaterial(Material material){
        return materials.contains(material);
    }

    public String getPath(){
        return this.path;
    }

    public Item getBaseItem(){
        return this.baseItem;
    }
}
