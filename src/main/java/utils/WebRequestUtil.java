package utils;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by tnuanchuay on 4/9/2017.
 */
public class WebRequestUtil {

    public static Map<String, String> GetBody(HttpServletRequest request) throws IOException {
        String[] body = request.getReader().lines().collect(Collectors.joining(System.lineSeparator())).split("&");
        Map<String, String> map = new HashMap<>();

        for(int i = 0 ; i < body.length ; i++) {
            String[] slice = body[i].split("=");
            map.put(slice[0], slice[1]);
        }

        return map;
    }
}
