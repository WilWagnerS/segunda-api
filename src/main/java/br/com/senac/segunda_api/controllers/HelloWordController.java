package br.com.senac.segunda_api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/helloWord")
public class HelloWordController {

    @GetMapping("/teste")
    public ResponseEntity<String> teste() {
        return ResponseEntity.ok("Ola Word");

    }

    @GetMapping("/parImpar")
    public ResponseEntity<String> parImpar(@RequestParam int numero) {
        if((numero % 2) == 0) {
            return ResponseEntity.ok("Par");
        }

        return ResponseEntity.ok("Impar");
    }
}


