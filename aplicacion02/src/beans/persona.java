/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author CESDE
 */
public class persona {
    private int id_persona;
    private String nombre;
    private String ape_paterno;
    private String ape_maternmo;

    /**
     * @return the id_persona
     */
    public int getId_persona() {
        return id_persona;
    }

    /**
     * @param id_persona the id_persona to set
     */
    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the ape_paterno
     */
    public String getApe_paterno() {
        return ape_paterno;
    }

    /**
     * @param ape_paterno the ape_paterno to set
     */
    public void setApe_paterno(String ape_paterno) {
        this.ape_paterno = ape_paterno;
    }

    /**
     * @return the ape_maternmo
     */
    public String getApe_maternmo() {
        return ape_maternmo;
    }

    /**
     * @param ape_maternmo the ape_maternmo to set
     */
    public void setApe_maternmo(String ape_maternmo) {
        this.ape_maternmo = ape_maternmo;
    }
    
}
