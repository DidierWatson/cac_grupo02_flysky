package CaC.Grupo2.FlySky.entity.usuario;

import CaC.Grupo2.FlySky.entity.Reserva;
import lombok.*;

import javax.persistence.*;
import java.util.List;
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@EqualsAndHashCode

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuarioID")
    private Long usuarioID;

    @Column(name = "tipo_usuario")
    private TipoUsuarioEnum tipoUsuario;

    @Column(name = "nombre_completo_usuario")
    private String nombreCompletoUsuario;

    @Column(name = "telefono")
    private int telefono;

   }

