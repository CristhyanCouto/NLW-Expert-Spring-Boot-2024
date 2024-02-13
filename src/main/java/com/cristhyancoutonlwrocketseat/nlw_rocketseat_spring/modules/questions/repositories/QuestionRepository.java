package com.cristhyancoutonlwrocketseat.nlw_rocketseat_spring.modules.questions.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristhyancoutonlwrocketseat.nlw_rocketseat_spring.modules.questions.entities.QuestionEntity;

public interface QuestionRepository extends JpaRepository<QuestionEntity, UUID>{
    
    List<QuestionEntity> findByTechnology(String technology);
}
