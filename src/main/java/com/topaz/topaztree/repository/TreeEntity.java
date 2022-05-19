package com.topaz.topaztree.repository;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tree")
@Getter
@Setter
public class TreeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private LocalDateTime requestTime;
    @Column
    private String request;
    @Column
    private int treeWeight;

    public TreeEntity(LocalDateTime requestTime, String request, int treeWeight){
        this.requestTime = requestTime;
        this.request = request;
        this.treeWeight = treeWeight;
    }

    public TreeEntity(){
    }
}
