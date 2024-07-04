package com.demoproject.controller.calc;

import com.demoproject.data.calculator.impl.NatriyDto;
import com.demoproject.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class NatriyController {
    private final CalculatorService<NatriyDto> calculatorService;

    @GetMapping("/natriycalc")
    public String natriycalc(Model model) {
        model.addAttribute("calcs", calculatorService.getCalculations());
        return "natriycalc";
    }

    @PostMapping("/natriycalc/сalculate")
    public String calculate(NatriyDto calc) {
        calculatorService.saveCalc(calc);
        return "redirect:/natriycalc";
    }
}
