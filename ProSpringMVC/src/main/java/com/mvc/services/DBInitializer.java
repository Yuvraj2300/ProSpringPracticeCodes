package com.mvc.services;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.entities.Singer;

/**
 * Created by iuliana.cosmina on 4/23/17.
 */
@Service
public class DBInitializer {

	private Logger logger = LoggerFactory.getLogger(DBInitializer.class);
	@Autowired
	SingerService singerService;

	@PostConstruct
	public void initDB() {
		logger.info("Starting database initialization...");
		Singer singer = new Singer();
		singer.setFirstname("John");
		singer.setLastname("Mayer");
		singer.setBirthdate(new Date((new GregorianCalendar(1977, 9, 16)).getTime().getTime()));
		singerService.save(singer);

		singer = new Singer();
		singer.setFirstname("Eric");
		singer.setLastname("Clapton");
		singer.setBirthdate(new Date((new GregorianCalendar(1945, 2, 30)).getTime().getTime()));
		singerService.save(singer);

		singer = new Singer();
		singer.setFirstname("John");
		singer.setLastname("Butler");
		singer.setBirthdate(new Date((new GregorianCalendar(1975, 3, 1)).getTime().getTime()));
		singerService.save(singer);

		singer = new Singer();
		singer.setFirstname("B.B.");
		singer.setLastname("King");
		singer.setBirthdate(new Date((new GregorianCalendar(1925, 9, 16)).getTime().getTime()));
		singerService.save(singer);

		singer = new Singer();
		singer.setFirstname("Jimi");
		singer.setLastname("Hendrix");
		singer.setBirthdate(new Date((new GregorianCalendar(1942, 11, 27)).getTime().getTime()));
		singerService.save(singer);

		singer = new Singer();
		singer.setFirstname("Jimmy");
		singer.setLastname("Page");
		singer.setBirthdate(new Date((new GregorianCalendar(1944, 1, 9)).getTime().getTime()));
		singerService.save(singer);

		singer = new Singer();
		singer.setFirstname("Eddie");
		singer.setLastname("Van Halen");
		singer.setBirthdate(new Date((new GregorianCalendar(1955, 1, 26)).getTime().getTime()));
		singerService.save(singer);

		singer = new Singer();
		singer.setFirstname("Saul (Slash)");
		singer.setLastname("Hudson");
		singer.setBirthdate(new Date((new GregorianCalendar(1965, 7, 23)).getTime().getTime()));
		singerService.save(singer);

		singer = new Singer();
		singer.setFirstname("Stevie");
		singer.setLastname("Ray Vaughan");
		singer.setBirthdate(new Date((new GregorianCalendar(1954, 10, 3)).getTime().getTime()));
		singerService.save(singer);

		singer = new Singer();
		singer.setFirstname("David");
		singer.setLastname("Gilmour");
		singer.setBirthdate(new Date((new GregorianCalendar(1946, 3, 6)).getTime().getTime()));
		singerService.save(singer);

		singer = new Singer();
		singer.setFirstname("Kirk");
		singer.setLastname("Hammett");
		singer.setBirthdate(new Date((new GregorianCalendar(1992, 11, 18)).getTime().getTime()));
		singerService.save(singer);

		singer = new Singer();
		singer.setFirstname("Angus");
		singer.setLastname("Young");
		singer.setBirthdate(new Date((new GregorianCalendar(1955, 3, 31)).getTime().getTime()));
		singerService.save(singer);

		singer = new Singer();
		singer.setFirstname("Dimebag");
		singer.setLastname("Darrell");
		singer.setBirthdate(new Date((new GregorianCalendar(1966, 8, 20)).getTime().getTime()));
		singerService.save(singer);

		singer = new Singer();
		singer.setFirstname("Carlos");
		singer.setLastname("Santana");
		singer.setBirthdate(new Date((new GregorianCalendar(1947, 7, 20)).getTime().getTime()));
		singerService.save(singer);

		logger.info("Database initialization finished.");
	}
}
