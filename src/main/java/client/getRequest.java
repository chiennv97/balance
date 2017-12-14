package client;

import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.client.api.ContentResponse;
import org.eclipse.jetty.http.HttpMethod;

import java.util.concurrent.Callable;

public class getRequest implements Callable {
    private String url;

    public getRequest(String url) {
        this.url = url;
    }

    @Override
    public Long call() throws Exception {
        HttpClient httpClient = new HttpClient();
        httpClient.start();
        String a = "dddd";
        Long start = System.currentTimeMillis();
        ContentResponse response = httpClient.newRequest(url)
                .method(HttpMethod.GET)
                .send();
        Long time = System.currentTimeMillis() - start;
        httpClient.stop();
        return time;
    }
}
