/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.ong.dao;

import co.edu.udea.ong.entidades.Usuario;

/**
 *
 * @author ?
 */
public interface UsuarioDao {
    
    public String guardarUsuario(Usuario usuario);
    public String editarUsuario(String cedula);
    public String eliminarUsuario(String cedula);
    public String buscarUsuario(String cedula);
}
