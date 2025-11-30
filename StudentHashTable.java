
package school.management.system;

import java.util.HashMap;

class StudentHashTable {

   HashMap<Integer, Student> map = new HashMap<>();

    void add(Student s) { map.put(s.id, s); }

    Student get(int id) { return map.get(id); }
}