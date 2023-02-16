package web.dao;

import web.model.Genre;

public interface GenreDao {
    Genre getByBook(int id);
}
