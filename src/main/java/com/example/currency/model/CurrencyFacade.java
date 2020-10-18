package com.example.currency.model;

import com.example.currency.dto.CurrencyDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class CurrencyFacade {

    private final CurrencyRepository repository;

    Double getCurrencyValue(String nameCurrency) {

        Double values = null;
        List<Currency> currencies = repository.findAll();
        for (Currency curr : currencies) {
           if(nameCurrency.equals(curr.getCountry()))
            values = curr.getValue();
        }
        return values;
    }
}

