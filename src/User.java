public class User {
    private String name;
    private ToDoList toDoList;

    public User(String name) {
        this.name = name;
        this.toDoList = new ToDoList();
    }

    public String getName() {
        return name;
    }

    public void addToDo(String description) {
        toDoList.addToDo(description);
    }

    public void markToDoAsDone(String description) {
        toDoList.markToDoAsDone(description);
    }

    public void printToDos() {
        System.out.println("Tasks for " + name + ":");
        toDoList.printToDos();
    }
}
