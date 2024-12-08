/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.OrderManagement;
import java.net.URLEncoder;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author aakashbelide
 */
public class Mailer {
    private static final String API_BASE_URL = "https://api.mailgun.net/v3/sandbox0e31813ba4974d83b473efa64e90392c.mailgun.org/messages";
    private static final String API_KEY = "0302d1daa90ba94c6349babde8498ff2-f55d7446-004dad22";

//    public static void main(String[] args) {
//        sendEmail("aakashcoolstar12@gmail.com", "Test Email", "Hello from Mailgun!");
//    }

    public static void sendEmail(String to, String subject, String body) {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpPost postRequest = new HttpPost(API_BASE_URL);

            // Add authentication header
            String auth = "api:" + API_KEY;
            String encodedAuth = Base64.getEncoder().encodeToString(auth.getBytes(StandardCharsets.UTF_8));
            postRequest.setHeader("Authorization", "Basic " + encodedAuth);
            
            String senderEmail = "ordersupport@minfoo.com";
            
            String formData = String.format(
                "from=%s&to=%s&subject=%s&html=%s",
                URLEncoder.encode(senderEmail, StandardCharsets.UTF_8),
                URLEncoder.encode(to, StandardCharsets.UTF_8),
                URLEncoder.encode(subject, StandardCharsets.UTF_8),
                URLEncoder.encode(body, StandardCharsets.UTF_8)
            );
            postRequest.setEntity(new StringEntity(formData));
            postRequest.setHeader("Content-Type", "application/x-www-form-urlencoded");

            // Execute request
            try (CloseableHttpResponse response = httpClient.execute(postRequest)) {
                System.out.println("Response Status: " + response.getStatusLine().getStatusCode());
                String responseContent = EntityUtils.toString(response.getEntity());
                System.out.println("Response: " + responseContent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
