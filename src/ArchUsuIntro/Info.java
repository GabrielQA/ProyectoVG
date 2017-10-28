/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArchUsuIntro;

/**
 *
 * @author GABRIEL-PC
 */
public class Info extends Music1{
      
    public void insertar(Info d){
        FileManager fileManager = new FileManager();
        String texto = fileManager.read("Musica.txt");
        String InfoNueva = d.getNombre()+","+d.getAutor()+","+d.getGenero()+","+d.getCosto()
                +","+ d.getListaCa() +","+d.getCantidad();
        fileManager.write("Musica.txt", texto+InfoNueva);
    }
    
    public void update(Info d){
        FileManager fileManager = new FileManager();
        String [] texto = fileManager.read("Musica.txt").split("\n");
        String InfoNueva = "";
        for (int i = 0; i < texto.length; i++) {
            String [] datos = texto[i].split(",");
            if (datos[1].equals(d.getAutor())) {
                InfoNueva += d.getNombre()+","+d.getAutor()+","+d.getListaCa()+","+d.getCosto()
                +","+d.getGenero();
            }else{
                InfoNueva += texto[i];
            }
            if (i!=(texto.length-1)) {
                InfoNueva += "\n";
            }
        }
        fileManager.write("Musica.txt", InfoNueva);
    }
    
    @Override
    public String toString() {
        return "Lista de Canciones: "+this.getListaCa()+"\n Genero: " +this.getGenero()
                +"\n Nombre: " + this.getNombre()
                +"\n Precio: " + this.getCosto()
                +"\n Autor: " + this.getAutor();
                
    }
}

