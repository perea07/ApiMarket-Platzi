
package com.myprojects.api.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author yeison
 */
@Entity
@Table(name = "compras")
@Getter
@Setter
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer idCompra;
    
    @Column(name = "id_cliente")
    private String idCliente;
    
    private LocalDateTime fecha;
    
    @Column(name = "medio_pago")
    private String medioPago;
    
    private String comentario;
    
    private String estado;
    
}
