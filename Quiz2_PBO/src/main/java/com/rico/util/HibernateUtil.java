package com.rico.util;
/**
 * Rico Halim 1972014
 */

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    static{
        try{
            Configuration configuration=new org.hibernate.cfg.Configuration().configure();
            sessionFactory =configuration.buildSessionFactory();
        }catch(Throwable ex){
            throw new ExceptionInInitializerError(ex);
        }
    }
}
