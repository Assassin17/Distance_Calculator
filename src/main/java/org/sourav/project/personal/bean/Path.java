package org.sourav.project.personal.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Path {
    private double distance;
    private double weight;
    private int time;
    private int transfers;
    private boolean points_encoded;
    private ArrayList<Double> bbox;
    private String points;
    private ArrayList<Object> legs;
    private Details details;
    private double ascend;
    private double descend;
    private String snapped_waypoints;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTransfers() {
        return transfers;
    }

    public void setTransfers(int transfers) {
        this.transfers = transfers;
    }

    public boolean isPoints_encoded() {
        return points_encoded;
    }

    public void setPoints_encoded(boolean points_encoded) {
        this.points_encoded = points_encoded;
    }

    public ArrayList<Double> getBbox() {
        return bbox;
    }

    public void setBbox(ArrayList<Double> bbox) {
        this.bbox = bbox;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public ArrayList<Object> getLegs() {
        return legs;
    }

    public void setLegs(ArrayList<Object> legs) {
        this.legs = legs;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public double getAscend() {
        return ascend;
    }

    public void setAscend(double ascend) {
        this.ascend = ascend;
    }

    public double getDescend() {
        return descend;
    }

    public void setDescend(double descend) {
        this.descend = descend;
    }

    public String getSnapped_waypoints() {
        return snapped_waypoints;
    }

    public void setSnapped_waypoints(String snapped_waypoints) {
        this.snapped_waypoints = snapped_waypoints;
    }

}
