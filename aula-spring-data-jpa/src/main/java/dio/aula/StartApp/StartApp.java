package dio.aula.StartApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
	
	@Autowired
	private UserRepository repository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user01 = new User();
		
		user01.setName("Leandro Santana");
		user01.setUserName("leandroS");
		user01.setPassword("leandro123");
		
		repository.save(user01);
		

		for(User u: repository.findAll()) {
			System.out.println(u);
		}
	}
	
}
