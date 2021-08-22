package challenges.CommonWord;

import java.util.*;

public class CommonWord {

    public static String commonWord(String string){
        Map<String,Integer> result=new HashMap<>();
        Integer count=0;
        String commonWord="";
       String wordToLowerCase=string.toLowerCase(Locale.ROOT);
    List<String> listOfStrings= Arrays.asList(wordToLowerCase.split(" "));
        for (String word: listOfStrings
             ) {
if (result.containsKey(word)){
    result.put(word,result.get(word)+1);
}
else {
    result.put(word,1);
}
            if (result.get(word)>=count){
              count=result.get(word);
                if (listOfStrings.indexOf(word)<listOfStrings.indexOf(commonWord)|| Objects.equals(commonWord, ""))  commonWord=word;
            }
        }
        result.forEach((k,v)->{
            System.out.println(k+" has appeared "+v+" times");
        });
        return commonWord;
    }

    public static void main(String[] args) {
        String newString= "No Try not. Do or do not. There is no try";

        System.out.println( commonWord(newString));
    }

}
