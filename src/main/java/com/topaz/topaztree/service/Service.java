package com.topaz.topaztree.service;

import com.topaz.topaztree.api.request.Element;
import com.topaz.topaztree.repository.TreeEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@org.springframework.stereotype.Service
@Getter
@Setter
public class Service {
    private Element element;
    private LocalDateTime time;
    private int treeWeight;


    public TreeEntity createEntity(){
        return new TreeEntity(getTime(), getElement().toString(), getTreeWeight());
    }

    public int calculateTreeWeight() {
        treeWeight = element.getWeight() + getChildWeight(element.getChildren());
        return treeWeight;
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
