package server.rapidoid;

import org.rapidoid.setup.On;

public class server4  {
    public static void main(String[] args) {
        On.port(9998);
        On.get("/").plain(new rapidoidserver());
    }
}
