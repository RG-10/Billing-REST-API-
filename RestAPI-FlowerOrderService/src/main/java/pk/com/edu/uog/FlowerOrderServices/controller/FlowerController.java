package pk.com.edu.uog.FlowerOrderServices.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pk.com.edu.uog.FlowerOrderServices.entity.Flower;
import pk.com.edu.uog.FlowerOrderServices.service.FlowerService;




@RestController
public class FlowerController {
	
	@Autowired
	private FlowerService service;
	
	
	@PostMapping("/addFlower")
    public Flower addFlower(@RequestBody Flower flower) {
        return service.saveFlowers(flower);
    }

    @PostMapping("/addFlowers")
    public List<Flower> addFlowers(@RequestBody List<Flower> flowers) {
        return service.saveFlowers(flowers);
    }
    
    
    
    
    
    @GetMapping("/flowers")
    public List<Flower> findAllFlowers() {
        return service.getFlowers();
    }

    @GetMapping("/flowerById/{id}")
    public Flower findFlowerById(@PathVariable int id) {
        return service.getFlowerById(id);
    }

    @GetMapping("/product/{name}")
    public Flower findFlowerByName(@PathVariable String name) {
        return service.getFlowerByName(name);
    }
	
    
    
    
    @PutMapping("/update")
    public Flower updateFlower(@RequestBody Flower flower) {
        return service.updateFlower(flower);
    }
    
         

    @DeleteMapping("/delete/{id}")
    public String deleteFlower(@PathVariable int id) {
        return service.deleteFlower(id);
    }   

}
