package io.fcc;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */


import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class LoginNew {
    public LoginNew() {}
    public static void main(String[] args) throws IOException {
        String  accessToken = new LoginNew().doit();
        System.out.println(accessToken);
    }
    public String doit() throws IOException {
        Properties properties = loadPropertiesFile();
        String clientId = properties.getProperty("clientId");
        String accessToken=null;
        if (clientId == null)
            throw new IllegalStateException("You must define a credentials.properties in the resources directory");
        String secret = properties.getProperty("secret");
        URL url = new URL("https://financialdataexchange-dev.apigee.net/oauth/accesstoken");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        http.setRequestMethod("POST");
        http.setDoOutput(true);
        http.setRequestProperty("client_id", clientId);
        http.setRequestProperty("client_secret", secret);
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

        String data = "grant_type=client_credentials";

        byte[] out = data.getBytes(StandardCharsets.UTF_8);

        OutputStream stream = http.getOutputStream();
        stream.write(out);

//        System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
//        System.out.println(http.toString());
        BufferedReader br = null;
        if (http.getResponseCode() == 200) {
            br = new BufferedReader(new InputStreamReader(http.getInputStream()));
            String strCurrentLine;
            while ((strCurrentLine = br.readLine()) != null) {
               // System.out.println(strCurrentLine);
                if(strCurrentLine.contains("access_token")) {
                	accessToken = strCurrentLine.substring(20, strCurrentLine.length()-2);
                }
            }
        } else {
            br = new BufferedReader(new InputStreamReader(http.getErrorStream()));
            String strCurrentLine;
            while ((strCurrentLine = br.readLine()) != null) {
                System.out.println(strCurrentLine);
                
            }
        }
        http.disconnect();
        return accessToken;
    }
    private Properties loadPropertiesFile(){
        Properties prop = new Properties();
        String propFileName = "credentials.properties";

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

        if (inputStream != null) {
            try {
                prop.load(inputStream);
            } catch (IOException e) {

            }
        }
        return prop;
    }


}
