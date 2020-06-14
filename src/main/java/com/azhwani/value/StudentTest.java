package com.azhwani.value;

public class StudentTest {
	
	public static void main(String[] args) {
        Student student = new Student("Robert", "Hernandez", 22);
        
        // Testing Getter methods
        System.out.println(student.getFirstName());

        // Testing toString method
        System.out.println(student.toString());
        
        // Testing hashCode method
        System.out.println(student.hashCode());

        // Testing equals method
        Student student2 = new Student("Maria", "Hernandez", 21);
        System.out.println(student.equals(student2));
    }
	
}
