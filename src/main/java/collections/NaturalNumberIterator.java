package collections;

import java.util.Iterator;

/**
 * @author Evgeny Borisov
 */
public class NaturalNumberIterator implements Iterator<Integer> {

    private int i;
    @Override
    public boolean hasNext() {
        return i<Integer.MAX_VALUE;
    }

    @Override
    public Integer next() {
        return ++i;
    }









}
