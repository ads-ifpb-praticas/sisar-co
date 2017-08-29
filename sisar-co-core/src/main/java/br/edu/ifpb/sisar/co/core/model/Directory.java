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

}
