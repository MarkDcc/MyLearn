package com.example.Hibernate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootApplication
@Slf4j
public class HibernateApplication implements CommandLineRunner {

	@Autowired
	DataSource dataSource;

	@Autowired
	SpitterRepository spitterRepository;

	private Spitter spitter;

	public static void main(String[] args) {
		SpringApplication.run(HibernateApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		//showCon();
		this.spitter = new Spitter(1L,"CC","admin","DCC","cc@com",true);
		save(spitter);
		spitterRepository.findAll();

	}

	public void save(Spitter spitter){

		spitterRepository.save(spitter);
	}

	public void showCon() throws SQLException {
		log.info(dataSource.getConnection().toString());
	}
}
