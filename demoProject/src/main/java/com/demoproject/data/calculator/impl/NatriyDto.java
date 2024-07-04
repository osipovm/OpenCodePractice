package com.demoproject.data.calculator.impl;


import com.demoproject.data.calculator.AbstractCalcDto;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@EqualsAndHashCode(callSuper = true)
@Data
public class NatriyDto extends AbstractCalcDto {
    @Min(0)
    @Max(100)
    double glucoza;

    @Min(0)
    @Max(100)
    double natriy;

}
