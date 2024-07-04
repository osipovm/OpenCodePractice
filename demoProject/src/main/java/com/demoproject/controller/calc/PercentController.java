package com.demoproject.controller.calc;

import com.demoproject.data.calculator.impl.PercentDto;
import com.demoproject.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PercentController {
    private final CalculatorService<PercentDto> calculatorService;

    @GetMapping("/percentcalc")
    public ResponseEntity<String> info() {
        return new ResponseEntity<>("info", HttpStatus.OK);
    }

    @PostMapping("/percentcalc/сalculate")
    public ResponseEntity<Double> calculate(@RequestBody PercentDto calc) {
        return new ResponseEntity<>(calculatorService.calculate(calc), HttpStatus.OK);
    }
}
