/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArchiUsu;

/**
 *
 * @author GABRIEL-PC
 */
public class ArchUsu {
     public String[] extraerPass(){
        ArchiUsu archivo = new ArchiUsu();
        String resultadoArchivo = archivo.arch();
        String[] strings = resultadoArchivo.split(",");
        return strings;
    }
}
