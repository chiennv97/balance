package rapidoidTest;

import org.rapidoid.net.Server;

public class Test {

    public static void main(String[] args) throws Exception {
        Server server = new CustomHttpServer().listen(5050);

        // Not doing any work now, so shutdown
        server.shutdown();
    }

}