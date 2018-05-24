package by.zaslavl.library.entity;

import java.io.Serializable;
import java.util.Arrays;

import by.zaslavl.library.logic.LibraryList;

public class Author implements Cloneable, Serializable, LibraryList{
	private String[] name; 
	private int birth_year;
	public Author (String[] name, int birth_year) {
		this.name= name;
		this.birth_year = birth_year;
	}
	public String[] getName() {
		return name;
	}

	public int getBirth_year() {
		return birth_year;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + birth_year;
		result = prime * result + Arrays.hashCode(name);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		if (birth_year != other.birth_year)
			return false;
		if (!Arrays.equals(name, other.name))
			return false;
		return true;
	}
	public Object clone() throws CloneNotSupportedException {
		Author a = (Author) super.clone();
		return a;
	}
}
