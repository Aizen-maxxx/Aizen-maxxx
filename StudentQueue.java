
package school.management.system;

import java.util.LinkedList;
import java.util.Queue;

class StudentQueue {
     Queue<Student> q = new LinkedList<>();
    int limit;

    StudentQueue(int limit) { this.limit = limit; }

    void enqueue(Student s) {
        if (q.size() < limit) q.add(s);
    }

    void viewQueue() {
        for (Student s : q) {
            s.display();
        }
    }
}

    

