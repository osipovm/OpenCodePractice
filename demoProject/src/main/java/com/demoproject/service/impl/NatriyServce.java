package com.demoproject.service.impl;

import com.demoproject.data.calculator.impl.NatriyDto;
import com.demoproject.service.CalculatorService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NatriyServce implements CalculatorService<NatriyDto> {
    private List<NatriyDto> natriyCalcList = new ArrayList<>();


    public List<NatriyDto> getCalculations() {
        return natriyCalcList;
    }

    public void saveCalc(NatriyDto calc) {
        calc.setResult((int) (calc.getNatriy() + 0.024 * (calc.getGlucoza() - 100)));
        natriyCalcList.add(calc);
    }
}
