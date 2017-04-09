package Controllers;

import Models.Hello;
import org.codehaus.jackson.map.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by tnuanchuay on 4/9/2017.
 */

@WebServlet(urlPatterns = { "/hello" })
public class HelloController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();
        resp.setContentType("application/json; charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");

        ObjectMapper mapper = new ObjectMapper();
        out.print(mapper.writeValueAsString(new Hello(1, "message 1")));

        out.flush();
        out.close();
    }
}
