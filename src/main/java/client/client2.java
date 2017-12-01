package client;

import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.client.api.ContentResponse;
import org.eclipse.jetty.http.HttpMethod;

import java.util.concurrent.*;

public class client2 {
    public static void main(String[] args) throws Exception {

        ExecutorService es = Executors.newCachedThreadPool();
        int numFile = 1000;
        Future<Long>[] future = new Future[numFile];
        for(int i=0; i<numFile;i++){
            Callable ca = new getRequest("http://localhost:9997?guideid=1");
            future[i] = es.submit(ca);
        }
        Long result = Long.valueOf(0);
        for(int i=0; i<numFile; i++){
            result += future[i].get();
        }
        System.out.println(result/numFile);
        es.shutdown();
        try {
            while (!es.awaitTermination(5, TimeUnit.MINUTES));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
