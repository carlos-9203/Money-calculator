package moneycalculator;

public interface ExchangeRateLoader {
    ExchangeRate load(Currency from, Currency to);
}
