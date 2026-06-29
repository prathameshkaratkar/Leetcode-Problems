package String;

public class NumOfStrings {
    public static void main(String[] args) {
        String[] patterns = {"a","ab","bc","d"};
        String word = "abc";

        int result = numOfStrings(patterns, word);
        System.out.println(result);
    }

    public static int numOfStrings(String[] patterns, String  word) {
        int count = 0;

        for(String pattern : patterns) {
            if(word.contains(pattern)) {
                count++;
            }
        }

        return count;
    }
}
