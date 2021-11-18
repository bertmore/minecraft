package be.buschop.minecraft.repositories;

import be.buschop.minecraft.model.Animal;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnimalRepository extends CrudRepository<Animal, Integer> {
    public List<Animal> findAllByOrderByNameAsc();
}
