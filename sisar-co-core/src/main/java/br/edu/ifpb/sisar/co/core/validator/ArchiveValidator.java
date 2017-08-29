/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.sisar.co.core.validator;

import br.edu.ifpb.sisar.co.core.model.Archive;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author miolivc
 */
public class ArchiveValidator {
    
    public boolean isValid(Archive archive) {
        if (archive == null) return false;
        return ownerIsValid(archive);
    }
    
    private boolean ownerIsValid(Archive archive) {
        UserAccountValidator validator = new UserAccountValidator();
        return validator.isValid(archive.getOwner());
    }
    
    private boolean nameIsValid(Archive archive) {
        if (archive.getName() == null || archive.getName().isEmpty()) return false;
        Pattern pattern = Pattern.compile("[a-zA-Z]_!_#_-");
        Matcher matcher = pattern.matcher(archive.getName());
        return matcher.matches();
    }
    
}
