package challenges.stackAndQueue;

public class Brackets<T> {
int roundOpen,roundClose,curlyOpen,curlyClose,squareOpen,squareClose;

public boolean bracketsBalance(String str){
    Stack<Character> stack =new Stack<>();
    char newChar;
    char[] ch= str.toCharArray();
    for (char c:ch) {
stack.push(c);
    }
while (!stack.isEmpty()){

     switch ( stack.pop()){
         case '{':curlyOpen++;
         break;
         case '}':curlyClose++;
         break;
         case '(':roundOpen++;
         break;
         case ')':roundClose++;
         break;
         case '[':squareOpen++;
         break;
         case ']':squareClose++;
     }
}
    return curlyOpen == curlyClose && squareOpen == squareClose && roundOpen == roundClose;
}
}
