package com.java_exscise.behaiviralpattern;

import java.util.List;

public interface SortStrategy {

    <T> void sort(List<T> items);
}