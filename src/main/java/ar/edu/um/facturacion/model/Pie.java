package ar.edu.um.facturacion.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "factura_pie")
public class Pie implements Serializable {

    @Id
    @JsonIgnore
    private Long pie_id;

    @MapsId
    @OneToOne
    @JoinColumn(name = "encabezado_id")
    @JsonIgnore
    private Encabezado facturas_encabezado;
    private BigDecimal precioTotal;
    private String observaciones;
}
