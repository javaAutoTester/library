package by.zaslavl.library.entity;

import java.io.Serializable;

public enum Genre implements Cloneable, Serializable{
	POETRY("Поэзия"),
	PROSE("Проза"), 
	ADVENTURE("Приключения"); 
	private String genre; 
	private Genre(String genre) {
		this.genre= genre;
	}


	public String getGenre() {
		return genre;
	}

}
