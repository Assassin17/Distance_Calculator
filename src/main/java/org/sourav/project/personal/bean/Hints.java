package org.sourav.project.personal.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Hints {

    private int visited_nodes_sum;
    private double visited_nodes_average;
    public int getVisited_nodes_sum() {
        return visited_nodes_sum;
    }

    public void setVisited_nodes_sum(int visited_nodes_sum) {
        this.visited_nodes_sum = visited_nodes_sum;
    }

    public double getVisited_nodes_average() {
        return visited_nodes_average;
    }

    public void setVisited_nodes_average(double visited_nodes_average) {
        this.visited_nodes_average = visited_nodes_average;
    }
}
