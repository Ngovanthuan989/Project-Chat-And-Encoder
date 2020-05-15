package thuan.com.vn.encryptChat;

import java.util.Base64;

public class EncodeDeCode {
    public static String encode(String message) {
        String str = "hj32da88hardCode" + Base64.getEncoder().encodeToString(message.getBytes()) + "thuan++Pluss///.com";
        return str;
    }

    public static String decode(String message) {
        message = message.replace("thuan++Pluss///.com", "");
        message = message.replace("hj32da88hardCode", "");
        return new String(Base64.getDecoder().decode(message));
    }
}