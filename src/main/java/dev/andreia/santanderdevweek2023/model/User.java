package dev.andreia.santanderdevweek2023.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String name;
    private Account account;
    private List<Feature> features;
    private Card card;
    private List<News> news;

}
