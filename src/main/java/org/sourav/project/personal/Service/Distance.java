package org.sourav.project.personal.Service;

import io.micrometer.core.ipc.http.HttpSender;
import org.apache.hc.core5.http.HttpResponse;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sourav.project.personal.Controller.Controller;
import org.sourav.project.personal.bean.ApiResponse;
import org.sourav.project.personal.bean.Request;
import org.sourav.project.personal.bean.Response;
import org.sourav.project.personal.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class Distance {
    private static final Logger logger = LoggerFactory.getLogger(Distance.class);

    @Value("${distance.api.endpoint}")
    private String distanceEndpoint;

    public ApiResponse getDistance(Request request) throws Exception{
        Response response =null;
        ResponseEntity<Response> responseEntity;
        try{
            Map<String,String> requestParams = new HashMap<>();
            setParams(requestParams,request);
            logger.info(requestParams.toString());
            HttpEntity<?> requestEntity = new HttpEntity<>(null);
            StringBuilder url = new StringBuilder();
            url.append(distanceEndpoint);
            url.append("?");
            url.append(CommonUtils.getParamString(requestParams));

            logger.info("Get Distance call started");
            RestTemplate restTemplate = setupRestTemplate();
            responseEntity = restTemplate.exchange(url.toString(), HttpMethod.GET,requestEntity, Response.class,requestParams);
            response = responseEntity.getBody();
            if(responseEntity.getStatusCode().is2xxSuccessful()){
                logger.info("Get Distance API call success with response with code:" +responseEntity.getStatusCode());
                logger.debug(response.toString());
            }
            else{
                logger.error("API Error");
                throw new Exception("Some Internal Error");
            }


        }catch(Exception e){
            throw new Exception("Some Internal Error",e);
        }
        ApiResponse apiResponse = CommonUtils.mapResponse(response);
    return apiResponse;
    }
    private void setParams(Map<String,String> requestParams, Request request){
        requestParams.put("lat1",request.getLatOrigin());
        requestParams.put("lng1",request.getLongOrigin());
        requestParams.put("lat2",request.getLatDest());
        requestParams.put("lng2",request.getLongDest());
        requestParams.put("token",request.getToken());
    }
    private RestTemplate setupRestTemplate(){
        RestTemplate restTemplate = new RestTemplate();
        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
        requestFactory.setConnectTimeout(5000);
        restTemplate.setRequestFactory(requestFactory);
        return restTemplate;

    }

}
