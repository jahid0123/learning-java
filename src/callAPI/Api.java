package callAPI;


import okhttp3.*;

import java.io.IOException;

public class Api {
    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url("https://mail.google.com/mail/u/0/#inbox/FMfcgzQZSsGSGCNbPFzzcXJtFVQhNvjq")
                //.method("GET", body)
                .build();
        Response response = client.newCall(request).execute();


        System.out.println("Response Code: " + response.code());
        System.out.println("Response Body: " + response.body().string());
    }
}
