package dev.andreia.santanderdevweek2023.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {

    private String number;
    private BigDecimal limit;
}
