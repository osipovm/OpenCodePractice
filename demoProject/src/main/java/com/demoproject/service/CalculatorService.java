package com.demoproject.service;

import com.demoproject.data.calculator.AbstractCalcDto;

import java.util.List;

public interface CalculatorService<T extends AbstractCalcDto> {
    double calculate(T dto);
}
