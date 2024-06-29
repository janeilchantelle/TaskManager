# Task Manager

Task Manager is a simple to-do list manager where users can create usernames, add tasks, mark tasks as completed, 
and view their task lists. Each user has their own to-do list managed using Java ArrayLists and single linked lists.

## Functionalities

1. **Create Username**
   - Allows users to create a new username.
   - Each username is unique and stored in an ArrayList.

2. **Add Task to Username**
   - Users can add tasks to their to-do list by specifying the task description.
   - Tasks are stored in a single linked list associated with each username.

3. **Mark Task as Done**
   - Users can mark tasks as completed.
   - Displays the current tasks for the selected username and allows the user to choose which task to mark as done.

4. **View Tasks for User**
   - Shows all tasks currently stored for a specific username.
   - Tasks are displayed with their completion status.

5. **Exit**
   - Allows users to exit the Task Manager program.

## Implementation Details

- **Task Class**
  - Represents a task with a description and completion status.
  - Provides methods to mark a task as done.

- **User Class**
  - Represents a user with a username and a to-do list.
  - Provides methods to add tasks, mark tasks as done, and print tasks.

- **ToDoList Class**
  - Represents a single linked list of tasks for each user.
  - Provides methods to add tasks, mark tasks as done, and print tasks.

- **Main Class (TaskManager)**
  - Manages the main menu and user interactions.
  - Uses Scanner for user input.
  - Provides options to create usernames, add tasks, mark tasks as done, view tasks, and exit.

## Getting Started

To run the Task Manager program:
- Compile all Java files if not using Maven (`TaskManager.java`, `User.java`, `ToDo.java`, `ToDoList.java`).
- Run the `TaskManager` class.
- Follow the on-screen instructions to manage tasks.


## License

This project is licensed under the MIT License - see the LICENSE file for details.
