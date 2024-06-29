public class ToDo {
    private String description;
    private boolean done;

    public ToDo(String description) {
        this.description = description;
        this.done = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return done;
    }

    public void markAsDone() {
        this.done = true;
    }

    @Override
    public String toString() {
        return description + (done ? " (done)" : " (pending)");
    }
}
