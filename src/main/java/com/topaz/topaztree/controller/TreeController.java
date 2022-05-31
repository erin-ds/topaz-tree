package com.topaz.topaztree.controller;

import com.topaz.topaztree.dto.Element;
import com.topaz.topaztree.domain.Tree;
import com.topaz.topaztree.service.TreeService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/tree")
public class TreeController {

    private final TreeService service;

    @PostMapping
    public int addTree(@RequestBody Element element) {
        return service.saveEntity(element);
    }

    @GetMapping
    public Page<Tree> getAllEntities(@RequestParam(defaultValue = "1", required = false) int pageNumber, @RequestParam(defaultValue = "10", required = false) int listSize) {
        return service.getAllEntities(pageNumber, listSize);
    }
}
