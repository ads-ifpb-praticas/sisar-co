/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.sisar.co.core.model;

/**
 *
 * @author miolivc
 */
public enum Permition {
    
    READ, // This allow view and download a archive or directory
    WRITE, // This allow create or exclude directory or files on specific directory with this permition
    OWNER // This have total permition for create, modify or exclude archives or directories
    
}
