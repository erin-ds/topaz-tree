package com.topaz.topaztree.repository;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Entity {
    private LocalDateTime requestTime;
    private String request;
    private int treeWeight;
}
