
package school.management.system;

class StudentBST {

    class Node {
        Student data;
        Node left, right;

        Node(Student s) { data = s; }
    }

    Node root;

    public void insert(Student s) {
        root = insertRec(root, s);
    }

    private Node insertRec(Node root, Student s) {
        if (root == null) return new Node(s);
        if (s.id < root.data.id) root.left = insertRec(root.left, s);
        else root.right = insertRec(root.right, s);
        return root;
    }

    public Student search(int id) {
        return searchRec(root, id);
    }

    private Student searchRec(Node root, int id) {
        if (root == null) return null;
        if (root.data.id == id) return root.data;
        return id < root.data.id ? searchRec(root.left, id)
                                 : searchRec(root.right, id);
    }
}
