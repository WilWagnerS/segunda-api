package br.com.senac.segunda_api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping ("/Calcular")

public class CalculadoraController {

    @GetMapping ("/somar")
    public ResponseEntity<Integer> somar(
            @RequestParam int numero1, @RequestParam int numero2){
        int resultado = numero1 + numero2;
        return ResponseEntity.ok(resultado);
    }
    @GetMapping ("/subtrair")
    public ResponseEntity<Integer> subtrair(
            @RequestParam int numero1, @RequestParam int numero2){
        int resultado = numero1 - numero2;
        return ResponseEntity.ok(resultado);
    }
    @GetMapping ("/divisao")
    public ResponseEntity<Integer> divisao(
            @RequestParam int numero1, @RequestParam int numero2){
        int resultado = numero1 / numero2;
        return ResponseEntity.ok(resultado);
    }
    @GetMapping ("/mult")
    public ResponseEntity<Integer> mult(
            @RequestParam int numero1, @RequestParam int numero2){
        int resultado = numero1 * numero2;
        return ResponseEntity.ok(resultado);
    }

}
