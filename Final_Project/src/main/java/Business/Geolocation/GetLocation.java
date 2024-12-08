package Business.Geolocation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;

public class GetLocation {
    private static final String USER_AGENT = "Mozilla/5.0 (Geocoding Application; contact@example.com)";

    public static String getCoordinates(String address) {
        try {
            String urlString = "https://nominatim.openstreetmap.org/search?q=" + 
                address.replace(" ", "+") + "&format=json&addressdetails=1";
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("User-Agent", USER_AGENT);

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = in.readLine()) != null) {
                response.append(line);
            }
            in.close();

            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getAddress(double latitude, double longitude) {
        try {
            String urlString = String.format(
                "https://nominatim.openstreetmap.org/reverse?lat=%f&lon=%f&format=json&addressdetails=1",
                latitude, longitude
            );
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("User-Agent", USER_AGENT);

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = in.readLine()) != null) {
                response.append(line);
            }
            in.close();

            // Parse the JSON response
            JSONObject jsonResponse = new JSONObject(response.toString());
            if (jsonResponse.has("display_name")) {
                //System.out.println(jsonResponse.getString("display_name"));
                return jsonResponse.getString("display_name");
            } else {
                return "Address not found";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}