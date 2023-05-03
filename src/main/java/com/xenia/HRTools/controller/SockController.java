package com.xenia.HRTools.controller;

import com.xenia.HRTools.model.SockRequestTemplate;
import com.xenia.HRTools.service.SockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/socks")
public class SockController {
    @Autowired
    SockService sockService;

    @PostMapping
    public ResponseEntity<String> addSock(
            @RequestParam(name = "color") String color,
            @RequestParam(name = "cottonPart") Integer cottonPart,
            @RequestParam(name = "quantity") Integer quantity,
            @RequestParam(name = "size",required = false) Integer size
    ) {
        SockRequestTemplate sockRequestTemplate = SockRequestTemplate.builder().color(color).compoud(cottonPart).size(size).build();
        try {
            sockService.addSock(sockRequestTemplate, quantity);
            return ResponseEntity.ok("");
        } catch (Exception e) {
            return ResponseEntity.status(500).build();

        }
    }

    @GetMapping
    public ResponseEntity<Integer> getSockCount(
            @RequestParam(name = "color") String color,
            @RequestParam(name = "cottonMin",required = false) Integer cottonMin,
            @RequestParam(name = "cottonMax",required = false) Integer cottonMax,
            @RequestParam(name = "size") Integer size
    ) {
        SockRequestTemplate sockRequestTemplate = SockRequestTemplate.builder().color(color).compoudMax(cottonMax).compoudMin(cottonMin).size(size).build();
        try {
            sockService.getSockCount(sockRequestTemplate);
            return ResponseEntity.ok(sockService.getSockCount(sockRequestTemplate));
        } catch (Exception e) {
            return ResponseEntity.status(500).build();
        }
    }


}
//    - POST /api/socks?color=red&36&cottonPart=40&quantity=5 — добавляет на склад пять пар носков красного цвета 36-го размера с долей хлопка в составе 40%;
//- PUT /api/socks?color=red&36&cottonPart=40&quantity=5 — регистрирует отпуск со склада пяти пар носков красного цвета 36-го размера с долей хлопка в составе 40%;
//- GET /api/socks?color=red&36&cottonmin=90 — должен вернуть общее количество красных носков 36-го размера с долей хлопка более 90%;
//- GET /api/socks?color=red&36&cottonmax=10 — должен вернуть общее количество красных носков 36-го размера с долей хлопка менее 10%;
//- DELETE /api/socks?color=red&36&cottonPart=40&quantity=5 — регистрирует списание брака со склада в количестве пяти пар носков красного цвета 36-го размера с долей хлопка в составе 40%.
// http://localhost:8080/api/socks?color=red&36&cottonPart=40&quantity=5&size=43
//

