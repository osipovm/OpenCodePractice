package com.demoproject.service.impl;


import com.demoproject.data.calculator.impl.PercentDto;
import com.demoproject.service.CalculatorService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PercentService implements CalculatorService<PercentDto> {
    private List<PercentDto> percentCalcList = new ArrayList<>();

    public List<PercentDto> getCalculations() {
        return percentCalcList;
    }


    public void saveCalc(PercentDto calc) {
        calc.setResult((int) (calc.getPercent() * calc.getVolume() * 10));
        percentCalcList.add(calc);
    }


}
