package com.topaz.topaztree.controller;

import com.topaz.topaztree.api.request.Element;
import com.topaz.topaztree.api.response.Response;
import com.topaz.topaztree.repository.TreeRepository;
import com.topaz.topaztree.service.Service;
import lombok.Getter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@Getter
public class TreeController {
    private LocalDateTime requestTime;
    @PostMapping("/tree")
    public int addTree(@RequestBody Element element){
        Service service = new Service();
        requestTime = LocalDateTime.now();
        TreeRepository treeRepository = new TreeRepository();
        return treeRepository.getTreeWeight();
    }
}
