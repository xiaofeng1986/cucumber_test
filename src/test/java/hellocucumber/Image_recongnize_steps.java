package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.Assert.assertTrue;

public class Image_recongnize_steps {
    final String POST_PARAMS = "{\n" + "\"businessId\": \"415611-0\",\r\n" +
            "    \"storeName\": \"上海农工商0293店-中兴店\",\r\n" +
            "    \"storeNo\": \"2000287815\",\r\n" +
            "    \"province\": \"上海\",\r\n" +
            "    \"city\": \"上海市\",\r\n" +
            "    \"area\": \"长宁区\",\r\n" +
            "    \"address\": \"中山国际广场B座2楼\",\r\n" +
            "    \"lat\": \"31.525829\",\r\n" +
            "    \"lgt\": \"121.757661\",\r\n" +
            "    \"salesId\": \"19070005\",\r\n" +
            "    \"salesName\": \"肖峰\",\r\n" +
            "    \"imgUrl\": \"https://s3-005-shinho-sfa-uat.s3.cn-north-1.amazonaws.com.cn/ab909a7a-f0d8-489c-9716-69c8aa6ad527.jpeg\",\r\n" +
            "    \"storeType\": \"CTP-GT\",\r\n" +
            "    \"sceneCategoryOne\": \"B\",\r\n" +
            "    \"sceneCategoryTwo\": \"B1\",\r\n" +
            "    \"photoTime\": \"2019-08-31 13:14:17\",\r\n" +
            "    \"dataSources\": \"1\",\r\n" +
            "    \"isSplice\": \"0\",\r\n" +
            "    \"isAiQuality\": \"1\",\r\n" +
            "    \"authorization\": \"Ym4NMkE75yLDCLiVy7s9dAJxiAPFwzdUtB\"" + "\n}";


    @Given("prepare token")
    public void prepare_token() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("call image analysis input API")
    public void call_image_analysis_input_API() throws IOException {
        URL url = new URL("https://apimarket-test.shinho.net.cn/ir-ai-service/image/analysis");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json; utf-8");
        con.setDoOutput(true);

        try(OutputStream os = con.getOutputStream()) {
            os.write(POST_PARAMS.getBytes("utf-8"));
        }

        InputStream is;
        if (con.getResponseCode() >= 400) {
            is = con.getErrorStream();
        } else {
            is = con.getInputStream();
        }

        try(BufferedReader br = new BufferedReader(
                new InputStreamReader(is,"utf-8" ))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }

            assertTrue(
                    "Response Code : " + con.getResponseCode() + "\n" +
                    "Response Message : " + con.getResponseMessage() + "\n" +
                    "Response Body: " + response.toString() + "\n" +
                    "Request Body : " + POST_PARAMS ,response.toString().contains("200"));
        }

    }

    @Then("image records generate in IR platform.")
    public void image_records_generate_in_IR_platform() {
        // Write code here that turns the phrase above into concrete actions
    }
}
