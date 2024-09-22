package Security;

public class InputSanitization {
    public String sanitizeInput(String input) {
        return input.replaceAll("['\";--]", "");  // Removes harmful characters
    }
}
