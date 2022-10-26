package executor;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class TaskAction implements Serializable {

    private final String id = UUID.randomUUID().toString();
    private final String executionPath;
    private long tempo;
    private int vezes;

    protected TaskAction(String executionPath, int executionTime, int vezes) {
        try {
            String path = new File(".").getCanonicalPath();
            this.executionPath = path + "/scripts/" + executionPath;
            this.tempo = executionTime;
            this.vezes = vezes;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getExecutionPath() {
        return executionPath;
    }

    public String getId() {
        return id;
    }

    public long getTime() {
        return tempo;
    }

    public int getVezes() {
        return vezes;
    }
}
