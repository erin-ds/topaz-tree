package com.topaz.topaztree.service;

import com.topaz.topaztree.api.request.Element;
import com.topaz.topaztree.repository.Tree;
import com.topaz.topaztree.repository.TreeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    private final TreeRepository treeRepository;

    @Autowired
    public Service(TreeRepository treeRepository) {
        this.treeRepository = treeRepository;
    }

    public void saveEntity(Element element) {
        treeRepository.save(new Tree(LocalDateTime.now(), element.toString(), calculateTreeWeight(element)));
    }

    public int calculateTreeWeight(Element element) {
        return element.getChildren() != null ? element.getChildren().stream().map(this::calculateTreeWeight).reduce(element.getWeight(), Integer::sum) : element.getWeight();
    }

    public List<Tree> getAllEntities(){
        return treeRepository.findAll();
    }
}
