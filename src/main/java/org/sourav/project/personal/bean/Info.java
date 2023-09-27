package org.sourav.project.personal.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Info {
    private ArrayList<String> copyrights;
    private int took;

    public ArrayList<String> getCopyrights() {
        return copyrights;
    }

    public void setCopyrights(ArrayList<String> copyrights) {
        this.copyrights = copyrights;
    }

    public int getTook() {
        return took;
    }

    public void setTook(int took) {
        this.took = took;
    }
}
