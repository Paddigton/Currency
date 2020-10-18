package com.example.currency.model;

import com.example.currency.dto.CurrencyDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "CURRENCY")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String country;
    private Double value;

}
