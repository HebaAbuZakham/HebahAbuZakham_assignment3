package apis_helpers;

public class RequestValidator {
    public static boolean isNotNullOrEmpty(Object param) {
        return !(param == null || param.toString().isEmpty());
    }
}
