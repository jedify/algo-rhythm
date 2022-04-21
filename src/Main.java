import com.google.gson.Gson;
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
import test.B;

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
        /*String subject = "/blobServices/default/containers/jda-5c335b18-b076-4c1b-bbe1-3aefe66a01ba/blobs/image-service/upload/bbnb1.jpeg";
        String[] subjectParts = subject.split("/");
        if (subjectParts.length < 5) {
            System.err.println("tenant not found");
        }
        if (!subjectParts[6].contentEquals("image-service")) {
            System.err.println("unrelated subject");
        }

        String tenantSpecificContainer = subjectParts[4];
        if (!tenantSpecificContainer.startsWith("jda-")) {
            System.err.println(" subject from other tenant");
        }
        String tenantId = tenantSpecificContainer.substring(4);
        System.out.println("Tenant id : " + tenantId);
        */
        B b = new B("aavi", "id1");
        System.out.println(new Gson().toJson(b));
    }

    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) candidate = num;
            count += (candidate == num) ? 1 : -1;
        }

        return candidate;
    }
}
