/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * SetSessionFactory -- Implements SessionFactory object and return
 * @author Isurunath
 */
public class SetSessionFactory {
    
    public static SessionFactory getSessionFactory() {
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        return sessionFactory;
    }
}
