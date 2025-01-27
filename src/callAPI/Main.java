package callAPI;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

            try {
                OkHttpClient client = new OkHttpClient();

                Request request = new Request.Builder()
                        .url("https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1")
                        .get()
                        .build();

                Response response = client.newCall(request).execute();

                System.out.println("Response Code: " + response.code());
                System.out.println("Response Body: " + response.body().string());

            } catch (IOException e) {
                System.err.println("An IOException occurred:");
                e.printStackTrace();
            }
        }
}
