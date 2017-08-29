/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.sisar.co.core.validator;

import br.edu.ifpb.sisar.co.core.model.UserAccount;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author miolivc
 */
public class UserAccountValidatorTest {
    
    private final UserAccountValidator validator = new UserAccountValidator();
    
    @Test
    public void testaNomeInvalidoCaracEspecial() {
        UserAccount account = new UserAccount();
        account.setName("M@ria Leticia!");
        assertFalse(validator.isValid(account));
    }
    
    @Test
    public void testaNomeValido() {
        UserAccount account = new UserAccount();
        account.setName("Maria Leticia Abrantes");
        account.setEmail("maleticiaab@gmail.com");
        account.setPassword("12345678");
        assertTrue(validator.isValid(account));
    }
    
    @Test
    public void testaNomeVazio() {
        UserAccount account = new UserAccount();
        account.setName("");
        assertFalse(validator.isValid(account));
    }
    
    @Test
    public void testaNomeNulo() {
        assertFalse(validator.isValid(null));
    }
    
    @Test
    public void testaEmailInvalido () {
        UserAccount account = new UserAccount();
        account.setName("Maria Ana");
        account.setEmail("@mariaaana");
        assertFalse(validator.isValid(null));
    }
    
    @Test
    public void testaSenhaValida() {
        UserAccount account = new UserAccount();
        account.setName("Maria Ana Andrade");
        account.setEmail("mariaanaand@acom.br");
        account.setPassword("marianalegal");
        assertTrue(validator.isValid(account));
    }
    
    @Test
    public void testaSenhaMaisCaracteres() {
        UserAccount account = new UserAccount();
        account.setName("Maria Ana Andrade");
        account.setEmail("mariaanaand@acom.br");
        account.setPassword("marianalegalsasasasasaaaaaaaaaaaaaaaaaaaaaasasas");
        assertFalse(validator.isValid(account));
    }
    
    @Test
    public void testaSenhaMenosCaracteres() {
        UserAccount account = new UserAccount();
        account.setName("Maria Ana Andrade");
        account.setEmail("mariaanaand@acom.br");
        account.setPassword("maria");
        assertFalse(validator.isValid(account));
    }
    
}
