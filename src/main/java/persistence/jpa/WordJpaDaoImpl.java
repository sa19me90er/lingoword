package persistence.jpa;

import domain.Word;
import persistence.WordDao;

import javax.persistence.EntityManager;

public class WordJpaDaoImpl extends AbstractDaoJpaImpl<Word> implements WordDao {
        public WordJpaDaoImpl(EntityManager entityManager) {
            super(entityManager);
        }
    }

