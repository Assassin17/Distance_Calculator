package org.sourav.project.personal.utils;

import org.sourav.project.personal.bean.ApiResponse;
import org.sourav.project.personal.bean.Response;

import java.util.Map;

import static org.sourav.project.personal.bean.Constants.MULTIPLY_FACTOR;
import static org.sourav.project.personal.bean.Constants.MULTIPLY_FACTOR_DOUBLE;

public class CommonUtils {
    public static String getParamString(Map<String,String> params){
        StringBuilder result = new StringBuilder();
        for(Map.Entry<String,String> entry: params.entrySet()){
            if(entry.getValue()!=null){
                result.append(entry.getKey());
                result.append("=");
                result.append("{");
                result.append(entry.getKey());
                result.append("}");
                result.append("&");
            }
        }
        String resultString =result.toString();
        if(resultString.length()>0){
            return resultString.substring(0,resultString.length()-1);
        }
        else {
            return resultString;
        }
    }
    public static ApiResponse mapResponse(Response response){
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setDateInDays(Integer.toString(Math.round(response.getPaths().get(0).getTime()/MULTIPLY_FACTOR)));
        apiResponse.setDistanceInKm(Double.toString(response.getPaths().get(0).getDistance()/MULTIPLY_FACTOR_DOUBLE));
        return apiResponse;
    }
}
