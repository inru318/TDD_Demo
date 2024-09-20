import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class test {
    @Test
    public void createOneTask() throws Exception {
        Task createTask = new Task(1, 5, Arrays.asList(2, 3));
        assertEquals(1,createTask.getId());
        assertEquals(5,createTask.getTime());
        assertEquals(Arrays.asList(2, 3),createTask.getDependencies());
    }
}