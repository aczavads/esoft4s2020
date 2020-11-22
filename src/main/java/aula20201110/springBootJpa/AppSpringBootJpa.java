package aula20201110.springBootJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppSpringBootJpa implements CommandLineRunner  {
    @Autowired
    private VinhoService vinhoService;

    public static void main(String[] args) {
        SpringApplication.run(AppSpringBootJpa.class, args).close();;
    }

	@Override
	public void run(String... args) throws Exception {
        //vinhoService.criarVinhos();
        System.out.println(vinhoService.sayHello());
        for (Vinho v : vinhoService.obterTodos()) {
            System.out.println(v);
        }
	}
    
}
