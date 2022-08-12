package com.sistema.examenes.repositorys;

import com.sistema.examenes.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
