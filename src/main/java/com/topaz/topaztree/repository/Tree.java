package com.topaz.topaztree.repository;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Tree {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private LocalDateTime requestTime;
    private String request;
    private int treeWeight;

    public Tree(LocalDateTime requestTime, String request, int treeWeight){
        this.requestTime = requestTime;
        this.request = request;
        this.treeWeight = treeWeight;
    }

    public Tree(){
    }
}
