package com.ecomarket.ApiInventarioV2.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "inventario")
@NoArgsConstructor
@AllArgsConstructor
public class Inventario {

    @Id
    @Column(name = "inventario_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "producto_id", nullable = false)
    private Producto producto;
    
    @Column(name = "stock_disponible", nullable = false)
    private int stockDisponible;

   @Column(name = "ubicacion_bodega", nullable = false, length = 45)
    private String ubicacionBodega;

}
