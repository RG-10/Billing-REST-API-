package pk.com.edu.uog.FlowerOrderServices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pk.com.edu.uog.FlowerOrderServices.entity.Flower;




public interface FlowerRepository extends JpaRepository<Flower, Integer>{
	
	Flower findByName(String name);

}
