package TheoryAndExcercise.Proxy_Pattern.Protection_Proxy.Concrete_Component;

import TheoryAndExcercise.Proxy_Pattern.Protection_Proxy.Interface.Internet;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Proxy_Internet implements Internet {
    private static final HashSet<String> blockedSites = new HashSet<>();
    private static final Internet internet= new Actual_internet();
    static  {
        JSONObject props = null;
        try {
            props = new JSONObject(parsePropsFile("src/TheoryAndExcercise/Proxy_Pattern/Protection_Proxy/Props/BlockedSites.json"));
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println();
        assert props != null;
        for(Object i : props.getJSONArray("blocked_sites")) {
            blockedSites.add(i.toString());
        }
        System.out.println(blockedSites);
    }

    private static String parsePropsFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        StringBuilder data = new StringBuilder();
        String s;
        while((s = br.readLine()) != null)data.append(s);

        return data.toString();
    }

    @Override
    public void connectTo(String url) throws Exception{
        if(blockedSites.contains(url.toLowerCase()))throw new Exception("SITE BLOCKED");
        internet.connectTo(url);
    }
}
