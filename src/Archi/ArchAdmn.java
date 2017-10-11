/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archi;

/**
 *
 * @author GABRIEL-PC
 */
public class ArchAdmn {
     public String[] extraerPass(){
        ArchiAdmin archivo = new ArchiAdmin();
        String resultadoArchivo = archivo.arch();
        String[] strings = resultadoArchivo.split("-");
        return strings;
    }
}
