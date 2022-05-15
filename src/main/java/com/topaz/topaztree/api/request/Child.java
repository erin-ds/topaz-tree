package com.topaz.topaztree.api.request;

import lombok.Data;

@Data
public class Child {
    private final Element element;
    private final Child children;
}
