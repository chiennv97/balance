package server.rapidoid;

import org.rapidoid.setup.On;

public class server3 {
    public static void main(String[] args) {
        On.port(9997);
        On.get("/").plain(new rapidoidserver());
    }
}
