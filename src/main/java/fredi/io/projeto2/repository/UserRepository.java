package fredi.io.projeto2.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import fredi.io.projeto2.entity.User;

public interface UserRepository extends MongoRepository<User, Long> {
	
	
	  User findByName(String name);
	  
	  @Query("{'email' : ?0}") 
	  User findUserByQuery(String name);
	 
}
