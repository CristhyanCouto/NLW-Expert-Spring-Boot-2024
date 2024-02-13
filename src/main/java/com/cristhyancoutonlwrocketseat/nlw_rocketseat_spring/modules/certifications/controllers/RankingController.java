package com.cristhyancoutonlwrocketseat.nlw_rocketseat_spring.modules.certifications.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cristhyancoutonlwrocketseat.nlw_rocketseat_spring.modules.certifications.useCases.Top10RankingUseCase;
import com.cristhyancoutonlwrocketseat.nlw_rocketseat_spring.modules.students.entities.CertificationStudentEntity;

@RestController
@RequestMapping("/ranking")
public class RankingController {

    @Autowired
    private Top10RankingUseCase top10RankingUseCase;
    
    @GetMapping("/top10")
    public List<CertificationStudentEntity> top10(){
        return this.top10RankingUseCase.execute();
    }
}
