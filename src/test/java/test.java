import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class test {
    @Test
    public void createOneTask() throws Exception {
        Task createTask = new Task(1, 5, Arrays.asList(2, 3));
        assertEquals(1,createTask.getId());
        assertEquals(5,createTask.getTime());
        assertEquals(Arrays.asList(2, 3),createTask.getDependencies());
    }

    @Test
    public void singleTaskCase() throws Exception {
        List<Task> createTasks = new ArrayList<>();
        createTasks.add(new Task(1, 5, null));
        Scheduler crerateScheduler = new Scheduler();
        crerateScheduler.addTask(createTasks);
        assertEquals(5,crerateScheduler.calCostTime());
    }

    @Test
    public void multipleSingleTaskCase() throws Exception {
        List<Task> createTasks = new ArrayList<>();
        createTasks.add(new Task(1, 5, null));
        createTasks.add(new Task(2, 9, null));
        createTasks.add(new Task(3, 1, null));
        createTasks.add(new Task(4, 7, null));
        Scheduler crerateScheduler = new Scheduler();
        crerateScheduler.addTask(createTasks);
        assertEquals(9,crerateScheduler.calCostTime());
    }

    @Test
    public void straightLineTaskCase() throws Exception {
        List<Task> createTasks = new ArrayList<>();
        createTasks.add(new Task(1, 5, Arrays.asList(2)));
        createTasks.add(new Task(2, 9, Arrays.asList(3)));
        createTasks.add(new Task(3, 1, Arrays.asList(4)));
        createTasks.add(new Task(4, 7, null));
        Scheduler crerateScheduler = new Scheduler();
        crerateScheduler.addTask(createTasks);
        assertEquals(22, crerateScheduler.calCostTime());
    }

    @Test
    public void normalTaskCase() throws Exception {
        List<Task> createTasks = new ArrayList<>();
        createTasks.add(new Task(1, 6, Arrays.asList(2,3)));
        createTasks.add(new Task(2, 5, Arrays.asList(4)));
        createTasks.add(new Task(3, 11, Arrays.asList(5)));
        createTasks.add(new Task(4, 4, Arrays.asList(5)));
        createTasks.add(new Task(5, 8, null));
        Scheduler crerateScheduler = new Scheduler();
        crerateScheduler.addTask(createTasks);
        assertEquals(25, crerateScheduler.calCostTime());
    }

    @Test
    public void specialTaskCase() throws Exception {
        List<Task> createTasks = new ArrayList<>();
        createTasks.add(new Task(1, 2, Arrays.asList(2,3)));
        createTasks.add(new Task(2, 3, Arrays.asList(4)));
        createTasks.add(new Task(3, 6, Arrays.asList(5)));
        createTasks.add(new Task(4, 11, Arrays.asList(6,7)));
        createTasks.add(new Task(5, 9, Arrays.asList(7)));
        createTasks.add(new Task(6, 10, null));
        createTasks.add(new Task(7, 7, null));
        Scheduler crerateScheduler = new Scheduler();
        crerateScheduler.addTask(createTasks);
        assertEquals(26, crerateScheduler.calCostTime());
    }
}