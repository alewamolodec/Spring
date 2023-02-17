package web.service;

import org.springframework.stereotype.Repository;
import web.model.Authors;

import java.util.List;

public interface AuthorService {
    Authors getAuthorById(int i);
//    List<Authors> getAllAuthors();
    void addAuthor(Authors a);
    void removeAuthor(Authors i);
}
