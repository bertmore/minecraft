package be.buschop.minecraft.repositories;

import be.buschop.minecraft.model.Material;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MaterialRepository extends CrudRepository<Material, Integer> {
    public List<Material> findAllByOrderByNameAsc();
}
