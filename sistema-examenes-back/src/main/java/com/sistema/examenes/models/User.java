package com.sistema.examenes.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String name;
    private String lastname;
    private String email;
    private String phone;
    private boolean enabled = true;
    private String profil;

    /**
    * Un Usuario tiene varios Roles
    * Se pone Cascade si se elimina se borran todos los registro relacionados al Usuario
    * EAGER ansioso a esperar y mostra todos los registro LAZY perezoso y muestra lo necesario
    * mappedBY apunta a la entidad propietaria de la relación
    **/
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "user")
    @JsonIgnore
    private Set<UserRole> userRoles = new HashSet<>();
}
