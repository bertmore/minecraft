package be.buschop.minecraft.controller;

import be.buschop.minecraft.model.Animal;
import be.buschop.minecraft.model.Food;
import be.buschop.minecraft.model.Material;
import be.buschop.minecraft.repositories.AnimalRepository;
import be.buschop.minecraft.repositories.MaterialRepository;
import be.buschop.minecraft.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;


@Controller
public class MainController {
    @Autowired
    private AnimalRepository animalRepository;
    @Autowired
    private FoodRepository foodRepository;
    @Autowired
    private MaterialRepository materialRepository;

    @GetMapping({"/", "/home"})
    public String home(Model model) {
    List<Animal> animals = animalRepository.findAllByOrderByNameAsc();
    //split Animal list in 3 lists
        int list1correction = 0;
        int list2correction = 0;
        if(animals.size()%3>0)
        {
            list1correction ++;
            if(animals.size()%3>1)
            {
                list2correction = 1;
            }
        }

        List<Animal> animals1  = animals.subList(0,animals.size()/3 + list1correction);
        List<Animal> animals2  = animals.subList(animals.size()/3 + list1correction,(animals.size()/3)*2 + list1correction + list2correction);
        List<Animal> animals3  = animals.subList((animals.size()/3)*2 + list1correction + list2correction,animals.size());

    List<Food> foods = foodRepository.findAllByOrderByNameAsc();
        //split food list in 3 lists
        int foodlist1correction = 0;
        int foodlist2correction = 0;
        if(foods.size()%3>0)
        {
            foodlist1correction ++;
            if(foods.size()%3>1)
            {
                foodlist2correction = 1;
            }
        }

        List<Food> foods1  = foods.subList(0,foods.size()/3 + foodlist1correction);
        List<Food> foods2  = foods.subList(foods.size()/3 + foodlist1correction,(foods.size()/3)*2 + foodlist1correction + foodlist2correction);
        List<Food> foods3  = foods.subList((foods.size()/3)*2 + foodlist1correction + foodlist2correction,foods.size());

        List<Material> materials = materialRepository.findAllByOrderByNameAsc();
        //split material list in 3 lists
        int materiallist1correction = 0;
        int materiallist2correction = 0;
        if(materials.size()%3>0)
        {
            materiallist1correction ++;
            if(materials.size()%3>1)
            {
                materiallist2correction = 1;
            }
        }

        List<Material> materials1  = materials.subList(0,materials.size()/3 + materiallist1correction);
        List<Material> materials2  = materials.subList(materials.size()/3 + materiallist1correction,(materials.size()/3)*2 + materiallist1correction + materiallist2correction);
        List<Material> materials3  = materials.subList((materials.size()/3)*2 + materiallist1correction + materiallist2correction,materials.size());


        model.addAttribute("animals", animals);
    model.addAttribute("animals1", animals1);
    model.addAttribute("animals2", animals2);
    model.addAttribute("animals3", animals3);
    model.addAttribute("foods", foods);
    model.addAttribute("foods1", foods1);
    model.addAttribute("foods2", foods2);
    model.addAttribute("foods3", foods3);
    model.addAttribute("materials", materials);
        model.addAttribute("materials1", materials1);
        model.addAttribute("materials2", materials2);
        model.addAttribute("materials3", materials3);
        return "home";
    }

    @GetMapping({"/animal","/animal/{index}"})
    public String animalById(Model model,
                             @PathVariable(required = false)  Integer index){
        model.addAttribute("animal", animalRepository.findById(index));
        return "animal";
    }

    @GetMapping({"/food","/food/{index}"})
    public String foodById(Model model,
                             @PathVariable(required = false)  Integer index){
        model.addAttribute("food", foodRepository.findById(index));
        return "food";
    }

    @GetMapping({"/materiaal","/materiaal/{index}"})
    public String materialById(Model model,
                           @PathVariable(required = false)  Integer index){
        model.addAttribute("material", materialRepository.findById(index));
        return "material";
    }
}
