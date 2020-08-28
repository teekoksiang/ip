package duke.command;

import duke.DukeException;
import duke.Storage;
import duke.TaskList;
import duke.Ui;

public abstract class Command {
    protected boolean isExit;

    protected Command() {
        this.isExit = false;
    }

    protected Command(boolean isExit) {
        this.isExit = isExit;
    }

    public boolean isExit() {
        return isExit;
    }

    public abstract void execute(TaskList taskList, Ui ui, Storage storage) throws DukeException;
}