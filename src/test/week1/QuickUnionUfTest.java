package test.week1;

import main.week1.FindUnionAlgorithm;
import main.week1.QuickFindUF;
import main.week1.QuickUnionUF;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickUnionUfTest {

    /**
     * 0  1  2  3  4
     *
     * 5  6  7  8  9
     */

    @Test
    public void connectionWorksTest(){
        FindUnionAlgorithm quickFindUF = new QuickUnionUF(10);
        quickFindUF.union(4, 3);
        quickFindUF.union(3, 8);
        quickFindUF.union(6,5);
        quickFindUF.union(9,4);
        quickFindUF.union(2, 1);
        /**
         * 0   1 - 2   3 - 4
         *             |   |
         * 5 - 6   7   8   9
         */

        assertEquals(true, quickFindUF.areConnected(8,9), "8 and 9 must be connected");
        assertEquals(false, quickFindUF.areConnected(5,0), "8 and 9 must not be connected");
        quickFindUF.union(5,0);
        quickFindUF.union(7,2);
        quickFindUF.union(6,1);
        /**
         * 0   1 - 2   3 - 4
         * |   |   |   |   |
         * 5 - 6   7   8   9
         */
        assertEquals(true, quickFindUF.areConnected(0, 7), "0 and 7 must be connected");
    }
}
