package com.topaz.topaztree.repository;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class TreeEntity {

    private long id;
    private LocalDateTime requestTime;
    private String request;
    private int treeWeight;
}
