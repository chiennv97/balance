package client;


import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.client.api.ContentResponse;
import org.eclipse.jetty.client.util.StringContentProvider;
import org.eclipse.jetty.http.HttpMethod;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class democlient {
    public static void main(String[] args) throws Exception {
        HttpClient httpClient = new HttpClient();
        httpClient.start();
        String a = "aaa";
        ContentResponse response = httpClient.newRequest("http://localhost:9997/hello")
                .method(HttpMethod.POST)
                .content(new StringContentProvider(a))
                .send();
        try {
            httpClient.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
