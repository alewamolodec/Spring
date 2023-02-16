package web.dao;

import web.model.Authors;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class AuthorDaoImpl implements AuthorDao {
    @PersistenceContext
    private EntityManager entityManager;

   /* private SessionFactory ;


    @Override
    public Authors getById(int id) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            Authors authors = session.get(Authors.class, id);
            session.getTransaction().commit();
            return authors;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return null;
        }
    }

    @Override
    public List<Authors> getAll() {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            Query<Authors> authors = session.createQuery("from Authors", Authors.class);
            session.getTransaction().commit();
            return authors.getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean add(Authors a) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.persist(a);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public boolean remove(Authors i) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.remove(i);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public boolean update(Authors id, String nS) {
        Session session = sessionFactory.openSession();
        id.setFirstName(nS);
        try {
            session.beginTransaction();
            session.update(id);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return false;
        }

    }*/

    @Override
    public List<Authors> getAllAuthors() {
        return entityManager.createQuery("from Authors").getResultList();
    }

    @Override
    public Authors getByGenre(int id) {
        Authors authors = (Authors) entityManager.createQuery("from Authors where id=2").getSingleResult();
        return authors;
    }
}
