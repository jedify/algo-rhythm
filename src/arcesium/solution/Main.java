package arcesium.solution;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import com.google.gson.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) throws IOException {
/*
        String response = new ReadResponse().readApiResponse("https://raw.githubusercontent.com/arcjsonapi/HoldingValueCalculator/master/api/holding", "GET");
        Holding[] holdings = new Gson().fromJson(response, Holding[].class);
        List<Holding> holdingList = Arrays.asList(holdings);
        response = new ReadResponse().readApiResponse("https://raw.githubusercontent.com/arcjsonapi/HoldingValueCalculator/master/api/pricing", "GET");
        Pricing[] pricingArrs = new Gson().fromJson(response, Pricing[].class);
        List<Pricing> pricings = Arrays.asList(pricingArrs);
*/
        /*String response = new ReadResponse().readApiResponse("https://raw.githubusercontent.com/arcjsonapi/ApiSampleData/master/api/users", "GET");
        JsonParser parser = new JsonParser();
        JsonElement elem = parser.parse(response);

        JsonArray elemArr = elem.getAsJsonArray();
        System.out.println(elemArr.size());
        System.out.println();*/

        System.out.println(new Gson().toJson(Result.apiResponseParser(Arrays.asList("address.geo.lat", "IN", "-17.3159,-67.3159"), 3)));
    }
}


class Result {

    /*
     * Complete the 'apiResponseParser' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY inputList
     *  2. INTEGER size
     */
    public static List<Integer> apiResponseParser(List<String> inputList, int size) {
        List<Integer> userIds = new ArrayList<>();
        ReadApiResponse readApiResponse = new ReadApiResponse();
        try {
            String response = readApiResponse.readApiResponse("https://raw.githubusercontent.com/arcjsonapi/APISampleData/master/api/users");
            JsonParser parser = new JsonParser();
            JsonElement userResponse = parser.parse(response);
            JsonArray users = userResponse.getAsJsonArray();
            System.out.println(users.size());
            userIds = new SearchUser().findUsers(users, inputList.get(0), inputList.get(1), inputList.get(2));
        } catch (Exception ex) {
            System.err.println("Error getting api response and parsing to get result");
            userIds.add(-1);
        }
        return userIds;
    }
}

class SearchUser {
    private final String EQUALS = "EQUALS";
    private final String IN = "IN";

    public List<Integer> findUsers(JsonArray users, String nodes, String comparator, String value) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            JsonElement user = users.get(i);
            if (this.checkForUser(user.getAsJsonObject(), nodes, comparator, value)) {
                result.add(user.getAsJsonObject().get("id").getAsInt());
            }
        }
        if (result.isEmpty()) {
            result.add(-1);
        }
        return result;
    }

    private boolean checkForUser(JsonElement user, String nodes, String operationType, String value) {
        boolean found = false;
        String[] nodeStrs = nodes.contains(".")?nodes.split("\\."):new String[]{nodes};
        JsonElement comparingObject = user;
        for (int i = 0; i < nodeStrs.length; i++) {
            JsonObject userObject = comparingObject.getAsJsonObject();
            if (userObject.has(nodeStrs[i])) {
                comparingObject = userObject.get(nodeStrs[i]);
            } else {
                throw new RuntimeException("Property not found");
            }
        }
        if (operationType.equals(EQUALS)) {
            if (comparingObject.getAsString().equals(value)) {
                found = true;
            }
        } else if (operationType.equals(IN)) {
            String[] values = value.contains(",")?value.split("\\,"):new String[]{value};
            for (int i = 0; i < values.length; i++) {
                if (values[i].equals(comparingObject.getAsString())) {
                    found = true;
                    break;
                }
            }
        }
        return found;
    }
}

class ReadApiResponse {
    public String readApiResponse(String urlStr) {
        StringBuffer apiResponse = new StringBuffer("");
        try {
            URL url = new URL(urlStr);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();
            if (urlConnection.getResponseCode() != HttpURLConnection.HTTP_OK) {
                throw new RuntimeException("Error fetching userdata");
            }

            try (InputStream inputStream = urlConnection.getInputStream(); Scanner scanner = new Scanner(inputStream);) {
                while (scanner.hasNext()) {
                    apiResponse.append(scanner.nextLine());
                }
            }
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
            System.err.println(exception.getCause());
            throw new RuntimeException("Error fetching userdata");
        }
        return apiResponse.toString();
    }
}