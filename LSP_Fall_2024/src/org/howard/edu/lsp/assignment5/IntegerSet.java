package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;

/**
 * IntegerSet class that stores a set of unique integers and provides various
 * set operations such as union, intersection, difference, etc.
 * 
 * @author Madison Malachi
 */
public class IntegerSet {
    private List<Integer> set = new ArrayList<Integer>();

    /**
     * Default Constructor.
     * Initializes an empty set.
     */
    public IntegerSet() {}

    /**
     * Constructor that initializes the set with the provided list of integers.
     * 
     * @param set A list of integers to initialize the set with.
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    /**
     * Clears the internal representation of the set, removing all elements.
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns the length of the set, i.e., the number of elements.
     * 
     * @return The number of elements in the set.
     */
    public int length() {
        return set.size();
    }

    /**
     * Checks whether two sets are equal. Two sets are equal if they contain
     * the same elements, regardless of order.
     * 
     * @param o The other set to compare with.
     * @return True if the sets are equal, otherwise false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntegerSet that = (IntegerSet) o;
        return set.containsAll(that.set) && that.set.containsAll(set);
    }

    /**
     * Checks whether the set contains a specific value.
     * 
     * @param value The integer value to check for.
     * @return True if the value is in the set, otherwise false.
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns the largest element in the set.
     * 
     * @return The largest integer in the set.
     * @throws Exception If the set is empty.
     */
    public int largest() throws Exception {
        if (set.isEmpty()) throw new Exception("The set is empty");
        return set.stream().max(Integer::compare).get();
    }

    /**
     * Returns the smallest element in the set.
     * 
     * @return The smallest integer in the set.
     * @throws Exception If the set is empty.
     */
    public int smallest() throws Exception {
        if (set.isEmpty()) throw new Exception("The set is empty");
        return set.stream().min(Integer::compare).get();
    }

    /**
     * Adds an item to the set if it is not already present.
     * 
     * @param item The integer value to add to the set.
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes an item from the set if it is present.
     * 
     * @param item The integer value to remove from the set.
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    /**
     * Performs the union of the current set with another set.
     * The union of two sets contains all elements from both sets.
     * 
     * @param intSetb The other set to union with.
     */
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            if (!set.contains(item)) {
                set.add(item);
            }
        }
    }

    /**
     * Performs the intersection of the current set with another set.
     * The intersection contains only the elements that are present in both sets.
     * 
     * @param intSetb The other set to intersect with.
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    /**
     * Performs the difference between the current set and another set.
     * The difference contains elements that are in the current set but not in the other set.
     * 
     * @param intSetb The other set to find the difference with.
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * Performs the complement of the current set relative to the universal set.
     * The complement contains elements that are not in either of the sets.
     * 
     * @param intSetb The other set to find the complement with.
     */
    public void complement(IntegerSet intSetb) {
        for (int i = 1; i <= 100; i++) {  // Example complement, assuming a universal set of 1 to 100
            if (!set.contains(i) && !intSetb.set.contains(i)) {
                set.add(i);
            }
        }
    }

    /**
     * Checks whether the set is empty.
     * 
     * @return True if the set is empty, otherwise false.
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns the string representation of the set.
     * 
     * @return A string representation of the elements in the set.
     */
    @Override
    public String toString() {
        return set.toString();
    }
}
