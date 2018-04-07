package com.krds.accuweatherapi;

/**
 * Period to use for forecasts
 */
public enum Period {
    
    DAYS_1(1), 
    DAYS_5(5),
    DAYS_10(10), 
    DAYS_15(15);
    
    private final int days;

    private Period(int d) {
        this.days = d;
    }
    
    public int getDays() {
        return this.days;
    }
    
}
