package com.codigo.productomicroservicio.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "producto")
@Getter
@Setter
@NoArgsConstructor
public class ProductoEntity {

    private String id;
    private String productoNombre;
    private String productoDesc;
    private Double valorUnitario;
    private Double precioUnitario;
    private String sku;
    private Integer cantidad;
    private Integer estado;


}
