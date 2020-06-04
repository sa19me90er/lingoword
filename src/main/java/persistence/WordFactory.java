package persistence;

import domain.Word;
import persistence.jpa.WordJpaDaoImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


public class WordFactory {

    private static EntityManagerFactory entityManagerFactory;

    public static void main(String[] args) {

        // get the Hibernate - JPA entityManager
        EntityManager em = EntityManagerProvider.getEntityManager();
        WordDao wordDao = new WordJpaDaoImpl(em);


        Word word = new Word("Hello", 5);
        wordDao.insert(word);

    }
}
