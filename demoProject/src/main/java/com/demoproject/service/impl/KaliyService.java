package com.demoproject.service.impl;


import com.demoproject.data.calculator.impl.KaliyDto;
import com.demoproject.service.CalculatorService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KaliyService implements CalculatorService<KaliyDto> {
    public double calculate(KaliyDto calc) {
        calc.setResult(((5 - calc.getKaliy()) * 0.2 * calc.getWeight()));
        return calc.getResult();
    }

}
