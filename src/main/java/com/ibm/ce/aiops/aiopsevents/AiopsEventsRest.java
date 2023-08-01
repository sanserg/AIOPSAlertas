package com.ibm.ce.aiops.aiopsevents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.ibm.ce.aiops.aiopsevents.dto.Event;
import com.ibm.ce.aiops.aiopsevents.dto.RetornoAPI;

@RestController
@RequestMapping("/api")
public class AiopsEventsRest {
    
    @Autowired
    KafkaTemplate<String,String> kafka;

    @Value("${topico}")
    private String topico;

    @PostMapping(path="/alerta", consumes = "application/json")
    public ResponseEntity<RetornoAPI> adicionaAlerta(@RequestBody Event evento)
    {
        RetornoAPI retorno = new RetornoAPI();
        //System.out.println(evento.getSender().getName());
        //System.out.println(new Gson().toJson(evento));
        kafka.send(topico,null, new Gson().toJson(evento));
        retorno.setCodigoRetorno(200);
        retorno.setMensagem("Alerta processado com sucesso");
        return ResponseEntity.ok(retorno);
    }

    
}
