package com.kodilla.patterns.enums.hotel;

import java.math.BigDecimal;

public enum Season {
    LOW (new BigDecimal(250), new BigDecimal(350)),
    HIGH (new BigDecimal(320), new BigDecimal(400)),
    HOLIDAY (new BigDecimal(400), new BigDecimal(500)) ; //tu ma być średnik!!!!

    private BigDecimal singlRoomPrice;
    private BigDecimal doubleRoomPrice;

    Season(BigDecimal singlRoomPrice, BigDecimal doubleRoomPrice) {
        this.singlRoomPrice = singlRoomPrice;
        this.doubleRoomPrice = doubleRoomPrice;
    }

    public BigDecimal getSinglRoomPrice() {
        return singlRoomPrice;
    }

    public BigDecimal getDoubleRoomPrice() {
        return doubleRoomPrice;
    }
}
