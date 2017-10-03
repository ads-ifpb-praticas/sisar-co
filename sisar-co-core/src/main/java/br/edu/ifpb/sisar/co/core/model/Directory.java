/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.sisar.co.core.model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author miolivc
 */
public class Directory implements Serializable {
    
    private String name;
    private Directory father;
    private UserAccount owner;
    private List<Archive> archives;

    public Directory() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Directory getFather() {
        return father;
    }

    public void setFather(Directory father) {
        this.father = father;
    }

    public UserAccount getOwner() {
        return owner;
    }

    public void setOwner(UserAccount owner) {
        this.owner = owner;
    }

    public List<Archive> getArchives() {
        return archives;
    }

    public void setArchives(List<Archive> archives) {
        this.archives = archives;
    }

}
