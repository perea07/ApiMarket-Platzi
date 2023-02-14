
package com.myprojects.api.persistence.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author yeison
 */
@Entity
@Table(name = "compras_productos")
@Getter
@Setter
public class ComprasProducto {

    @EmbeddedId
    private ComprasProductoPK id;
    private Integer cantidad;
    private Double total;
    private Boolean estado;

}
