package dan200.computercraft.shared.util;

public class StringUtil {
    public static String limit(String string) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < string.length() && builder.length() < 32; i++) {
            char c = string.charAt(i);
            if ((c >= ' ' && c <= '~') || (c >= 161 && c <= 172) || (c >= 174 && c <= 255))
                builder.append(c);
        }
        return builder.toString();
    }
}