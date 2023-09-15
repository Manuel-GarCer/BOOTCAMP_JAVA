package org.example.entity;

import lombok.*;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "TABLA_PRODUCTO")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank( message = "El nombre no puede estar en blanco")
    private String nombre;

    //@Size(min=1,max = 200)
    private int cantidad;

    //@NotBlank( message = "El precio no puede ser vacio")
    private double precio;

}
