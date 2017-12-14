package server.spark;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;


public class demoserver {
    public static void main(String[] args) {
        port(9997);
        post("/hello", (request, response) -> {
            System.out.println(request.body());
            return null;
        });
    }
}
