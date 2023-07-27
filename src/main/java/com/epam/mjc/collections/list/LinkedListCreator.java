package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> list = new LinkedList<>();

        for (Integer current : sourceList) {
            if (current % 2 == 0) {
                list.addLast(current);
            } else {
                list.addFirst(current);
            }
        }

        return list;
    }
}
