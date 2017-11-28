package server.rapidoid;

import org.rapidoid.http.Req;
import org.rapidoid.http.ReqHandler;

public class rapidoidserver implements ReqHandler{

    @Override
    public Object execute(Req req) throws Exception {
//        String a = req.header("guideid");
//        System.out.println(a);
//        String a = req.param("guideid");
//        System.out.println(a);
        return "hello";
    }
}
