/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.sisar.co.core.validator;

import br.edu.ifpb.sisar.co.core.model.UserAccount;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author miolivc
 */
public class UserAccountValidator {
    
    public boolean isValid(UserAccount account) {
        if (account == null) return false;
        return nameIsValid(account.getName()) &&
                emailIsValid(account.getEmail()) && 
                passwordIsValid(account.getPassword());
    }
    
    public static boolean nameIsValid(String name) {
        if (name == null || name.isEmpty()) return false;
        Pattern pattern = Pattern.compile("[a-zA-ZÁ-úÃ-ũ]+(\\s[a-zA-ZÁ-úÃ-ũ]+)*");
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
    
    public static boolean emailIsValid(String email) {
        if (email == null || email.isEmpty()) return false;
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    public static boolean passwordIsValid(String password) {
        if (password == null) return false;
        return !(password.length() < 8 || password.length() > 16);
    }
    
}
