
package school.management.system;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class SchoolManagementSystem {

    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();
        StudentBST tree = new StudentBST();
        StudentHashTable hash = new StudentHashTable();
        StudentQueue queue = new StudentQueue(50);
        Stack<Student> undoStack = new Stack<>();
        LinkedList<String> logs = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {

            System.out.println("\n[   W E L C O M E   T O   S C H O O L   S Y S T E M   ]");
            System.out.println("\n1) ADD STUDENT");
            System.out.println("2) REMOVE STUDENT");
            System.out.println("3) UPDATE STUDENT");
            System.out.println("4) VIEW STUDENTS");
            System.out.println("5) SEARCH STUDENT");
            System.out.println("6) EXIT\n");
            System.out.print("ENTER: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.println("ADD STUDENT ");

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Gender: ");
                String gender = sc.nextLine();

                System.out.print("Enter Age: ");
                int age = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Contact: ");
                String contact = sc.nextLine();

                System.out.print("Enter Email: ");
                String email = sc.nextLine();

                System.out.print("Enter Year Level: ");
                int year = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Course: ");
                String course = sc.nextLine();

                Student s = new Student(name, id, gender, age, contact, email, year, course);

                studentList.add(s);
                tree.insert(s);
                hash.add(s);
                queue.enqueue(s);
                undoStack.push(s);
                logs.add("Added student: " + name);

                System.out.println("\nStudent Added Successfully!");
            } else if (choice == 2) {
                System.out.print("\nEnter ID to remove: ");
                int id = sc.nextInt();

                studentList.removeIf(s -> s.id == id);

                System.out.println("Student Removed.");
            } else if (choice == 3) {
                System.out.print("\nEnter ID to update: ");
                int id = sc.nextInt();
                sc.nextLine();

                for (Student s : studentList) {
                    if (s.id == id) {
                        System.out.print("New Name: ");
                        s.name = sc.nextLine();
                        System.out.println("Updated!");
                        break;
                    }
                }
            } else if (choice == 4) {
                System.out.println("STUDENT LIST ");

                System.out.printf("%-10s %-10s %-8s %-5s %-10s %-22s %-6s %-10s\n",
                        "Name", "ID", "Gender", "Age", "Contact", "Email", "Year", "Course");
                System.out.println("------------------------------------------------------------------------------------");

                for (Student s : studentList) {
                    s.display();
                }
            } else if (choice == 5) {
                System.out.print("Enter ID to search: ");
                int id = sc.nextInt();

                Student s = tree.search(id);

                if (s != null) {
                    System.out.println("\nFOUND:");
                    s.display();
                } else {
                    System.out.println("Student Not Found!");
                }
            } else if (choice == 6) {
                System.out.println("Exiting...");
                break;
            }
        }
    }
}
