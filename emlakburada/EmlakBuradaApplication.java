package emlakburada;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication


public class EmlakBuradaApplication {

	public static void main(String[] args) {
		
	SpringApplication.run(EmlakBuradaApplication.class, args);
	
		
	}
	
	
	
//	@Bean
//	public IlanService ilanService() {
//		return new IlanService();
//	}
//
//	@Bean
//	public IlanRepository ilanRespository() {
//		return new IlanRepository();
//	}

	/*
	 * ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(EmlakBuradaApplication.class, args);
		
		UserRepository userRepository = configurableApplicationContext.getBean(UserRepository.class);
		
		
		UserType testUserType = UserType.INDIVIDUAL;
		User testUser = new User(testUserType,"Batuhan","bbbb@gmail.com");
		userRepository.save(testUser);
	 */
	
	
}
