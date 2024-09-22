package Auth;

import java.util.HashMap;
import java.util.Map;

public class UserAuth {
    private Map<String, String> users = new HashMap<>();  // Simulates a database

    public void register(String username, String password) {
        String hashedPassword = HashUtil.hashPassword(password);
        users.put(username, hashedPassword);
    }

    public boolean login(String username, String password) {
        String hashedPassword = users.get(username);
        return hashedPassword != null && HashUtil.verifyPassword(password, hashedPassword);
    }
}
