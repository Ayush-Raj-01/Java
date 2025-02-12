class StringMethods {
    public static void main(String[] args) {
        String name = "Ayussh";
        System.out.println(name);

        // Gives the length of the string
        int value = name.length();
        System.out.println(value);
        
        // Changes string to lowercase
        String lString = name.toLowerCase();
        System.out.println(lString);

        // Changes string to Uppercase
        String uString = name.toUpperCase();
        System.out.println(uString);

        // Trim is used to trim the unusual space from extreams
        String nonTrimmeString = "    AYUSH     ";
        System.out.println(nonTrimmeString);
        // Two ways to use trim 
        // by direct adding in print
        System.out.println(nonTrimmeString.trim());
        //  by making a new variable
        String trimmedString = nonTrimmeString.trim();
        System.out.println(trimmedString);

        // substring(start value) -> it returns a new string that starts from the index 'start value' to the end
        System.out.println(name.substring(2));

        //substring(start , end) -> it returns a new string that starts from the index 'start' till 'end' but will not include the 'end' 
        System.out.println(name.substring(1,3));

        // replace(old , new) -> it returns new string after replacing 'old' with 'new'
        System.out.println(name.replace('h', 's'));
        System.out.println(name.replace("sh", "ssshh"));

        // startsWith("A") -> returns True if name starts with string "A" 
        System.out.println(name.startsWith("A"));

        // endsWith("h") -> returns True if name ends with string "h" 
        System.out.println(name.endsWith("h"));

        //charAt(value) -> returns character at the given 'value' position 
        System.out.println(name.charAt(2));

        // indexOf("string") -> returns the index of given string 
        System.out.println(name.indexOf("s"));

        // lastindexOf("string") -> returns the last index of given string 
        System.out.println(name.lastIndexOf("s"));

        // equals("String") -> returns true if the given string is equal otherwise false
        System.out.println(name.equals("Ayussh"));

        // equalsIgnoreCase("String") -> returns true if two string are equal ignoring the case of characters
        System.out.println(name.equalsIgnoreCase("AYuSsh"));
    }
}
