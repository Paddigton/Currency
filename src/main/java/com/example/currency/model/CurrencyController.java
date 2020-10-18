package com.example.currency.model;

import com.example.currency.dto.CurrencyDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
class CurrencyController {

    private CurrencyFacade facade;

    @GetMapping("/currency/{currencyName}")
    ResponseEntity<CurrencyDto> getCurrency(@PathVariable String currencyName) {
                CurrencyDto curr = new CurrencyDto();
        try {
            Double values = facade.getCurrencyValue(currencyName);
            curr.setValue(values);
            return new ResponseEntity<>(curr, HttpStatus.OK);
        } catch (Exception e) {
            curr.setError("Nie znaleziono waluty " + currencyName + " w bazie danych.");
            return new ResponseEntity<>(curr, HttpStatus.BAD_REQUEST);
        }
    }
}
