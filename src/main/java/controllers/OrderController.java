package controllers;

import APIResponse.BasicResponse;
import models.Order;
import utils.WebRequestUtil;
import utils.WebResponseUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by tnuanchuay on 4/9/2017.
 */

@WebServlet(urlPatterns = { "/order" })
public class OrderController extends HttpServlet{

    private Order orderMockup = new Order(1, new Date(), 1, 'A', 100, "Americano Hot Fleppe", 100);

    private ArrayList<Order> orderRepo = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String> body = WebRequestUtil.GetBody(req);
        try {
            orderRepo.add(new Order(new Date(body.get("orderDate"))
                    , Integer.parseInt(body.get("count"))
                    , body.get("productType").charAt(0)
                    , Double.parseDouble(body.get("totalPayment"))
                    , body.get("productName")
                    , Double.parseDouble(body.get("productPrice"))));
            WebResponseUtil.Response(resp, new BasicResponse(true));
        }catch (Exception e){
            WebResponseUtil.Response(resp, new BasicResponse(true, e.getMessage()));
        }

    }
}
