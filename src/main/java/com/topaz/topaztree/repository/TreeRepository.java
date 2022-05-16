package com.topaz.topaztree.repository;

import com.topaz.topaztree.api.request.Element;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TreeRepository {
    List<Element> elements = new ArrayList<>();
    List<Element> children;
    public void addElement(Element element) {
        elements.add(element);
    }

    public int getTreeWeight() {
        int sumElements = 0;
        int sumChildren = 0;
        for (Element element : elements) {
            sumElements += element.getWeight();
            children = element.getChildren();
            for (Element child : children) {
                sumChildren += child.getWeight();
            }
        }


        return sumElements + sumChildren;
    }

}
