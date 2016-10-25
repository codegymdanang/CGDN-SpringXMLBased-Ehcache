package org.hocviencntt.move.dao;

import org.hocviencntt.movie.model.Movie;

public interface MovieDao {

	Movie findByDirectory(String name);
}
