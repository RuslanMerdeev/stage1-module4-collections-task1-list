package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aNumber = Integer.parseInt(a);
        int bNumber = Integer.parseInt(b);
        if (Math.abs(aNumber) != Math.abs(bNumber)) {
            return Math.abs(aNumber) - Math.abs(bNumber);
        }
        return aNumber - bNumber;
    }
}
