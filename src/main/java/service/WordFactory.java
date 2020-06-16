package service;

import org.postgresql.util.PSQLException;
import org.springframework.dao.DataIntegrityViolationException;
import service.WordRulesController;
import domain.Word;
import persistence.EntityManagerProvider;
import persistence.WordDao;
import persistence.jpa.WordJpaDaoImpl;

import javax.persistence.EntityManager;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;


public class WordFactory {

    public static void main(String[] args) throws IOException {

        WordRulesController wordRulesController = new WordRulesController();
        Set<String> filterdWords = wordRulesController.wordRulesCheck();
        // make to iterator to read the set elements
        Iterator<String> iterator = filterdWords.iterator();

        // get the Hibernate - JPA entityManager
        EntityManager em = EntityManagerProvider.getEntityManager();
        WordDao wordDao = new WordJpaDaoImpl(em);

        em.getTransaction().begin();

        while (iterator.hasNext()) {
            String nextWord = iterator.next();
            Word word = new Word(nextWord, nextWord.length());
            try {
                    wordDao.insert(word);

            }
            catch( NullPointerException e )
            {
                System.out.print(e.getMessage());
            }
        }
        em.getTransaction().commit();
        em.close();
    }
}
