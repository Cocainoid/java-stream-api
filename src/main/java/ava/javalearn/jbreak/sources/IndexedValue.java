package ava.javalearn.jbreak.sources;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IndexedValue<T> {
    public final int index;
    public final T value;

    public IndexedValue(int index, T value) {
        this.index = index;
        this.value = value;
    }

    // Сделать источник элементов списка вместе с индексами
    public static <T> Stream<IndexedValue<T>> withIndices(List<T> list) {
        return IntStream.range(0, list.size())
                        .mapToObj(idx -> new IndexedValue<>(idx, list.get(idx)));
    }
}
