package be.buschop.minecraft.repositories;

import be.buschop.minecraft.model.Food;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FoodRepository extends CrudRepository<Food, Integer> {
    public List<Food> findAllByOrderByNameAsc();
}
