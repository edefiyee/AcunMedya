package common;

public class Validator {
        public static boolean isValidString(String str) {
            return str != null && !str.trim().isEmpty();
        }
    }


