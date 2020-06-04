package persistence;

import persistence.jpa.HibernateUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class EntityManagerProvider {

    private static EntityManagerFactory entityManagerFactory;

    public static EntityManager getEntityManager() {
        try {
            entityManagerFactory = HibernateUtil.getEntityManagerFactory();
            return entityManagerFactory.createEntityManager();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

}