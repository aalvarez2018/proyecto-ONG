/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.ong.daoImpl;

import co.edu.udea.ong.dao.UsuarioDao;
import co.edu.udea.ong.entidades.Usuario;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author ?
 */
public class UsuarioDaoImpl implements UsuarioDao{
    
    public SessionFactory factory;
    
    public UsuarioDaoImpl(){
        factory=new Configuration().configure("utils/hibernate.cfg.xml").addAnnotatedClass(Usuario.class).buildSessionFactory();
    }

    @Override
    public String guardarUsuario(Usuario usuario) {
        try{  
            Session session=factory.openSession();
            session.beginTransaction();
            session.save(usuario);
            session.getTransaction().commit();
            return "Registro correcto";
        }catch(HibernateException e){
            e.printStackTrace();
        }
        return "Registro incorrecto";
    }

    @Override
    public String editarUsuario(String cedula) {
        return "";
    }

    @Override
    public String eliminarUsuario(String cedula) {
        return "";
    }

    @Override
    public String buscarUsuario(String cedula) {
        return "";
    }
    
}
