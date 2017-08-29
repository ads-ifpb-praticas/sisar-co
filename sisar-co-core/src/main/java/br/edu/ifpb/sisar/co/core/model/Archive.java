/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.sisar.co.core.model;

import java.io.Serializable;

/**
 *
 * @author miolivc
 */
public class Archive implements Serializable {
    
    private UserAccount owner;
    private String name;
    private String type;
    private long lenght;
    private byte[] content;

    public Archive() {
    }

    public UserAccount getOwner() {
        return owner;
    }

    public void setOwner(UserAccount owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getLenght() {
        return lenght;
    }

    public void setLenght(long lenght) {
        this.lenght = lenght;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
    
}
