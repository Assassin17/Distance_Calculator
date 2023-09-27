package org.sourav.project.personal.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResponse {
    private String distanceInKm;
    private String numberOfDays;
    public String getDistanceInKm() {
        return distanceInKm;
    }

    public void setDistanceInKm(String distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public String getDateInDays() {
        return numberOfDays;
    }

    public void setDateInDays(String dateInDays) {
        this.numberOfDays = dateInDays;
    }

}
