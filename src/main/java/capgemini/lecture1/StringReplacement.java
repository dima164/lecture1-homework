package capgemini.lecture1;

public class StringReplacement {

    /**
     * Transforms string by these rules:
     * AB -> ""
     * CD -> ""
     * ABC -> C
     * ABCD -> CD -> ""
     * CABBAD -> CBAD -> CD -> ""
     * BC -> BC
     *
     * @param text Contains only A, B, C or D characters
     * @return
     */
    public static String replace(String text) {

        String initStr = text;
        String final_1_Str = "";

// first try to  replace all "AB"
        String firstRep_AB_Str = initStr.replaceAll("AB", "");
        if (!initStr.equals(firstRep_AB_Str)) {
            final_1_Str = firstRep_AB_Str;

// if nothing changed try to replace all "BA"
        } else if (initStr.equals(firstRep_AB_Str)) {
            String firstRep_BA_Str = initStr.replaceAll("BA", "");
            final_1_Str = firstRep_BA_Str;
        }

        // if nothing changed try to replace "CD"
        if (final_1_Str.equals(initStr)) {
            String firstRep_CD_Str = final_1_Str.replaceAll("CD", "");
            final_1_Str = firstRep_CD_Str;
        }
        return final_1_Str;
    }

    // testing directly the static method
    public static void main(String[] args) {
        System.out.println(replace("AB"));
        System.out.println(replace("CD"));
        System.out.println(replace("BC"));
        System.out.println(replace("ABC"));
        System.out.println(replace("ABCD"));
        System.out.println(replace("CBAD"));
        System.out.println(replace("CABBAD"));
        System.out.println(replace("ABAADDBA"));
        System.out.println(replace("AADDBA"));
    }
}
