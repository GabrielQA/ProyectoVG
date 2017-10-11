/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author GABRIEL-PC
 */
public class ArchiAdmin {
   

    public String arch() {
        String inString = "";
        try {
            File archivo = new File("Admin.txt");

            FileReader leer = new FileReader(archivo);

            try (BufferedReader inStream = new BufferedReader(leer)) {
                inString = inStream.readLine();
                inStream.close();

            }

        } catch (IOException e) {
            System.out.println("no se ha podido leer el archivo" + e);
        }
        return inString;
    }

    

}
