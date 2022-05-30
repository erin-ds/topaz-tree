package com.topaz.topaztree;

import com.topaz.topaztree.dto.Element;
import com.topaz.topaztree.service.Service;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TopazTreeGetTreeWeightTest {

    @Autowired
    private Service service;

    @Test
    public void calculatingTreeWeightTest(){
        Element element = new Element(10, List.of(new Element(10, null), new Element(15, null)));
        int actual = service.calculateTreeWeight(element);
        int expected = 35;
        assertEquals(expected, actual);
    }

}
