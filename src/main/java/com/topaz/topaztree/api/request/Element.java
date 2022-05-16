package com.topaz.topaztree.api.request;

import lombok.Data;

import java.util.List;

@Data
public class Element {
    private final int weight;
    private final List<Element> children;
}
