package com.aws.docker.awsdocker.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Location {
    private String locName;
    private String locAddress;
    private double lat, lon;

    @Override
    public String toString() {
        return "Location{" +
                "locName='" + locName + '\'' +
                ", locAddress='" + locAddress + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                '}';
    }
}
