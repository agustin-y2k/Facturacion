package ar.edu.um.facturacion.model;

import ar.edu.um.facturacion.common.Identificador;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable, Identificador<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String nombre;
    @NotEmpty
    private String cuit;
    @NotEmpty
    private String direccion;
    @Enumerated(EnumType.ORDINAL)
    private CondicionIva condicionIva;
    @Column
    private Boolean active = true;


}
