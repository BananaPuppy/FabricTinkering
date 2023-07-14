package net.bruhcraft.fabrictinkering.types;

import java.util.List;

public class Material {
    private final String path;
    private final Integer predicate;
    private List<Part> parts;

    public Material(String path, Integer predicate){
        this.path = path;
        this.predicate = predicate;
    }

    public void setParts(List<Part>parts){
        this.parts = parts;
    }

    @SuppressWarnings("unused")
    public void addPart(Part part){
        this.parts.add(part);
    }

    @SuppressWarnings("unused")
    public void removePart(Part part){
        this.parts.remove(part);
    }

    public List<Part> getParts(){
        return this.parts;
    }


    public boolean containsPart(Part part){
        return parts.contains(part);
    }

    public String getPath(){
        return this.path;
    }

    public Float getPredicate(){
        return ((float)this.predicate) / 100000;
    }
}
