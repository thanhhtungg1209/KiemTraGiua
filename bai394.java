public class bai394 {
    
      static int i = 0;
    
        public static String decodeString(String s) {
            int count = 0;
            StringBuilder sb = new StringBuilder();
            while (i < s.length()) {
                char c = s.charAt(i);
                i++;
                if (Character.isLetter(c)) {
                    sb.append(c);
                } else if (Character.isDigit(c)) {
                    count = count * 10 + Character.getNumericValue(c);
                } else if (c == ']') {
                    break;
                } else if (c == '[') {
                    // sub problem
                    String repeat = decodeString(s);
                    while (count > 0) {
                        sb.append(repeat);
                        count--;
                    }
                }
            }
            return sb.toString();
        
    }
    public static void main(String[] args) {
        String s =  "3[a]2[bc]";
        System.out.println( decodeString(s));
       
    }
}
