package com.cristhyancoutonlwrocketseat.nlw_rocketseat_spring.modules.certifications.useCases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristhyancoutonlwrocketseat.nlw_rocketseat_spring.modules.students.entities.CertificationStudentEntity;
import com.cristhyancoutonlwrocketseat.nlw_rocketseat_spring.modules.students.repositories.CertificationStudentRepository;

@Service
public class Top10RankingUseCase {

    @Autowired
    private CertificationStudentRepository certificationStudentRepository;
    
    public List<CertificationStudentEntity> execute(){
        var result = this.certificationStudentRepository.findTop10ByOrderByGradeDesc();
        return result;
    }
}
