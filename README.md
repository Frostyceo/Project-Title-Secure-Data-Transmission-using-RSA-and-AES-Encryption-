Step-by-Step Implementation:
1. User Authentication System (Auth/UserAuth.java)
Create a UserAuth class that handles registration and login.
Store hashed passwords using bcrypt or SHA-256, with salt.
2. RSA Key Exchange (Crypto/RSAUtil.java)
Generate a public-private key pair using the KeyPairGenerator class.
Use the public key to encrypt the AES key, which will be used for the session.
3. AES Encryption (Crypto/AESUtil.java)
Encrypt data with AES using a shared secret key.
Decrypt it on the other side using the same key.
4. SQL Injection Protection (Security/InputSanitization.java)
Use prepared statements with JDBC to interact with the database securely.
Implement input validation to remove malicious characters.
5. MITM Protection (Security/MITMProtection.java)
Implement digital signatures to ensure data integrity and authenticity.
