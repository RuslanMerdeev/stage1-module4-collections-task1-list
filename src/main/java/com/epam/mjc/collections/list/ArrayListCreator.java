package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 2; i < sourceList.size(); i += 3) {
            String current = sourceList.get(i);
            list.add(current);
            list.add(current);
        }

        return list;
    }
}
