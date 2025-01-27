package callAPI;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class ApiExample {
    public static void main(String[] args) {
        // Create OkHttpClient instance
        OkHttpClient client = new OkHttpClient();

        // Build the GET request
        Request request = new Request.Builder()
                .url("https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1") // API endpoint
                .get() // GET method
                .build();

        try {
            // Execute the request
            Response response = client.newCall(request).execute();

            // Print response code and body
            System.out.println("Response Code: " + response.code());
            System.out.println("Response Body: " + response.body().string());

        } catch (IOException e) {
            // Handle exceptions
            e.printStackTrace();
        }
    }
}
