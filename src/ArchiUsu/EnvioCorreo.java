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
public class EnvioCorreo {

    /**
     * @return the usuarioCorreo
     */
    public String getUsuarioCorreo() {
        return usuarioCorreo;
    }

    /**
     * @param usuarioCorreo the usuarioCorreo to set
     */
    public void setUsuarioCorreo(String usuarioCorreo) {
        this.usuarioCorreo = usuarioCorreo;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * @return the nombreArchivo
     */
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    /**
     * @param nombreArchivo the nombreArchivo to set
     */
    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    /**
     * @return the rutaArchi
     */
    public String getRutaArchi() {
        return rutaArchi;
    }

    /**
     * @param rutaArchi the rutaArchi to set
     */
    public void setRutaArchi(String rutaArchi) {
        this.rutaArchi = rutaArchi;
    }

    /**
     * @return the Asunto
     */
    public String getAsunto() {
        return Asunto;
    }

    /**
     * @param Asunto the Asunto to set
     */
    public void setAsunto(String Asunto) {
        this.Asunto = Asunto;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }
    private String usuarioCorreo;
private String contraseña;
private String nombreArchivo;
private String rutaArchi;
private String Asunto;
private String mensaje;
private String destino;
}
