package com.topaz.topaztree.service;

import com.topaz.topaztree.repository.TreeRepository;

@org.springframework.stereotype.Service
public class Service {

    public int getTreeWeight() {
        TreeRepository treeRepository = new TreeRepository();
        return treeRepository.getTreeWeight();
    }
}
