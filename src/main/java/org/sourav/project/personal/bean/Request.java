package org.sourav.project.personal.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Request {
    private String latOrigin;
    private String longOrigin;
    private String latDest;
    private String longDest;
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getLatOrigin() {
        return latOrigin;
    }

    public void setLatOrigin(String latOrigin) {
        this.latOrigin = latOrigin;
    }

    public String getLongOrigin() {
        return longOrigin;
    }

    public void setLongOrigin(String longOrigin) {
        this.longOrigin = longOrigin;
    }

    public String getLatDest() {
        return latDest;
    }

    public void setLatDest(String latDest) {
        this.latDest = latDest;
    }

    public String getLongDest() {
        return longDest;
    }

    public void setLongDest(String longDest) {
        this.longDest = longDest;
    }

}
