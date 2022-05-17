package com.topaz.topaztree.service;

import com.topaz.topaztree.api.request.Element;
import com.topaz.topaztree.repository.TreeRepository;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    public int calculateTreeWeight(Element element) {
        return element.getWeight() + getChildWeight(element.getChildren());
    }

    private int getChildWeight(List<Element> children) {
        int allChildrenWeight = 0;
        if (children != null) {
            for (Element child : children) {
                allChildrenWeight += child.getWeight() + getChildWeight(child.getChildren());
            }
        }
        return allChildrenWeight;
    }
}
