package web.service;

import web.dao.AuthorDao;
import web.model.Authors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorDao authorDao;


    //    @Override
//    public Authors getById(int i) {
////        try{
////            Optional<Authors> t = Optional.of(web.dao.getAuthorById(i));
////            if(t.isPresent()){
////        return web.dao.getAuthorById(i);}
////        else {
////        return null;}
////        }
////        catch (Exception e){
////            System.out.println("такого автора нет");
////            return null;
////        }
//        return Optional.ofNullable(web.dao.getById(i)).orElseThrow(() -> new RuntimeException("такого автора нет"));
//    }

//    @Override
//    public List<Authors> getAll() {
//        return Optional.ofNullable(authorDao.getAllAuthors()).orElse(new ArrayList<>());
//    }

    @Override
    public Authors getAuthorById(int i) {
        return authorDao.getById(i);
    }

//    @Override
//    public List<Authors> getAllAuthors() {
//        return Optional.ofNullable(authorDao.getAllAuthors()).orElse(new ArrayList<>());
//    }

    @Override
    public void addAuthor(Authors a) {

    }

    @Override
    public void removeAuthor(Authors i) {

    }

//    @Override
//    public boolean add(Authors a) {
//        a.setFirstName(StringFormatter.strCheck(a.getFirstName()));
//        a.setLastName(StringFormatter.strCheck(a.getLastName()));
//        a.setMiddleName(StringFormatter.strCheck(a.getMiddleName()));
//        web.dao.add(a);
//        return true;
//    }
//
//    @Override
//    public boolean remove(Authors i) {
//        web.dao.remove(i);
//        return true;
//    }
//
//    @Override
//    public boolean update(Authors id, String nS) {
//        web.dao.update(id,nS);
//        return true;
//    }


}
