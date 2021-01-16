package fa.training.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * The class to get a SessionFactory object.
 * @author DieuNT1
 *
 */
public class HibernateUtils {
    private static SessionFactory sessionFactory;
    
    /**
     * The block code to initialize a SessionFactory object.
     */
    static {
        Configuration configuration = new Configuration();
        configuration.configure();
        
        if (sessionFactory == null) {
            sessionFactory = configuration.buildSessionFactory();
        }
    }
    /**
     * 
     * @return
     */
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
}
