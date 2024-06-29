public class ToDoList {
    private class Node {
        ToDo todo;
        Node next;

        Node(ToDo todo) {
            this.todo = todo;
            this.next = null;
        }
    }

    private Node head;

    public ToDoList() {
        this.head = null;
    }

    public void addToDo(String description) {
        ToDo newToDo = new ToDo(description);
        Node newNode = new Node(newToDo);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void markToDoAsDone(String description) {
        Node current = head;
        while (current != null) {
            if (current.todo.getDescription().equals(description)) {
                current.todo.markAsDone();
                return;
            }
            current = current.next;
        }
        System.out.println("Task not found: " + description);
    }

    public void printToDos() {
        Node current = head;
        while (current != null) {
            System.out.println(current.todo);
            current = current.next;
        }
    }
}
