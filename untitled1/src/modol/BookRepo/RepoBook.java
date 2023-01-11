package modol.BookRepo;

import modol.Book;

import java.util.ArrayList;
import java.util.List;

public class RepoBook implements IRepoBook{
    static List<Book> bookList =new ArrayList<>();
    static {
        bookList.add(new Book("21a","Đắc nhân tâm","Đối nhân xử thế",1));
        bookList.add(new Book("2a","Tam Quốc Chí","Tiểu thuyết Trung Quốc",1));
        bookList.add(new Book("21a","Thần điêu đại hiệp","Tiểu thuyết trung quốc",1));
        bookList.add(new Book("21a","Xám","Tiểu thiết Việt Nam",1));
    }
    @Override
    public void list() {
        for (Book book:bookList) {
            System.out.println(book);
        }
    }
}
