package br.com.confidencecambio.javabasico;

import br.com.confidencecambio.javabasico.service.IMCForm;
import br.com.confidencecambio.javabasico.service.IMCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.lang.*;


@RestController
public class HelloWorldRs {


    @RequestMapping(value = "/getIMC", method=RequestMethod.GET)
    public List<IMCForm> getIMC() {
        return IMCService.getImcForms();
    }
    @RequestMapping(value = "/getIMC/{name}", method=RequestMethod.GET)
    public List<IMCForm> getIMC(@PathVariable String name) {
        return IMCService.getImcForms();
    }

    @RequestMapping(value = "/getIMC/", method=RequestMethod.POST )
    public void addIMC(@RequestBody IMCForm IMCForm){
        IMCService.addIMC(IMCForm);


    }
    }







