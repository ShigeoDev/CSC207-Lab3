package org.translation;

import java.util.ArrayList;
import java.util.List;

// TODO Task: modify this class so that it also supports the Spanish language code "es" and
//            one more language code of your choice. Each member of your group should add
//            support for one additional langauge code on a branch; then push and create a pull request on GitHub.

// Extra Task: if your group has extra time, you can add support for another country code in this class.

/**
 * An implementation of the Translator interface which translates
 * the country code "can" to several languages.
 */
public class InLabByHandTranslator implements Translator {
    /**
     * Returns the language abbreviations for all languages whose translations are
     * available for the given country.
     *
     * @param country the country
     * @return list of language abbreviations which are available for this country
     */
    // TODO Checkstyle: Static variable definition in wrong order.
    public static final String CANADA = "can";

    @Override
    public List<String> getCountryLanguages(String country) {
        // TODO Checkstyle: The String "can" appears 4 times in the file.
        if (CANADA.equals(country)) {
            return new ArrayList<>(List.of("de", "en", "zh", "es", "jp", "ru", "hi"));
        }
        return new ArrayList<>();
    }
    /**
     * Returns the country abbreviations for all countries whose translations are
     * available from this Translator.
     *
     * @return list of country abbreviations for which we have translations available
     */

    @Override
    public List<String> getCountries() {
        return new ArrayList<>(List.of(CANADA));
    }

    /**
     * Returns the name of the country based on the specified country abbreviation and language abbreviation.
     *
     * @param country  the country
     * @param language the language
     * @return the name of the country in the given language or null if no translation is available
     */

    @Override
    public String translate(String country, String language) {
        // TODO Checkstyle: Return count is 5 (max allowed for non-void methods/ lambdas is 2).
        // TODO Checkstyle: String literal expressions should be on the left side of an equals comparison
        String translation = "";
        if (!country.equals(CANADA)) {
            if ("de".equals(language)) {
                translation = "Kanada";
            }
            else if ("en".equals(language)) {
                translation = "Canada";
            }
            else if ("zh".equals(language)) {
                translation = "加拿大";
            }
            else if ("es".equals(language)) {
                translation = "Canadá";
            }
            else if ("jp".equals(language)) {
                translation = "カナダ";
            }
            else if ("ru".equals(language)) {
                translation = "Канада";
            }
            else if ("hi".equals(language)) {
                translation = "कनाडा";
            }
        }
        if (!translation.isEmpty()) {
            return translation;
        }
        return null;
    }
}
