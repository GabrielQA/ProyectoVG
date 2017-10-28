/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArchUsuIntro;

import static Logins.TiendaGV.DRT;
import java.util.LinkedList;

/**
 *
 * @author GABRIEL-PC
 */
public class Music1 {

    private String Nombre;
    private String Autor;
    private String Genero;
    private String Costo;
    private String ListaCa;
    private String Cantidad;
    private final FileManager fileManager;

    public Music1() {
        fileManager = new FileManager();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getCosto() {
        return Costo;
    }

    public void setCosto(String Costo) {
        this.Costo = Costo;
    }

    public String getListaCa() {
        return ListaCa;
    }

    public void setListaCa(String ListaCa) {
        this.ListaCa = ListaCa;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public void insertar(Music1 v) {

        if (v.getGenero().equals("Rock") || DRT.getSelectedItem().equals("Rock")) {
            Info d = new Info();
            d.insertar(v);
        }
        if (v.getGenero().equals("Rut") || DRT.getSelectedItem().equals("Rut")) {
            Info d = new Info();
            d.insertar(v);
        }
        if (v.getGenero().equals("Rancheras") || DRT.getSelectedItem().equals("Rancheras")) {
            Info d = new Info();
            d.insertar(v);
        }
        if (v.getGenero().equals("Electronica") || DRT.getSelectedItem().equals("Electronica")) {
            Info d = new Info();
            d.insertar(v);
        }
    }

    public Music1 buscar(String Nombre) {
        LinkedList<Music1> v = getMusic1();
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i).getNombre().equals(Nombre)) {
                if (v.get(i).getGenero().equals("Rock") || DRT.getSelectedItem().equals("Rock")) {
                    Info d = (Info) v.get(i);
                    return d;

                }
                if (v.get(i).getGenero().equals("Electronica") || DRT.getSelectedItem().equals("Electronica")) {
                    Info d = (Info) v.get(i);
                    return d;
                }
                if (v.get(i).getGenero().equals("Rut") || DRT.getSelectedItem().equals("Rut")) {
                    Info d = (Info) v.get(i);
                    return d;
                }
                if (v.get(i).getGenero().equals("Rancheras") || DRT.getSelectedItem().equals("Rancheras")) {
                    Info d = (Info) v.get(i);
                    return d;
                }

            }
        }
        return null;
    }

    private LinkedList<Music1> getMusic1() {
        LinkedList<Music1> v = new LinkedList<>();
        String[] autos = fileManager.read("Musica.txt").split("\n");
        for (int i = 0; i < autos.length; i++) {
            String[] datos = autos[i].split(",");

            if (datos[2].equals("Rock")) {
                Info Rock = new Info();
                Rock.setNombre(datos[0]);
                Rock.setAutor(datos[1]);
                Rock.setGenero(datos[2]);
                Rock.setCosto(datos[3]);
                Rock.setListaCa(datos[4]);
                Rock.setCantidad(datos[5]);

                v.add(Rock);
            }
            if (datos[2].equals("Rancheras")) {
                Info Rancheras = new Info();
                Rancheras.setNombre(datos[0]);
                Rancheras.setAutor(datos[1]);
                Rancheras.setGenero(datos[2]);
                Rancheras.setCosto(datos[3]);
                Rancheras.setListaCa(datos[4]);
                Rancheras.setCantidad(datos[5]);
                v.add(Rancheras);
            }
            if (datos[2].equals("Electronica")) {
                Info E = new Info();
                E.setNombre(datos[0]);
                E.setAutor(datos[1]);
                E.setGenero(datos[2]);
                E.setCosto(datos[3]);
                E.setListaCa(datos[4]);
                E.setCantidad(datos[5]);
                v.add(E);
            }
            if (datos[2].equals("Rut")) {
                Info Rut = new Info();
                Rut.setNombre(datos[0]);
                Rut.setAutor(datos[1]);
                Rut.setGenero(datos[2]);
                Rut.setCosto(datos[3]);
                Rut.setListaCa(datos[4]);
                Rut.setCantidad((datos[5]));
                v.add(Rut);
                v.add(Rut);
            }

        }
        return v;
    }

    @Override
    public String toString() {
        return "Canciones: " + this.getListaCa() + "\nGenero: " + this.getGenero()
                + "\nCosto: " + this.getCosto() + "\nCancion: " + this.getNombre() + "\nCancion: " + this.getAutor() + "\nCancion: " + this.getCantidad();
    }
}
