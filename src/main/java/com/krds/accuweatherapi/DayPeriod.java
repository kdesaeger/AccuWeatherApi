package com.krds.accuweatherapi;

/**
 * Period to use for daily forecasts
 */
public enum DayPeriod {
    
    DAYS_1(1), 
    DAYS_5(5),
    DAYS_10(10), 
    DAYS_15(15);
    
    private final int days;

    private DayPeriod(int d) {
        this.days = d;
    }
    
    public int getDays() {
        return this.days;
    }
    
}
