package com.topaz.topaztree.dto;

import lombok.Data;

import java.util.List;

@Data
public class Element {
    private final int weight;
    private final List<Element> children;
}
