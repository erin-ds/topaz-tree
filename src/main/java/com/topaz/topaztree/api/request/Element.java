package com.topaz.topaztree.api.request;

import lombok.Data;

@Data
public class Element {
    private final int weight;
    private final Child child;
}
