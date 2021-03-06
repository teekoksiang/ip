package duke;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import duke.task.Deadline;
import duke.task.Task;
import duke.task.Todo;

public class TaskListTest {
    @Test
    public void add_task_addedCorrectly() {
        TaskList taskList = new TaskList();
        Task todo = new Todo("read book");
        taskList.addTask(todo);
        assertEquals(1, taskList.size());
        assertEquals("read book", taskList.getTask(1).getDescription());
    }

    @Test
    public void done_task_doneCorrectly() {
        TaskList taskList = new TaskList();
        Task todo = new Todo("read book");
        taskList.addTask(todo);
        taskList.doneTask(1);
        assertTrue(taskList.getTask(1).isDone());
    }

    @Test
    public void delete_task_deletedCorrectly() {
        TaskList taskList = new TaskList();
        Task todo = new Todo("todo");
        Task deadline = new Deadline("deadline", "2020-08-29");
        taskList.addTask(todo);
        taskList.addTask(deadline);
        assertEquals(2, taskList.size());
        taskList.deleteTask(1);
        assertEquals(1, taskList.size());
        assertEquals("deadline", taskList.getTask(1).getDescription());
    }
}
