package executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TaskSchedulerImpl implements TaskScheduler {

    private final ScheduledExecutorService scheduler;

    public TaskSchedulerImpl(int numThreads) {
        this.scheduler = Executors.newScheduledThreadPool(numThreads);
    }

    public boolean scheduleTask(TaskAction task) {
        BaseRunnable taskToBeScheduled;
        taskToBeScheduled = new ExecutarScript(task);
        System.out.println("Agendando task " + task.getId());
        try {
            for(int i = 1; i <= task.getVezes(); i++){
                this.scheduler.schedule(taskToBeScheduled, task.getTime()*i, TimeUnit.SECONDS);
            }
        } catch (Exception ex) {
            System.out.printf("Falha na task {} {}", taskToBeScheduled, ex);
            return false;
        }
        return true;
    }
}
