package CRUD;

import java.io.Serializable;

public class JugueteDTO implements Serializable {
    public Integer Id;
    private String nombreJuguete;
    private String categoria;
    private int cantidad;

    private int precio;

    public JugueteDTO(Integer id, String nombreJuguete, String categoria, int cantidad, int precio) {
        Id = id;
        this.nombreJuguete = nombreJuguete;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Integer getId() {
        return Id;
    }

    public String getNombreJuguete() {
        return nombreJuguete;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setNombreJuguete(String nombreJuguete) {
        this.nombreJuguete = nombreJuguete;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
