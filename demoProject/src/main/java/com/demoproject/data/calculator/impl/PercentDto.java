package com.demoproject.data.calculator.impl;


import com.demoproject.data.calculator.AbstractCalcDto;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@EqualsAndHashCode(callSuper = true)
@Data
public class PercentDto extends AbstractCalcDto {
    @Min(0)
    @Max(100)
    private double percent;

    @Min(0)
    @Max(100)
    private double volume;
}

