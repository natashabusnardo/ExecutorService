package executor;

import java.io.Serializable;

public class BaseRunnable implements Runnable, Serializable {

    protected final TaskAction taskAction;

    protected Runnable runnable;

    public BaseRunnable(TaskAction task) {
        this.taskAction = task;
    }

    @Override
    public void run() {
        if (this.runnable != null) {
            this.runnable.run();
        }
    }
}
