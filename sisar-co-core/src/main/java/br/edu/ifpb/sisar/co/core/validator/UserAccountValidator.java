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
        return nameIsValid(account) && emailIsValid(account) && passwordIsValid(account);
    }
    
    private boolean nameIsValid(UserAccount account) {
        if (account.getName() == null || account.getName().isEmpty()) return false;
        Pattern pattern = Pattern.compile("[a-zA-Z]+(\\s[a-zA-Z]+)*");
        Matcher matcher = pattern.matcher(account.getName());
        return matcher.matches();
    }
    
    private boolean emailIsValid(UserAccount account) {
        if (account.getEmail() == null || account.getEmail().isEmpty()) return false;
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(account.getEmail());
        return matcher.matches();
    }
    
    private boolean passwordIsValid(UserAccount account) {
        if (account.getPassword() == null) return false;
        return !(account.getPassword().length() < 8 || account.getPassword().length() > 16);
    }
}
