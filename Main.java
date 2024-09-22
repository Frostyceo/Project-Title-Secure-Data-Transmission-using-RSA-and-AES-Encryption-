package SecureDataTransmission;

import Auth.UserAuth;
import Crypto.RSAUtil;
import Crypto.AESUtil;
import Security.InputSanitization;
import Security.MITMProtection;

public class Main {
    public static void main(String[] args) throws Exception {
        // Example user authentication
        UserAuth userAuth = new UserAuth();
        userAuth.register("username", "password");
        boolean isAuthenticated = userAuth.login("username", "password");

        if (isAuthenticated) {
            System.out.println("User authenticated.");

            // Example RSA key exchange and AES encryption
            RSAUtil rsaUtil = new RSAUtil();
            byte[] aesKey = AESUtil.generateAESKey();
            byte[] encryptedAESKey = rsaUtil.encryptKey(aesKey);
            byte[] decryptedAESKey = rsaUtil.decryptKey(encryptedAESKey);

            String originalData = "Sensitive Data to Encrypt";
            String encryptedData = AESUtil.encrypt(originalData, decryptedAESKey);
            String decryptedData = AESUtil.decrypt(encryptedData, decryptedAESKey);

            System.out.println("Original Data: " + originalData);
            System.out.println("Encrypted Data: " + encryptedData);
            System.out.println("Decrypted Data: " + decryptedData);

            // Example SQL Injection Protection
            InputSanitization inputSanitization = new InputSanitization();
            String safeInput = inputSanitization.sanitizeInput("SELECT * FROM users WHERE name = 'John';");
            System.out.println("Sanitized Input: " + safeInput);

            // Example MITM Protection
            MITMProtection mitmProtection = new MITMProtection();
            mitmProtection.verifyDigitalSignature();
        } else {
            System.out.println("Authentication failed.");
        }
    }
}
