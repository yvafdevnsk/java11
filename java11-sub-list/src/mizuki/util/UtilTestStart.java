package mizuki.util;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

class UtilTestStart {

    /**
     * start < 0
     */
    @Test
    void testSubListStart1() {
        try {
            List<Integer> srcList = new ArrayList<>();
            List<Integer> subList = Util.subList(srcList, -1);
            fail();
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    /**
     * srcList.size() - 1 < start
     */
    @Test
    void testSubListStart2() {
        try {
            List<Integer> srcList = new ArrayList<>();
            List<Integer> subList = Util.subList(srcList, 0);
            fail();
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    /**
     * srcList.size() - 1 == start
     */
    @Test
    void testSubListStart3() {
        try {
            List<Integer> srcList = new ArrayList<>();
            srcList.add(1);
            List<Integer> subList = Util.subList(srcList, 0);

            assertTrue(subList.get(0) == 1);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    @Test
    void testSubListStart4() {
        try {
            List<Integer> srcList = new ArrayList<>();
            IntStream.rangeClosed(1, 10).forEach(i -> srcList.add(i));

            //1,2,3,4,5,6,7,8,9,10
            List<Integer> subList = Util.subList(srcList, 0);
            assertTrue(subList.size() == 10);
            int value = 1;
            for (int i = 0; i < subList.size(); i++) {
                assertTrue(subList.get(i) == value++);
            }

            //2,3,4,5,6,7,8,9,10
            subList = Util.subList(srcList, 1);
            assertTrue(subList.size() == 9);
            value = 2;
            for (int i = 0; i < subList.size(); i++) {
                assertTrue(subList.get(i) == value++);
            }

            //3,4,5,6,7,8,9,10
            subList = Util.subList(srcList, 2);
            assertTrue(subList.size() == 8);
            value = 3;
            for (int i = 0; i < subList.size(); i++) {
                assertTrue(subList.get(i) == value++);
            }

            //8,9,10
            subList = Util.subList(srcList, 7);
            assertTrue(subList.size() == 3);
            value = 8;
            for (int i = 0; i < subList.size(); i++) {
                assertTrue(subList.get(i) == value++);
            }

            //9,10
            subList = Util.subList(srcList, 8);
            assertTrue(subList.size() == 2);
            value = 9;
            for (int i = 0; i < subList.size(); i++) {
                assertTrue(subList.get(i) == value++);
            }

            //10
            subList = Util.subList(srcList, 9);
            assertTrue(subList.size() == 1);
            value = 10;
            for (int i = 0; i < subList.size(); i++) {
                assertTrue(subList.get(i) == value++);
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

}
