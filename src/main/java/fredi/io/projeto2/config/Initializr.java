package fredi.io.projeto2.config;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import fredi.io.projeto2.entity.User;
import fredi.io.projeto2.repository.UserRepository;

@Component
public class Initializr implements ApplicationListener<ContextRefreshedEvent> {

	
	@Autowired
	UserRepository userRepository;
	
	
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		
		System.out.println("iniciando os dados");
		
		User u = userRepository.findUserByQuery("fredi2@fdagostin.com.br");
		
		System.out.println(" usuario encontrado by email "+ u.getName());
		
		
		
		//ArrayList<User> usuarios = (ArrayList<User>) userRepository.findAll();
		
		/*
		 * createUser("carlos", "carlos@gmail.com"); createUser("Paula",
		 * "paula@gmail.com"); createUser("Joana", "joana@gmail.com");
		 * 
		 * for(User us : usuarios) { System.out.println(us.getId());
		 * System.out.println(us.getName()); System.out.println(us.getEmail());
		 * 
		 * }
		 */
		//User userd = userRepository.findByName("joana");
		
		//User userd = userRepository.findUserByQuery("joana");
		//System.out.println("Äpagando o usuario "+ userd.getName()+" "+userd.getEmail());
		
		/*
		 * deletaUsuario(userd); usuarios = listaUsuarios(); for(User us : usuarios) {
		 * System.out.println(us.getId()); System.out.println(us.getName());
		 * System.out.println(us.getEmail());
		 * 
		 * }
		 */
		
		
		//if (usuarios.isEmpty()) {
			
		/*
		 * User u = new User(); User u2 = new User(); User u3 = new User();
		 * 
		 * u.setName("Fredi Samuel D Agostin 2"); u.setEmail("fredi2@fdagostin.com.br");
		 * userRepository.save(u);
		 * 
		 * u2.setName("Fredi Samuel D Agostin 3");
		 * u2.setEmail("fredi3@fdagostin.com.br"); userRepository.save(u2);
		 * 
		 * u3.setName("Fredi Samuel D Agostin 4");
		 * u3.setEmail("fredi4@fdagostin.com.br"); userRepository.save(u3);
		 */
			/*
			 * ArrayList<User> users = new ArrayList<>(); users.add(u); users.add(u2);
			 * users.add(u3);
			 * 
			 * 
			 * userRepository.saveAll(users);
			 */
			
			/*
			 * }else {
			 * 
			 * //usuarios.stream().forEach(user->System.out.println(user.getName()));
			 * for(User us : usuarios) { System.out.println(us.getId());
			 * System.out.println(us.getName()); System.out.println(us.getEmail());
			 * 
			 * } }
			 */
	
	}
	/*
	 * public void createUser(String name, String email) {
	 * 
	 * User u = new User(name,email);
	 * 
	 * userRepository.save(u); } public User buscaUsuario(Long id) {
	 * 
	 * User u = new User();
	 * 
	 * u= userRepository.getOne(id); return u;
	 * 
	 * } public void deletaUsuario(User u) {
	 * 
	 * userRepository.delete(u);
	 * 
	 * } public ArrayList<User> listaUsuarios (){ ArrayList<User> usuarios =
	 * (ArrayList<User>) userRepository.findAll();
	 * 
	 * return usuarios;
	 * 
	 * }
	 */
	
	
}
