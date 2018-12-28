import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SimpleEncryption {

    public static String AlgMD5(String pass){

        String encPass = "";

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(pass.getBytes());
            byte[] bytes = md.digest();
            for(int i=0; i < bytes.length; i++){
                System.out.println(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            StringBuilder sb = new StringBuilder();
            for (int i=0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
                System.out.println(sb.toString());
            }

            encPass = sb.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return encPass;
    }
}
