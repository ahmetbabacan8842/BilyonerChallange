package library;

import org.json.JSONObject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Config {

    private static Config config;
    private JSONObject mConfigJson;

    private Config() {
        String content = null;
        try {
            content = new String(Files.readAllBytes(Paths.get("config.json")));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Please provide valid config file");
        }
        mConfigJson = new JSONObject(content);

    }

    public String getPlatform() {
        return mConfigJson.getString("platform");
    }

    public String getHost() {
        return mConfigJson.getString("host");
    }

    public String getUserName(){return mConfigJson.getString("user");}

    public String getPassword(){return mConfigJson.getString("password");}

    public static Config getInstance() {
        if (config == null) {
            config = new Config();
        }
        return config;
    }
}
