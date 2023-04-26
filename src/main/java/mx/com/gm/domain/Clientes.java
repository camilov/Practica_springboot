package mx.com.gm.domain;

/**
 *
 * @author Janus
 */


import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="clientes")

public class Clientes implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCliente")
    private int idCliente;
    
   @Column(name="nombre")
    private String nombre;
    
    
}
