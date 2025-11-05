package com.example.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class StudentDAO {

    public void saveStudent(Student student) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(student);
        tx.commit();
        session.close();
    }

    public Student getStudent(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Student student = session.get(Student.class, id);
        session.close();
        return student;
    }

    public List<Student> getAllStudents() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Student> students = session.createQuery("from Student", Student.class).list();
        session.close();
        return students;
    }

    public void updateStudent(Student student) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(student);
        tx.commit();
        session.close();
    }

    public void deleteStudent(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Student s = session.get(Student.class, id);
        session.delete(s);
        tx.commit();
        session.close();
    }
}
