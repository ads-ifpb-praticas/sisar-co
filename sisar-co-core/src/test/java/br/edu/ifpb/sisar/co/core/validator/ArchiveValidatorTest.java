/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.sisar.co.core.validator;

import br.edu.ifpb.sisar.co.core.model.Archive;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author miolivc
 */
public class ArchiveValidatorTest {
    private final ArchiveValidator validator = new ArchiveValidator();
    
    @Test
    public void testaArquivoSemValores() {
        Archive archive = new Archive();
        assertFalse(validator.isValid(archive));
    }
    
    @Test
    public void testaNomeCaracEspecial() {
        Archive archive = new Archive();
        assertFalse(validator.isValid(archive));
    }
    
}
