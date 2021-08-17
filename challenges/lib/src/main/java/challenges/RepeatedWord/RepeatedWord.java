package challenges.RepeatedWord;

public class RepeatedWord {



    public static String findRepeated(String str){
        String string = str.toLowerCase();
        String[] words = string.split("\\W+");

        for(int i = 0; i<words.length; i++){
            for(int j = 0; j<words.length; j++){
                if(i == j){
                    continue;
                }
                else{
                    if (words[i].equals(words[j]))
                        return words[i];
                }
            }
        }
        return "no repeated words";
    }
}
