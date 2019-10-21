package test.week1;

import main.week1.FindUnionAlgorithm;
import main.week1.QuickUnionUF;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickUnionUfTest {


    @Test
    public void connectionWorksTest(){
        FindUnionAlgorithm quickUnion = new QuickUnionUF(10);
        quickUnion.union(4, 3);
        quickUnion.union(3, 8);
        quickUnion.union(6,5);
        quickUnion.union(9,4);
        quickUnion.union(2, 1);
        assertEquals(true, quickUnion.areConnected(8,9), "8 and 9 must be connected");
        assertEquals(false, quickUnion.areConnected(5,0), "8 and 9 must not be connected");
        quickUnion.union(5,0);
        quickUnion.union(7,2);
        quickUnion.union(6,1);
        assertEquals(true, quickUnion.areConnected(0, 7), "0 and 7 must be connected");
    }

    @Test
    public void connectionSpecificWorksTest(){
        FindUnionAlgorithm quickUnion = new QuickUnionUF(10);
        quickUnion.union(4,3);
        quickUnion.union(3,8);
        quickUnion.union(6,5);
        quickUnion.union(9,4);
        quickUnion.union(2,1);
        assertEquals(true, quickUnion.areConnected(8,9), "8 and 9 must be connected");
        assertEquals(false, quickUnion.areConnected(5,4), "5 and 4 must not be connected");
        quickUnion.union(5,0);
        quickUnion.union(7,2);
        quickUnion.union(6,1);
        quickUnion.union(7,3);
        assertEquals(true, quickUnion.areConnected(6,4), "6 and 4 must be connected");
        assertEquals(true, quickUnion.areConnected(6,6), "6 and 9 must be connected");
    }
}