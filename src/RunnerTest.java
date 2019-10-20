import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import test.week1.QuickFindUFTest;
import test.week1.QuickUnionUfTest;

public class RunnerTest {
    public static void main(String[] args){
        Result result = JUnitCore.runClasses(QuickFindUFTest.class, QuickUnionUfTest.class);
        for(Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
    }
}
