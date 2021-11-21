package io.zipcoder.currencyconverterapplication;

public enum CurrencyType {
    AUSTRALIAN_DOLLAR(2.70),
    CANADIAN_DOLLAR(2.64),
    CHINESE_YR(13.84),
    EURO(1.88),
    FRANC(2.02),
    POUND(1.64),
    RINGGIT(8.94),
    RUPEE(136.64),
    SINGAPORE_DOLLAR(1.86),
    US_DOLLAR(2.0),
    UNIVERSAL_CURRENCY(1.0),
    YEN(231.68);

    private final double rate;

    CurrencyType(double rate) {
        this.rate = rate;
    }

    public Double getRate() {
        return rate;
    }

    public static CurrencyType getTypeOfCurrency(ConvertableCurrency currency) {


        if (currency.getRate() == AUSTRALIAN_DOLLAR.rate) {
            return AUSTRALIAN_DOLLAR;
        }

        if (currency.getRate() == CANADIAN_DOLLAR.rate) {
            return CANADIAN_DOLLAR;
        }

        if (currency.getRate() == CHINESE_YR.rate) {
            return CHINESE_YR;
        }

        if (currency.getRate() == EURO.rate) {
            return EURO;
        }

        if (currency.getRate() == FRANC.rate) {
            return FRANC;
        }

        if (currency.getRate() == POUND.rate) {
            return POUND;
        }

        if (currency.getRate() == RINGGIT.rate) {
            return RINGGIT;
        }

        if (currency.getRate() == RUPEE.rate) {
            return RUPEE;
        }

        if (currency.getRate() == SINGAPORE_DOLLAR.rate) {
            return SINGAPORE_DOLLAR;
        }

        if (currency.getRate() == UNIVERSAL_CURRENCY.rate) {
            return UNIVERSAL_CURRENCY;
        }

        if (currency.getRate() == US_DOLLAR.rate) {
            return US_DOLLAR;
        }

        if (currency.getRate() == YEN.rate) {
            return YEN;
        }

        return null;








    }
}
