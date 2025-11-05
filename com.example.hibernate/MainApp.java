package com.example.hibernate;

public class MainApp {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        // Create
        dao.saveStudent(new Student("Eklavya Verma", "Spring and Hibernate"));

        // Read
        Student s = dao.getStudent(1);
        System.out.println("Fetched Student: " + s.getName());

        // Update
        s.setCourse("Advanced Java");
        dao.updateStudent(s);

        // Delete
        dao.deleteStudent(1);
    }
}
