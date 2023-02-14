package com.myprojects.api.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author yeison
 */

@Entity
@Table()
@Getter
@Setter
@Embeddable
public class ComprasProductoPK implements Serializable{

    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name = "id_producto")
    private Integer idProducto;

}
