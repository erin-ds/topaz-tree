package com.topaz.topaztree.service;

import com.topaz.topaztree.domain.Tree;
import com.topaz.topaztree.dto.Element;
import com.topaz.topaztree.repository.TreeRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class TreeService {
    private final TreeRepository treeRepository;

    public int saveEntity(Element element) {
        int treeWeight = calculateTreeWeight(element);
        treeRepository.save(new Tree(LocalDateTime.now(), element, treeWeight));
        return treeWeight;
    }

    public int calculateTreeWeight(Element element) {
        return element.getChildren() != null ? element.getChildren().stream().map(this::calculateTreeWeight).reduce(element.getWeight(), Integer::sum) : element.getWeight();
    }

    public Page<Tree> getAllEntities(int page, int listSize) {
        Pageable pageable = PageRequest.of(page, listSize);
        return treeRepository.findAll(pageable);
    }
}
