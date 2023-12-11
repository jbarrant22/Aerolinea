package com.example.domain;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name="boletos")
@NoArgsConstructor

public class Boleto {
    
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "idBoletos")
    private Long idBoletos;//Hibeernate lo convierte en id_boletos
    private Long idPaises;
    private String descripcion;
    private String detalle;
    private String precio;
    private String destino;
    private boolean activo;

    public Boleto(Long idPaises, String descripcion, String detalle, String precio, String destino, boolean activo) {
        this.idPaises = idPaises;
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.destino = destino;
        this.activo = activo;
    }


    
    
}

    

