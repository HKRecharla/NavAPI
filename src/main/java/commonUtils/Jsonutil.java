package commonUtils;

import com.google.gson.Gson;

import java.lang.reflect.Type;

public class Jsonutil {

    public static <T> Class<T> convertStringtoObject(String responseBody, Class<T> cl){
        Gson g = new Gson();
       Class<T> t= g.fromJson(responseBody, (Type) cl);
       return t;
    }



}
