package com.cristhyancoutonlwrocketseat.nlw_rocketseat_spring.modules.students.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristhyancoutonlwrocketseat.nlw_rocketseat_spring.modules.students.dto.VerifyHasCertificationDTO;
import com.cristhyancoutonlwrocketseat.nlw_rocketseat_spring.modules.students.repositories.CertificationStudentRepository;

@Service
public class VerifyIfHasCertificationUseCase {
    
    @Autowired
    private CertificationStudentRepository certificationStudentRepository;

    public boolean execute(VerifyHasCertificationDTO dto){
        var result = this.certificationStudentRepository.findByStudentEmailAndTechnology(dto.getEmail(), dto.getTechnology());
        if(!result.isEmpty()){
            return true;
        }
        return false;
    }
}
