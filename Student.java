
package school.management.system;


class Student {
    String name, gender, contact, email, course;
    int id, age, year;

    public Student(String name, int id, String gender, int age, String contact,
            String email, int year, String course) {

        this.name = name;
        this.id = id;
        this.gender = gender;
        this.age = age;
        this.contact = contact;
        this.email = email;
        this.year = year;
        this.course = course;
    }

    public void display() {
        System.out.printf("%-10s %-10d %-8s %-5d %-10s %-22s %-6d %-10s\n",
                name, id, gender, age, contact, email, year, course);
    }
}
