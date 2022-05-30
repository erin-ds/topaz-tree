package com.topaz.topaztree.controller;

import com.topaz.topaztree.dto.Element;
import com.topaz.topaztree.repository.Tree;
import com.topaz.topaztree.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tree")
public class TreeController {

    private final Service service;

    @Autowired
    public TreeController(Service service) {
        this.service = service;
    }

    @PostMapping
    public int addTree(@RequestBody Element element) {
        return service.saveEntity(element);
    }

    @GetMapping
    public List<Tree> getAllEntities() {
        return service.getAllEntities();
    }
}
