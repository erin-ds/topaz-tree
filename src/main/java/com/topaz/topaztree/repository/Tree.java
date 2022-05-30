package com.topaz.topaztree.repository;

import com.fasterxml.jackson.databind.JsonNode;
import com.topaz.topaztree.dto.Element;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import com.vladmihalcea.hibernate.type.json.JsonType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@TypeDef(
        name = "jsonb",
        typeClass = JsonBinaryType.class
)
public class Tree {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private LocalDateTime requestTime;

    @Column(columnDefinition = "jsonb")
    @Type(type = "jsonb")
    private Element request;
    private int treeWeight;

    public Tree(LocalDateTime requestTime, Element request, int treeWeight){
        this.requestTime = requestTime;
        this.request = request;
        this.treeWeight = treeWeight;
    }

}
