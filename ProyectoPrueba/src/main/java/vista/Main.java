/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;
import modelo.ConexionBD;
/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
      ConexionBD conecion = new ConexionBD();
      conecion.obtenerConexion();
      
    }
}
