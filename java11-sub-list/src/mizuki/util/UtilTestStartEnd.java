package mizuki.util;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

class UtilTestStartEnd {

    /**
     * start < 0
     */
    @Test
    void testSubListStartEnd1() {
        try {
            List<Integer> srcList = new ArrayList<>();
            IntStream.rangeClosed(1, 10).forEach(i -> srcList.add(i));

            List<Integer> subList = Util.subList(srcList, -1, 1);
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
    void testSubListStartEnd2() {
        try {
            List<Integer> srcList = new ArrayList<>();
            IntStream.rangeClosed(1, 10).forEach(i -> srcList.add(i));

            List<Integer> subList = Util.subList(srcList, 10, 11);
            fail();
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    /**
     * end < 0
     */
    @Test
    void testSubListStartEnd3() {
        try {
            List<Integer> srcList = new ArrayList<>();
            IntStream.rangeClosed(1, 10).forEach(i -> srcList.add(i));

            List<Integer> subList = Util.subList(srcList, 0, -1);
            fail();
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    /**
     * end < start
     */
    @Test
    void testSubListStartEnd4() {
        try {
            List<Integer> srcList = new ArrayList<>();
            IntStream.rangeClosed(1, 10).forEach(i -> srcList.add(i));

            List<Integer> subList = Util.subList(srcList, 2, 1);
            fail();
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    @Test
    void testSubListStartEnd5() {
        try {
            List<Integer> srcList = new ArrayList<>();
            IntStream.rangeClosed(1, 10).forEach(i -> srcList.add(i));

            //空のリスト
            List<Integer> subList = Util.subList(srcList, 0, 0);
            assertTrue(subList.size() == 0);

            //1
            subList = Util.subList(srcList, 0, 1);
            assertTrue(subList.size() == 1);
            int value = 1;
            for (int i = 0; i < subList.size(); i++) {
                assertTrue(subList.get(i) == value++);
            }

            //1,2
            subList = Util.subList(srcList, 0, 2);
            assertTrue(subList.size() == 2);
            value = 1;
            for (int i = 0; i < subList.size(); i++) {
                assertTrue(subList.get(i) == value++);
            }

            //1,2,3
            subList = Util.subList(srcList, 0, 3);
            assertTrue(subList.size() == 3);
            value = 1;
            for (int i = 0; i < subList.size(); i++) {
                assertTrue(subList.get(i) == value++);
            }

            //4
            subList = Util.subList(srcList, 3, 4);
            assertTrue(subList.size() == 1);
            value = 4;
            for (int i = 0; i < subList.size(); i++) {
                assertTrue(subList.get(i) == value++);
            }

            //4,5
            subList = Util.subList(srcList, 3, 5);
            assertTrue(subList.size() == 2);
            value = 4;
            for (int i = 0; i < subList.size(); i++) {
                assertTrue(subList.get(i) == value++);
            }

            //4,5,6
            subList = Util.subList(srcList, 3, 6);
            assertTrue(subList.size() == 3);
            value = 4;
            for (int i = 0; i < subList.size(); i++) {
                assertTrue(subList.get(i) == value++);
            }

            //8
            subList = Util.subList(srcList, 7, 8);
            assertTrue(subList.size() == 1);
            value = 8;
            for (int i = 0; i < subList.size(); i++) {
                assertTrue(subList.get(i) == value++);
            }

            //8,9
            subList = Util.subList(srcList, 7, 9);
            assertTrue(subList.size() == 2);
            value = 8;
            for (int i = 0; i < subList.size(); i++) {
                assertTrue(subList.get(i) == value++);
            }

            //8,9,10
            subList = Util.subList(srcList, 7, 10);
            assertTrue(subList.size() == 3);
            value = 8;
            for (int i = 0; i < subList.size(); i++) {
                assertTrue(subList.get(i) == value++);
            }

            //8,9,10,(endが大きい)
            subList = Util.subList(srcList, 7, 11);
            assertTrue(subList.size() == 3);
            value = 8;
            for (int i = 0; i < subList.size(); i++) {
                assertTrue(subList.get(i) == value++);
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

}
