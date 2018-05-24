package by.zaslavl.library.logic;

import java.util.List;

import by.zaslavl.library.entity.Library;

public interface ListManager {
	List<LibraryItem> createList(Library library);
	List<LibraryItem> createList(Library library, String s);
	void printList(List<LibraryItem> list);
}
