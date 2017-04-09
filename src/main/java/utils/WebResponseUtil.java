package utils;

import org.codehaus.jackson.map.ObjectMapper;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by tnuanchuay on 4/9/2017.
 */
public class WebResponseUtil {
    public static void Response(HttpServletResponse resp, Object responseObject) throws IOException {
        ServletOutputStream out = resp.getOutputStream();
        resp.setContentType("application/json; charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");

        ObjectMapper mapper = new ObjectMapper();
        out.print(mapper.writeValueAsString(responseObject));

        out.flush();
        out.close();
    }
}
