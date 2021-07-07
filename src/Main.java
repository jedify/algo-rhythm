import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.EntityBuilder;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.FormBodyPart;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import slidingwindow.Solution;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) throws IOException {
   /* Solution solution = new Solution();
    int[] inputArray = new int[]{1,2,2,2,3,1,5};
    System.out.println(new Main().majorityElement(inputArray));*/
    URL url = new URL("https://login.microsoftonline.com/blueyonderinteroptestus.onmicrosoft.com/oauth2/v2.0/token");
    HttpURLConnection http = (HttpURLConnection)url.openConnection();
    http.setRequestMethod("POST");
    http.setDoOutput(true);
    http.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

    String data = "grant_type=client_credentials&client_id=7c1fc452-571b-48bd-be86-676fd51f7e82&client_secret=4PIRd~KJqs2g-cV2bE3Gf_B.d8TwOf2EaW&scope=https://blueyonderinteroptestus.onmicrosoft.com/6ad21424-b4b2-462e-80df-252ec22dd6a9/.default";

    byte[] out = data.getBytes(StandardCharsets.UTF_8);

    OutputStream stream = http.getOutputStream();
    stream.write(out);

    System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
    http.disconnect();

    HttpClient httpClient = HttpClientBuilder.create().build();


    String clientId = "7c1fc452-571b-48bd-be86-676fd51f7e82";
    String clientSecret = "4PIRd~KJqs2g-cV2bE3Gf_B.d8TwOf2EaW";
    String scope = "https://blueyonderinteroptestus.onmicrosoft.com/6ad21424-b4b2-462e-80df-252ec22dd6a9/.default";
    String tokenUrl = "https://login.microsoftonline.com/blueyonderinteroptestus.onmicrosoft.com/oauth2/v2.0/token";
    String AND = "&", EQUAL="=";
    StringBuffer sb = new StringBuffer("");
    sb.append("grant_type").append(EQUAL).append("client_credentials")
            .append(AND).append("client_id").append(EQUAL).append(clientId)
            .append(AND).append("client_secret").append(EQUAL).append(clientSecret)
            .append(AND).append("scope").append(EQUAL).append(scope);
    HttpPost httpPost = new HttpPost(tokenUrl);
    HttpEntity entity = EntityBuilder
            .create()
            .setContentType(ContentType.APPLICATION_FORM_URLENCODED)
            .setBinary(sb.toString().getBytes(StandardCharsets.UTF_8))
            .build();
    httpPost.setEntity(entity);
    HttpResponse response = httpClient.execute(httpPost);
    HttpEntity responseEntity = response.getEntity();
    String responseString = EntityUtils.toString(responseEntity, "UTF-8");
    System.out.println(responseString);

  }

  public int majorityElement(int[] nums) {
    int count = 0;
    Integer candidate = null;

    for(int num: nums){
      if(count==0) candidate = num;
      count+=(candidate==num) ? 1 : -1;
    }

    return candidate;
  }
}
