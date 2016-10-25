package org.hocviencntt.move.dao;

import org.hocviencntt.movie.model.Movie;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Repository("movieDao")
public class MovieDaoImpl implements MovieDao {

	//This "movieFindCache" is delcares in ehcache.xml
	@Cacheable(value="movieFindCache", key="#name")
	@Override
	public Movie findByDirectory(String name) {
		
		slowQuery(2000L);
		System.out.println("findByDirector is running...");
		return new Movie(1,"Forrest Gump","Robert Zemeckis");
	}

	private void slowQuery(long seconds){
	    try {
                Thread.sleep(seconds);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
	}
	

}
