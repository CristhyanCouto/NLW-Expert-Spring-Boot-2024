package com.cristhyancoutonlwrocketseat.nlw_rocketseat_spring.modules.students.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristhyancoutonlwrocketseat.nlw_rocketseat_spring.modules.students.entities.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, UUID>{

    public Optional <StudentEntity> findByEmail(String email);
}
