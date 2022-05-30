package com.topaz.topaztree.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.topaz.topaztree.dto.Element;
import com.topaz.topaztree.repository.Tree;
import com.topaz.topaztree.repository.TreeRepository;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class Service {
    private final TreeRepository treeRepository;


    public int saveEntity(Element element) {
        int treeWeight = calculateTreeWeight(element);
        treeRepository.save(new Tree(LocalDateTime.now(), element, treeWeight));
        return treeWeight;
    }

    public int calculateTreeWeight(Element element) {
        return element.getChildren() != null ? element.getChildren().stream().map(this::calculateTreeWeight).reduce(element.getWeight(), Integer::sum) : element.getWeight();
    }

    public List<Tree> getAllEntities(){
        return treeRepository.findAll();
    }
}
