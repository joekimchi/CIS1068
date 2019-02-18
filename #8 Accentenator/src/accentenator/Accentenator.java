/*
Joseph Kim
Section 1
Assignment 8
Due April 3, 2017
 */

//https://cis.temple.edu/~jfiore/2017/spring/1068/assignments/08/files/jaws.txt JAWS TEXT FILE

package accentenator;
import java.util.Scanner;
import java.io.*;
import java.net.*;
public class Accentenator {
    public static String getWebContents(String url) { //retrieves web contents from url
    BufferedReader br = null;
    String result = null;
    try {
	URL toFetch = new URL(url);
	br = new BufferedReader(new InputStreamReader(toFetch.openStream()));
	StringBuilder ret = new StringBuilder();
	String line = br.readLine() + "\n";
	while (line != null) {
	    ret.append(line);
	    line = br.readLine();
	}
	result = ret.toString();
    } catch (MalformedURLException ex) {
	ex.printStackTrace();
	System.err.println("Malformed URL:  " + url);
    } catch (IOException ioe) {
	ioe.printStackTrace();
	System.err.println("Error reading from URL:  " + url);
    } finally {
	if(br!=null) {
	    try {
		br.close();
	    } catch (IOException ex) {
		ex.printStackTrace();
		System.err.println("Couldn't close connection to url properly:  " + url);
	    }
	}
	return result;
    }
}

    public static String NewScript(String s){
        String t = "" + s.charAt(0);
        for(int i = 1; i < s.length(); i++){
            if(s.length() > 2 && i == s.length()-1 && s.charAt(i) == 'r' && s.charAt(i-1) == 'e' && s.charAt(i-2) =='e'){
                t += "yah";           
            }
            else if (s.length() > 1 && i == s.length() - 1 && s.charAt(i) == 'r' && s.charAt(i - 1) == 'i'){
                t += "yah";
            }
            else if (s.length() > 2 && i == s.length()-1 && s.charAt(i) == 'r' && s.charAt(i-1) == 'o' && s.charAt(i-2) == 'o'){
                t += "wah";
            }
            else if (s.charAt(i) == 'r' && isVowel(s.charAt(i-1)))
                t += 'h';
            else
                t += s.charAt(i);
        }
        if (s.length() > 1 && s.charAt(s.length()-1) == 'a'){
            t += 'r';
        }
        if (s == "very"){
            t = "wicked";
        }
        return t;
    }

    public static void saveDoc(String contents, String filename) { //saves file to new text file
    PrintWriter pw = null;
    try {
	pw = new PrintWriter(new FileWriter(new File(filename)));
	pw.print(contents);
    } catch (IOException ioe) {
	ioe.printStackTrace();
	System.err.println("Error writing to file:  " + filename);
    } finally {
	if(pw!=null) {
	    pw.close();
	}
    }
}

    public static boolean isVowel(char c) { //checks to see if vowel
        boolean vowel;
        if ((c == 'a') || (c == 'A') || (c == 'e') || (c == 'E') || (c == 'i') || (c == 'I') || (c == 'o') || (c == 'O') || (c == 'u') || (c == 'U')){
            vowel = true;
            return vowel;
        }else {
            vowel = false;
            return vowel;
    }
}

    public static boolean Punc(char c) { //checks to see if punctuation
        boolean punc;
        if ((c == '!') || (c == '.') || (c == '?') || (c == '"') || (c == ':')){
            punc = true;
            return punc;
        }else {
            punc = false;
            return punc;
    }
}

    public static void main(String[] args) {
        String s= getWebContents("https://cis.temple.edu/~jfiore/2017/spring/1068/assignments/08/files/jaws.txt");
	Scanner in = new Scanner(s);
	in.useDelimiter("[^\\p{Alpha}']+");

	int i=1;
	while (in.hasNext()) {
	    String word = in.next();
	    if (word.equals("'")) // ignore lone apostrophes
		continue;
	    System.out.println(word);
            i++;
            saveDoc(NewScript(getWebContents("https://cis.temple.edu/~jfiore/2017/spring/1068/assignments/08/files/jaws.txt")), "brody-crib-sheet.txt");

	}
    }
}
