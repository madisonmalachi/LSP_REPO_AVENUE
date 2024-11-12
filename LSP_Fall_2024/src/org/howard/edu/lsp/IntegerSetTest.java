package org.howard.edu.lsp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerSetTest {
    private IntegerSet set1;
    private IntegerSet set2;

   

    @Test
    @DisplayName("Test add and contains methods")
    public void testAddAndContains() {
        set1.add(1);
        set1.add(2);
        set1.add(3);
        assertTrue(set1.contains(1));
        assertTrue(set1.contains(2));
        assertTrue(set1.contains(3));
        assertFalse(set1.contains(4));
    }

    @Test
    @DisplayName("Test clear method")
    public void testClear() {
        set1.add(1);
        set1.add(2);
        set1.add(3);
        assertFalse(set1.isEmpty(), "Set should not be empty after adding elements.");

        set1.clear();
        assertTrue(set1.isEmpty(), "Set should be empty after clear.");
    }

    @Test
    @DisplayName("Test length method")
    public void testLength() {
        set1.add(1);
        set1.add(2);
        assertEquals(2, set1.length());
    }

    @Test
    @DisplayName("Test equals method for set equality")
    public void testEquals() {
        set1.add(1);
        set1.add(2);
        set2.add(1);
        set2.add(2);
        assertTrue(set1.equals(set2));
        
        set2.add(3);
        assertFalse(set1.equals(set2));
    }

    @Test
    @DisplayName("Test largest method")
    public void testLargest() throws Exception {
        set1.add(1);
        set1.add(3);
        set1.add(2);
        assertEquals(3, set1.largest());
    }

    @Test
    @DisplayName("Test smallest method")
    public void testSmallest() throws Exception {
        set1.add(1);
        set1.add(3);
        set1.add(2);
        assertEquals(1, set1.smallest());
    }

    @Test
    @DisplayName("Test largest method throws exception on empty set")
    public void testLargestException() {
        Exception exception = assertThrows(Exception.class, () -> {
            set1.largest();
        });
        assertEquals("The set is empty", exception.getMessage());
    }

    @Test
    @DisplayName("Test smallest method throws exception on empty set")
    public void testSmallestException() {
        Exception exception = assertThrows(Exception.class, () -> {
            set1.smallest();
        });
        assertEquals("The set is empty", exception.getMessage());
    }

    @Test
    @DisplayName("Test remove method")
    public void testRemove() {
        set1.add(1);
        set1.add(2);
        set1.remove(1);
        assertFalse(set1.contains(1));
        assertTrue(set1.contains(2));
    }

    @Test
    @DisplayName("Test union method")
    public void testUnion() {
        set1.add(1);
        set1.add(2);
        set2.add(3);
        set2.add(4);
        set1.union(set2);
        assertTrue(set1.contains(1));
        assertTrue(set1.contains(2));
        assertTrue(set1.contains(3));
        assertTrue(set1.contains(4));
    }

    @Test
    @DisplayName("Test intersect method")
    public void testIntersect() {
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set1.intersect(set2);
        assertFalse(set1.contains(1));
        assertTrue(set1.contains(2));
        assertTrue(set1.contains(3));
        assertFalse(set1.contains(4));
    }

    @Test
    @DisplayName("Test diff method")
    public void testDiff() {
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set1.diff(set2);
        assertTrue(set1.contains(1));
        assertFalse(set1.contains(2));
        assertFalse(set1.contains(3));
        assertFalse(set1.contains(4));
    }

    @Test
    @DisplayName("Test complement method")
    public void testComplement() {
        IntegerSet set1 = new IntegerSet();  // Initialize set1
        set1.add(1);
        set1.add(2);
        set1.add(3);

        IntegerSet set2 = new IntegerSet();  // Initialize set2
        set2.add(3);
        set2.add(4);
        set2.add(5);

        set1.complement(set2);  // Perform complement operation

        // Example assertion (update according to your expected complement outcome)
        // Assuming a universal set from 1 to 100
        for (int i = 1; i <= 100; i++) {
            if (!set1.contains(i) && !set2.contains(i)) {
                assertTrue(set1.contains(i), "Expected set1 to contain complement elements.");
            }
        }
    }

    @Test
    @DisplayName("Test isEmpty method")
    public void testIsEmpty() {
        assertTrue(set1.isEmpty());
        set1.add(1);
        assertFalse(set1.isEmpty());
    }

    @Test
    @DisplayName("Test toString method")
    public void testToString() {
        set1.add(1);
        set1.add(2);
        set1.add(3);
        assertEquals("[1, 2, 3]", set1.toString());
    }
}
