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
public class Directory extends File implements Serializable {
    private List<File> files;

    public Directory() {
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

}
