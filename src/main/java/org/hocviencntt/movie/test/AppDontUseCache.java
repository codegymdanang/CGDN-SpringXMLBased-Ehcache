package org.hocviencntt.movie.test;

import org.hocviencntt.move.dao.MovieDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppDontUseCache {

	private static final Logger log = LoggerFactory.getLogger(AppConfig.class);

	public static void main(String[] args) {

	    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	    MovieDao obj = (MovieDao) context.getBean("movieDao");

	    log.debug("Result : {}", obj.findByDirectory("dummy"));
	    log.debug("Result : {}", obj.findByDirectory("dummy"));
	    log.debug("Result : {}", obj.findByDirectory("dummy"));

	}
}
