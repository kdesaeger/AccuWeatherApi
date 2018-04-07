package com.krds.accuweatherapi;

public enum Daily {
    
    DAYS_1(1), 
    DAYS_5(5),
    DAYS_10(10), 
    DAYS_15(15);
    
    private final int days;

    Daily(int d) {
        this.days = d;
    }
    
    public int getDays() {
        return this.days;
    }
    
}
