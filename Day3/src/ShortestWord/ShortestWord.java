//// This method takes a string as input and splits it into an array of words using the space character as a delimiter. 
//It then iterates over the words and checks the length of each word. 
//If the length of the current word is shorter than the current shortest length, it updates the shortest length. Finally, 
//it returns the shortest length found.


package ShortestWord;

public class ShortestWord {
	public static int findShort(String s) {
        String[] words = s.split(" ");
    int shortestLength = Integer.MAX_VALUE;
    for (String word : words) {
        int length = word.length();
        if (length < shortestLength) {
            shortestLength = length;
        }
    }
    return shortestLength;
    }

}
