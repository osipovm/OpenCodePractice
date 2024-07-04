package com.demoproject.controller.calc;

import com.demoproject.data.calculator.impl.PercentDto;
import com.demoproject.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class PercentController {
    private final CalculatorService<PercentDto> calculatorService;

    @GetMapping("/percentcalc")
    public String percentcalc(Model model) {
        model.addAttribute("calcs", calculatorService.getCalculations());
        return "percentcalc";
    }

    @PostMapping("/percentcalc/сalculate")
    public String calculate(PercentDto calc) {
        calculatorService.saveCalc(calc);
        return "redirect:/percentcalc";
    }
}
