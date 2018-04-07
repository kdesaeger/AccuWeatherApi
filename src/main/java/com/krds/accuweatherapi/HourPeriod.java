package com.krds.accuweatherapi;

/**
 * Period to use for hourly forecasts
 */
public enum HourPeriod {
    
    HOURS_0(0),
    HOURS_1(1),
    HOURS_6(6), 
    HOURS_12(12), 
    HOURS_24(24),
    HOURS_72(72),
    HOURS_120(120);
    
    private final int hours;

    private HourPeriod(int h) {
        this.hours = h;
    }
    
    public int getHours() {
        return this.hours;
    }
    
}
