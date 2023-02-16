package web.dao;

import web.model.Book;

public interface BookDao {
    Book getByGenre(int id);
}
