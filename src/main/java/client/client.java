package client;

import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.client.api.ContentResponse;
import org.eclipse.jetty.http.HttpMethod;

public class client {
    public static void main(String[] args) throws Exception {

        HttpClient httpClient = new HttpClient();
        httpClient.start();
        ContentResponse response = httpClient.newRequest("http://localhost:8080?guideid=112")
                .method(HttpMethod.GET)
                .send();
        System.out.println(response.getContentAsString());

        httpClient.stop();
    }
}
