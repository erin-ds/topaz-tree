package com.topaz.topaztree.domain;

import com.topaz.topaztree.dto.Element;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
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
@Table(name = "tree")
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
