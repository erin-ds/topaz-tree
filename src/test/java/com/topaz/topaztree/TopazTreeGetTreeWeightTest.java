package com.topaz.topaztree;

import com.topaz.topaztree.dto.Element;
import com.topaz.topaztree.service.TreeService;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@AllArgsConstructor
public class TopazTreeGetTreeWeightTest {
    private TreeService service;

    @Test
    public void calculatingTreeWeightTest() {
        Element element = new Element(10, List.of(new Element(10, null), new Element(15, null)));
        int actual = service.calculateTreeWeight(element);
        int expected = 35;
        assertEquals(expected, actual);
    }

}
