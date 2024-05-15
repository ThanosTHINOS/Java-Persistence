package com.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        // Get session factory
        Session session = HibernateUtil.getSessionFactory().openSession();

        // Create a new employee
        Employee employee = new Employee();
        employee.setFirstName("John");
        employee.setLastName("Doe");
        employee.setSalary(50000);

        // Start a transaction
        Transaction transaction = session.beginTransaction();

        // Save the employee object
        session.save(employee);

        // Commit the transaction
        transaction.commit();

        // Retrieve the employee object
        Employee retrievedEmployee = session.get(Employee.class, employee.getId());
        System.out.println("Retrieved Employee: " + retrievedEmployee.getFirstName() + " " + retrievedEmployee.getLastName());

        // Close the session
        session.close();
    }
}
