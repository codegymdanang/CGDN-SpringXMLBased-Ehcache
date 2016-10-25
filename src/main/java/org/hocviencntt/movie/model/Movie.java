package org.hocviencntt.movie.model;

import java.io.Serializable;

public class Movie implements Serializable {

	private int id;
	private String name;
	private String directory;
	public int getId() {
		return id;
	}
	
	public Movie(int id,String name,String directory) {
		this.id = id;
		this.name = name;
		this.directory = directory;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirectory() {
		return directory;
	}
	public void setDirectory(String directory) {
		this.directory = directory;
	}
	
	
}
