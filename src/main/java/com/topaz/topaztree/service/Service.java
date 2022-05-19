package com.topaz.topaztree.service;

import com.topaz.topaztree.api.request.Element;
import com.topaz.topaztree.repository.Tree;
import com.topaz.topaztree.repository.TreeRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;

@org.springframework.stereotype.Service
@Getter
@Setter
public class Service {
    private Element element;
    private LocalDateTime time;
    private int treeWeight;
    private final TreeRepository treeRepository;

    @Autowired
    public Service(TreeRepository treeRepository) {
        this.treeRepository = treeRepository;
    }

    public void saveEntity() {
        treeRepository.save(new Tree(getTime(), getElement().toString(), calculateTreeWeight()));
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

    public List<Tree> getAllEntities(){
        return treeRepository.findAll();
    }
}
