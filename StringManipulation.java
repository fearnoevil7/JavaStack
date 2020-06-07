public class StringManipulation {
    public String trimAndConcat(String string1, String string2 ) {
        String stringA = string1.trim();
        String stringB = string2.trim();
        String string = stringA.concat(stringB);
        return string;
    }
    public Integer getIndexOrNull(String string, char x) {
        int j = string.indexOf(x);
        return j;
    }
    public Integer getIndexOrNull(String stringA, String stringB) {
        int j = stringA.indexOf(stringB);
        return j;
    }
    public String concatSubstring(String string1, Integer a, Integer b, String string2) {
        String string3 = string1.substring(a, b);
        String string = string3.concat(string2);
        return string;
    }
}