package cn.hamster3.bot.utils;

import java.io.IOException;
import java.net.Authenticator;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;

import com.google.gson.JsonObject;

/**
 * @author wangjing <wangjing16@kuaishou.com>
 * Created on 2020-05-22
 */
public class HttpsUtils {

    public static final String CLIENT_ID = "0f67d51719294b33888c74f0cd888d0e";

    public static final String  CLIENT_SECRET = "5dc0c4fea35c4066ae7a2a31249ee2fe";

    public static final String  TOKEN = "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkMwQkU5QUI4OUYyQTBFOTMxQUFGMjBEOEVDREY4Nzc2OTFFRDcyRjgiLCJ0eXAiOiJhdCtqd3QiLCJ4NXQiOiJ3TDZhdUo4cURwTWFyeURZN04tSGRwSHRjdmcifQ.eyJuYmYiOjE1OTAyMTk3MDMsImV4cCI6MTU5MTQyOTMwMywiaXNzIjoiaHR0cDovL2lkZW50aXR5LnJpY2hhc3kuY24iLCJhdWQiOiJ3ZmEiLCJjbGllbnRfaWQiOiIwZjY3ZDUxNzE5Mjk0YjMzODg4Yzc0ZjBjZDg4OGQwZSIsInNjb3BlIjpbIndmYS5iYXNpYyIsIndmYS5saWIucXVlcnkiXX0.S99ytxtYzDSTJ-NEidAfcEiAfDPQCbZFfWv0_4bhfo70zVk-0ycDyqj-E3digAHYrriVcIwpRVLf4nZQ9GgLR0Z6fbQSqOwCFP_YDJ3xJ_UJAqFu7VZokHXLJelU-GL0wx_G-yIm6rH7HKi_uVAaJ6D9-fnJylbbsOI_cYn5-fd3uHBA_bBFmsTzuwM-SKaNGwbOcLEQbkyuT_wF7RJWN7n1RvfoQhGL3BvzEUIPwo5FnojA_NVQNpvlHCyrI4cYIQwI6JdByLvwHTuZwrRrsviU-XxK-Dq6SDFJEyWb0Pz1u4scp27Q_gh4bHxYg9uje-Tt5Kyk0ItLEUhBgvpQ9w";



    public static String  doGet (URI uri) throws NoSuchAlgorithmException {
        HttpClient httpClient = HttpClient.newBuilder()
                .version(Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(5))
                .followRedirects(HttpClient.Redirect.ALWAYS)
                .sslContext(SSLContext.getDefault())
                .build();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .GET()
                .setHeader("Authorization", TOKEN)
                .timeout(Duration.ofSeconds(5))
                .uri(uri)
                .build();
        try {
            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            String f = httpResponse.body();
            return httpResponse.body();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "";
    }
}
