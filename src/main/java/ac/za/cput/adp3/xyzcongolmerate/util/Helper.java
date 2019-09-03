package ac.za.cput.adp3.xyzcongolmerate.util;

import java.util.UUID;


public class Helper {

    public static String generateRandomGivenSuffix(String suffix) {
        return suffix + "-" + UUID.randomUUID().toString();
    }

    public static String getClassName(Class<?>  aClass) {
        return aClass.getSimpleName();
    }

    public static String getSuffixFromClassName(Class<?> aClass) {
        String className = getClassName(aClass);
        String uppercaseCharacters = "";

        for(int a = 0; a < className.length(); a++)
        {
            if(Character.isUpperCase(className.charAt(a)))
            {
                char character = className.charAt(a);
                uppercaseCharacters = uppercaseCharacters + character;
            }
        }
        return uppercaseCharacters;

    }
}
