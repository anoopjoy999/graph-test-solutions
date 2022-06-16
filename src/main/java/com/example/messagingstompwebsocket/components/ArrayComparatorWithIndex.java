package com.example.messagingstompwebsocket.components;

import java.util.Comparator;

public final class ArrayComparatorWithIndex<T extends Comparable<Object>> implements Comparator<Object[]>
{
    private final int[] indexToSort;

    public ArrayComparatorWithIndex(int[] indexToSort)
    {
        if(indexToSort == null || indexToSort.length == 0){
            throw new IllegalArgumentException("Index to use for sorting cannot be null or empty.");
        }
        this.indexToSort = indexToSort;
    }

    @Override
    public int compare(Object[] str, Object[] otherStr)
    {
        int result= 0;
        for (int index : indexToSort)
        {
            result= str[index].toString().compareTo(otherStr[index].toString());
            if (result != 0){
                break;
            }
        }
        return result;
    }
}
