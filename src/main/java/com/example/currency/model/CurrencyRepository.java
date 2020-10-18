package com.example.currency.model;

import org.springframework.data.jpa.repository.JpaRepository;

interface CurrencyRepository extends JpaRepository<Currency, String> {
}
