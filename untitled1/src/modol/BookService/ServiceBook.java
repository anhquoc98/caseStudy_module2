package modol.BookService;

import modol.BookRepo.RepoBook;

public class ServiceBook implements IServiceBook {
RepoBook repoBook =new RepoBook();
    @Override
    public void list() {
        repoBook.list();
    }

}
