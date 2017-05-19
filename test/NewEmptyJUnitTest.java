/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import co.edu.udea.ong.dao.UsuarioDao;
import co.edu.udea.ong.daoImpl.UsuarioDaoImpl;
import co.edu.udea.ong.entidades.Usuario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ?
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @Test
    public void testGuardar() {
        Usuario usuario=new Usuario("nilton velez","nilton.velez@udea.edu.co", "1017233591",
                "estudiante", true);
        UsuarioDao dao= new UsuarioDaoImpl();
        dao.guardarUsuario(usuario);
        
        assertTrue(2==1);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
