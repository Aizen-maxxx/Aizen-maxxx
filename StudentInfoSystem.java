
package studentinfosystem;

import java.util.HashMap;
import java.util.Scanner;

public class StudentInfoSystem {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        HashMap<String, Student> studentRecords = new HashMap<>();

        System.out.println(" STUDENT INFORMATION SYSTEM ");

        while (true) {
            System.out.println("\n1  Add Student");
            System.out.println("2  Search Student");
            System.out.println("3  Update Student");
            System.out.println("4  Remove Student");
            System.out.println("5  View All Students");
            System.out.println("6  Exit");
            System.out.print("Choose option: ");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Student ID: ");
                    String studentId = sc.nextLine();
                    System.out.print("Enter Gender: ");
                    String gender = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Contact Number: ");
                    String contact = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter Year Level: ");
                    int yearLevel = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    Student student = new Student(name, studentId, gender, age, contact, email, yearLevel, course);
                    studentRecords.put(name, student);

                    System.out.println("Student added.");
                    break;

                case 2:
                    System.out.print("Search student name: ");
                    String searchName = sc.nextLine();

                    if (studentRecords.containsKey(searchName)) {
                        Student s = studentRecords.get(searchName);
                        System.out.println("\n--- Student Info ---");
                        System.out.println("Name: " + s.getName());
                        System.out.println("ID Number: " + s.getStudentId());
                        System.out.println("Gender: " + s.getGender());
                        System.out.println("Age: " + s.getAge());
                        System.out.println("Contact Number: " + s.getContactNumber());
                        System.out.println("Email: " + s.getEmail());
                        System.out.println("Year Level: " + s.getYearLevel());
                        System.out.println("Course: " + s.getCourse());
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter name to update: ");
                    String updateName = sc.nextLine();

                    if (studentRecords.containsKey(updateName)) {
                        Student s = studentRecords.get(updateName);

                        System.out.print("Enter new Student ID: ");
                        s.setStudentId(sc.nextLine());

                        System.out.print("Enter new Gender: ");
                        s.setGender(sc.nextLine());

                        System.out.print("Enter new Age: ");
                        s.setAge(sc.nextInt());
                        sc.nextLine();

                        System.out.print("Enter new Contact Number: ");
                        s.setContactNumber(sc.nextLine());
                        
                        System.out.print("Enter new Email: ");
                        s.setEmail(sc.nextLine());

                        System.out.print("Enter new Year Level: ");
                        s.setYearLevel(sc.nextInt());
                        sc.nextLine();

                        System.out.print("Enter new Course: ");
                        s.setCourse(sc.nextLine());

                        System.out.println("Student updated.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter name to remove: ");
                    String removeName = sc.nextLine();

                    if (studentRecords.containsKey(removeName)) {
                        studentRecords.remove(removeName);
                        System.out.println("Student removed.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    System.out.println("\n                                       ALL STUDENTS ");

                    if (studentRecords.isEmpty()) {
                        System.out.println("No records found.");
                    } else {
                        System.out.printf("%-15s %-10s %-8s %-5s %-15s %-20s %-10s %-15s%n",
                                "Name", "ID", "Gender", "Age", "Contact", "Email", "Year", "Course");
                        System.out.println("------------------------------------------------------------------------------------------------");

                        for (Student s : studentRecords.values()) {
                            System.out.printf("%-15s %-10s %-8s %-5d %-15s %-20s %-10d %-15s%n",
                                    s.name, s.studentId, s.gender, s.age,
                                    s.contactNumber, s.email, s.yearLevel, s.course);
                        }
                    }
                    break;

                case 6:
                    System.out.println("System closed.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
