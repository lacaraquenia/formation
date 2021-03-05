package net.guides.springboot2.springboot2jpacrudexample;

import javafx.fxml.Initializable;
import net.guides.springboot2.springboot2jpacrudexample.datas.MockEmployee;
import net.guides.springboot2.springboot2jpacrudexample.datas.MockEquipe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@PostConstruct
	private void init(){
		System.out.println("init");
		MockEmployee.init();
		MockEquipe.init();
	}


}
