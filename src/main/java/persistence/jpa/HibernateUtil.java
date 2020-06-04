package persistence.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {
    private static String pstgrcfg = "mainDB";
    private static String dbcfg;
    private static final EntityManagerFactory entityManagerFactory;

    static {
        try {
            dbcfg = pstgrcfg;

            entityManagerFactory = Persistence
                    .createEntityManagerFactory(dbcfg);

        } catch (Throwable th) {
            System.err.println("Initial EntityManagerFactory creation failed" + th);
            throw new ExceptionInInitializerError(th);
        }
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

}