package server.spark;

import org.json.JSONObject;
import spark.Request;
import spark.Response;
import spark.Route;

import java.util.ArrayList;

public class sparkserverw implements Route {

    public Object handle(Request request, Response response) throws Exception {
        String a = request.queryParams("guideid");
//        String a  = request.headers("guideid");
//        a.add(obj);
        System.out.println(a);
//        Thread.sleep(20);
        return "hello" + a;
    }
}
