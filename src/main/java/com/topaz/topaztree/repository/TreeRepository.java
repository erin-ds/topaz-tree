package com.topaz.topaztree.repository;

import com.topaz.topaztree.api.request.Child;
import com.topaz.topaztree.api.request.Element;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TreeRepository {
    List<Element> elements = new ArrayList<>();
    List<Child> children = new ArrayList<>();

    public void addElement(Element element, Child child) {
        elements.add(element);
        children.add(child);
    }

    public int getTreeWeight() {
        int sumElements = 0;
        int sumChildren = 0;
        for (Element element : elements) {
            sumElements += element.getWeight();
        }
        for (Child child : children) {
            sumChildren += child.getElement().getWeight();
        }
        return sumElements + sumChildren;
    }

}
