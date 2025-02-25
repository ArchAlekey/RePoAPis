package com.example.gmk.Models;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table(name = "tbl_teclados")

public class teclados {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nid_teclado")
    private Long IdTeclado; // Este es el campo clave primaria

    @Column(name = "nid_marca")
    private Long IdMarca;

    @Column(name = "nid_modelo")
    private Long IdModelo;

    @Column(name = "cdistribucion")
    private String Distribucion;
    
    @Column(name = "nprecio")
    private long Precio;

    @Column(name = "bhabilitado")
    private boolean Habilitado;

    @Column(name = "dfecha_alta")
    private LocalDate FechaAlta;

    @Column(name = "dfecha_baja")
    private LocalDate FechaBaja;

    //Getters y Setters
    public Long getIdTecaldo(){
        return IdTeclado;
    }
    public void setIdTeclado(Long NIdTeclado){
        this.IdTeclado = NIdTeclado;
    }

    public Long getIdMarca(){
        return IdMarca;
    }
    public void setIdMarca(Long NIdMarca){
        this.IdMarca = NIdMarca;
    }

    public Long getIdModelo(){
        return IdModelo;
    }
    public void setIdModelo(Long NIdModelo){
        this.IdModelo = NIdModelo;
    }

    public String getCDistribucion(){
        return Distribucion;
    }
    public void setCDistribucion(String CDistribucion){
        this.Distribucion = CDistribucion;
    }

    public Long getPrecio(){
        return Precio;
    }
    public void setPrecio(Long NPrecio){
        this.Precio = NPrecio;       
    }

    public boolean getHabilitado(){
        return Habilitado;
    }
    public void setHabilitado(boolean BHabilitado){
        this.Habilitado = BHabilitado;
    }

    public LocalDate getFechaAlta(){
        return FechaAlta;
    }
    public void setFechaAlta(LocalDate DFechaAlta){
        this.FechaAlta = DFechaAlta;
    }

    public LocalDate getFechaBaja(){
        return FechaBaja;
    }
    public void setFechaBaja(LocalDate DFechaBaja){
        this.FechaBaja = DFechaBaja;
    }

    
}
