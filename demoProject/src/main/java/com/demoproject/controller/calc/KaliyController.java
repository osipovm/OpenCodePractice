package com.demoproject.controller.calc;

import com.demoproject.data.calculator.impl.KaliyDto;
import com.demoproject.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class    KaliyController {
    private final CalculatorService<KaliyDto> calculatorService;

    @GetMapping("/kaliycalc")
    public String kaliycalc(Model model) {
        model.addAttribute("calcs", calculatorService.getCalculations());
        return "kaliycalc";
    }

    @PostMapping("/kaliycalc/calculate")
    public String calculate(KaliyDto calc) {
        calculatorService.saveCalc(calc);
        return "redirect:/kaliycalc";
    }
}
