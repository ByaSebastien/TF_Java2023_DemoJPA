package be.bstorm;

import be.bstorm.entities.Author;
import be.bstorm.entities.Book;
import be.bstorm.entities.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("library_db");
        EntityManager em = emf.createEntityManager();

        Author author = new Author("Sun Tzu");
        Book book = new Book("L'art de la guerre.",author);
        Student student = new Student();
        student.setName("Test");
        student.setNote("20");
        student.setId(1L);

        em.getTransaction().begin();
        em.persist(book);
        em.persist(student);
        em.getTransaction().commit();
    }
}