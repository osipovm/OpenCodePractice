package com.demoproject.service.impl;

import com.demoproject.data.calculator.impl.NatriyDto;
import com.demoproject.service.CalculatorService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NatriyServce implements CalculatorService<NatriyDto> {
    public double calculate(NatriyDto calc) {
         calc.setResult((int) (calc.getNatriy() + 0.024 * (calc.getGlucoza() - 100)));
         return calc.getResult();
    }
}
