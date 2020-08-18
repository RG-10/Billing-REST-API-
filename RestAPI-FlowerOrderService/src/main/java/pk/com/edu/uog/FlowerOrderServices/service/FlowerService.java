package pk.com.edu.uog.FlowerOrderServices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pk.com.edu.uog.FlowerOrderServices.entity.Flower;
import pk.com.edu.uog.FlowerOrderServices.repository.FlowerRepository;


@Service
public class FlowerService {
	
              @Autowired
              private FlowerRepository repository;
	
	
            public Flower saveFlowers(Flower flower) {
      	        return repository.save(flower);
      	    }

      	    public List<Flower> saveFlowers(List<Flower> flowers) {
      	        return repository.saveAll(flowers);
      	    }


      	    
      	  public List<Flower> getFlowers() {
  	        return repository.findAll();
  	    }

  	    public Flower getFlowerById(int id) {
  	        return repository.findById(id).orElse(null);
  	    }

  	    public Flower getFlowerByName(String name) {
  	        return repository.findByName(name);
  	    }
  	    

  	  public String deleteFlower(int id) {
	        repository.deleteById(id);
	        return "flower removed !! " + id;
	    }
	    
	    
	    
	    
	    

	    public Flower updateFlower(Flower flower) {
	    	
	    	Flower existingFlower = repository.findById(flower.getId()).orElse(null);
	        
	    	existingFlower.setName(flower.getName());
	        
	    	existingFlower.setQuantity(flower.getQuantity());
	        
	    	existingFlower.setPrice(flower.getPrice());
	        
	        return repository.save(existingFlower);
	    }



}