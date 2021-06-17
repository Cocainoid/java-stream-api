package ava.javalearn.jbreak.sources;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class DecartSource {
    // Сделать источник, генерирующий декартово произведение списков строк
    List<List<String>> input = asList(asList("a", "b", "c"),
            asList("x", "y"), asList("1", "2", "3"));

    Stream<String> stream =
            input.get(0).stream().flatMap(a ->
            input.get(1).stream().flatMap(b ->
            input.get(3).stream().map(c -> a + b + c)));

    Supplier<Stream<String>> s = input.stream()
            .<Supplier<Stream<String>>>map(list -> list::stream)
            .reduce((sup1, sup2) -> () -> sup1.get()
                .flatMap(e1 -> sup2.get().map(e2 -> e1 + e2)))
            .orElse(() -> Stream.of(""));
}
