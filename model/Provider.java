package com.javarush.task.task28.task2810.model;

import com.javarush.task.task28.task2810.vo.Vacancy;
import java.util.List;

public class Provider {

    private Strategy strategy;

    // Конструктор
    public Provider(Strategy strategy) {
        this.strategy = strategy;
    }

    // Сеттеры и геттеры
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    // Методы
    public List<Vacancy> getJavaVacancies(String searchString) {
        return strategy.getVacancies(searchString);

    }
}
