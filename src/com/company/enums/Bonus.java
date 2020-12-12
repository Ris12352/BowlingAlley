package com.company.enums;

public enum Bonus {

    STRIKE(10),
    SPARE(5);

    int bonus;

    Bonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return  bonus;
    }
}
