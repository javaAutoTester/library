package by.zaslavl.library.entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidation {
	public static boolean bookTitleValidation(String title) {
		Pattern p = Pattern.compile("^([a-zA-Zа-яА-Я'(\")!-]+([ ][a-zA-Zа-яА-Я'(\")!-]+)*)$");
		Matcher m = p.matcher(title);
		return m.find();	
	}
	public static boolean yearValidation(int year) {
		String string_year = String.valueOf(year);
		Pattern p = Pattern.compile("^([1-9][0-9]{0,3})$");
		Matcher m = p.matcher(string_year);
		return m.find();
	}
	public static boolean nameValidation(String name) {
		Pattern p = Pattern.compile("^([a-zA-Zа-яА-Я][a-zA-Zа-яА-Я'-]+)$");
		Matcher m = p.matcher(name);
		return m.find();
	}

}
