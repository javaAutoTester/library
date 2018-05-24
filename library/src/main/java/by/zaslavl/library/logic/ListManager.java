package by.zaslavl.library.logic;

import java.util.List;

import by.zaslavl.library.entity.Library;

public interface ListManager {
	List<LibraryList> createList(Library library);
	void printList(List<LibraryList> list);
}
