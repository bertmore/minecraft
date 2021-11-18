package be.buschop.minecraft.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Animal {
    @Id
    private int id;
    private String name;
    @Column(length = 2500)
    private String description;
    private String image;
    @ManyToMany
    private Collection<Food> food;
    @ManyToMany
    private Collection<Material> material;

    public Animal() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Collection<Food>getFood() {
        return food;
    }

    public void setFood(Collection<Food> food) {
        this.food = food;
    }

    public Collection<Material> getMaterial() {
        return material;
    }

    public void setMaterial(Collection<Material> material) {
        this.material = material;
    }
}
