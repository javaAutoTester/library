package by.zaslavl.library.run;

import java.util.List;

import by.zaslavl.library.entity.Author;
import by.zaslavl.library.entity.Book;
import by.zaslavl.library.entity.Genre;
import by.zaslavl.library.entity.Library;
import by.zaslavl.library.logic.AuthorList;
import by.zaslavl.library.logic.FindService;
import by.zaslavl.library.logic.Librarian;
import by.zaslavl.library.logic.LibraryList;
import by.zaslavl.library.logic.PrintService;

public class LibMainApp {
	// в данном классе формируется список авторов
	// создаются объекты "книга"
	// из объектов типа "книга" создается каталог книг

	public static void main(String[] args) throws CloneNotSupportedException {

		// создадим книги
		Book b1 = Librarian.createNewBook("Неизвестная даль", 2000, Genre.ADVENTURE);
		// Добавим авторов этой книги
		Librarian.addAuthorToBook(b1, "Александр", "Сергеевич", "Пушкин", 1799);
		Librarian.addAuthorToBook(b1, "Александр", "Сергеевич", "Пушкин", 1799);
		Librarian.addAuthorToBook(b1, "Михаил", "Юрьевич", "Лермонтов", 1814);
		Librarian.addAuthorToBook(b1, "Кирилл", "Кириллович", "Кириллов", 1900);
		Librarian.addAuthorToBook(b1, "Дмитрий", "Сергеевич", "Курякин", 1915);

		Book b2 = Librarian.createNewBook("У Лукоморья дуб зеленый", 1830, Genre.POETRY);
		Librarian.addAuthorToBook(b2, "Александр", "Сергеевич", "Пушкин", 1799);

		Book b3 = Librarian.createNewBook("Занимательная физика", 1920, Genre.PROSE);
		Librarian.addAuthorToBook(b3, "Яков", "Исидорович", "Перельман", 1882);

		Book b4 = Librarian.createNewBook("Руслан и Людмила", 1830, Genre.POETRY);
		Librarian.addAuthorToBook(b4, "Александр", "Сергеевич", "Пушкин", 1799);

		// создадим новую библиотеку
		Library lib1 = Librarian.createNewLibrary();

		// добавим книги в библиотеку
		Librarian.addBookToLibrary(lib1, b1);
		Librarian.addBookToLibrary(lib1, b2);
		Librarian.addBookToLibrary(lib1, b3);
		Librarian.addBookToLibrary(lib1, b4);
		
		//интерфейсы не позволяют делать статические методы, поэтому создаем экземпляр класса
		AuthorList authlist =new AuthorList();
		//формируем список авторов, книги которых имеются в библиотеке
		List<LibraryList> list = authlist.createList(lib1);
		//печатаем список авторов
		authlist.printList(list);
        
	}
}
