package ava.javalearn.jbreak.sources;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DomXmlSource {

    // Сделать источник дочерних узлов для заданного родительского
    // DOM XML узла
    public static Stream<Node> children(Node parent) {
        NodeList nodeList = parent.getChildNodes();
        return IntStream.range(0, nodeList.getLength())
                        .mapToObj(nodeList::item);
    }
}
