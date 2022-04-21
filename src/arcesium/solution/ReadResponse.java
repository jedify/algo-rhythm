package arcesium.solution;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ReadResponse {
    public String readApiResponse(String api, String method) throws IOException {
        URL url = new URL(api);
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestMethod(method);
        urlConnection.connect();
        if (urlConnection.getResponseCode() != java.net.HttpURLConnection.HTTP_OK) {
            throw new RuntimeException("Error reading api");
        }
        StringBuffer stringBuffer = new StringBuffer();
        try (InputStream inputStream = urlConnection.getInputStream(); Scanner scanner = new Scanner(inputStream);) {
            while (scanner.hasNext()) {
                stringBuffer.append(scanner.nextLine());
            }
        }
        return stringBuffer.toString();
    }
}
