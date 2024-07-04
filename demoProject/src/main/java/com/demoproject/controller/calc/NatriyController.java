package com.demoproject.controller.calc;

import com.demoproject.data.calculator.impl.NatriyDto;
import com.demoproject.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class NatriyController {
    private final CalculatorService<NatriyDto> calculatorService;

    @GetMapping("/natriycalc")
    public ResponseEntity<String> info() {
        return new ResponseEntity<>("info", HttpStatus.OK);
    }

    @PostMapping("/natriycalc/сalculate")
    public ResponseEntity<Double> calculate(@RequestBody NatriyDto calc) {
        return new ResponseEntity<>(calculatorService.calculate(calc), HttpStatus.OK);
    }
}
