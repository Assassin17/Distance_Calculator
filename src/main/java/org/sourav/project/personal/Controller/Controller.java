package org.sourav.project.personal.Controller;


import io.micrometer.core.ipc.http.HttpSender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sourav.project.personal.Service.Distance;
import org.sourav.project.personal.bean.ApiResponse;
import org.sourav.project.personal.bean.Constants;
import org.sourav.project.personal.bean.Request;
import org.sourav.project.personal.bean.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@RestController
public  class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Autowired
    private Distance distance;

    @GetMapping(value = "/findDistance")
    public ApiResponse findDistance(@RequestHeader(name = Constants.CONTENT_TYPE,required = false)String contentType,
                                    Request request) throws Exception {
        logger.info("Controller Class-> Get Distance call started");
        ApiResponse response = null;
        try {
             response = distance.getDistance(request);
        }
        catch(Exception e){
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
        logger.info("Controller class Get Distance call ended");
        logger.info("{API Response ::" + response.getDistanceInKm()+ "  " + response.getDateInDays()+"}");
        return response;
    }
    @PostMapping
    public void doSomething(@RequestHeader(name =Constants.CONTENT_TYPE,required = false)String contentType,
                            @RequestBody Request request) throws Exception{

    }


}
