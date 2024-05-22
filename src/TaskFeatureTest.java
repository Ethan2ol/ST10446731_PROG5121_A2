
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TaskFeatureTest {

    public TaskFeatureTest() {
    }
    @BeforeAll
    public static void setUpClass() {
    }
    @AfterAll
    public static void tearDownClass() {
    }
    @BeforeEach
    public void setUp() {
    }
    @AfterEach
    public void tearDown() {
    }
    @Test
    public void testTaskFeature() {
        System.out.println("taskFeature");
        TaskFeature.taskFeature();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testShowOptionDialog() {
        System.out.println("showOptionDialog");
        int expResult = 0;
        int result = TaskFeature.showOptionDialog();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testAddTasks() {
        System.out.println("addTasks");
        TaskFeature.addTasks();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testShowInputDialog() {
        System.out.println("showInputDialog");
        String message = "";
        String expResult = "";
        String result = TaskFeature.showInputDialog(message);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testShowMessageDialog() {
        System.out.println("showMessageDialog");
        String message = "";
        TaskFeature.showMessageDialog(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testReturnTotalHours() {
        System.out.println("returnTotalHours");
        int expResult = 0;
        int result = TaskFeature.returnTotalHours();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }}
