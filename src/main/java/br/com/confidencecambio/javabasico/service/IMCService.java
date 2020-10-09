package br.com.confidencecambio.javabasico.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.lang.*;

@Service


public class IMCService{
    @Autowired



    private static List<IMCForm> IMCForms = Arrays.asList(
                    new IMCForm("Jonas", 1.80f, 80.0f, IMCForm.getIMC(), IMCForm.getUppercase(),
                    IMCForm.getNameAbbreviated(), IMCForm.getNameSur(), IMCForm.getNameFirst(), IMCForm.getNameLast(),
                    IMCForm.getMiddleName())
            );
    public static List<IMCForm> getImcForms(){
        return(IMCForms);
    }

    public static void addIMC(IMCForm IMCForm) {
        IMCService.addIMC(IMCForm);
    }
}
