public class strings{
    public static void main(String[] args) {
        String str1="rac";
        String str2="care";
        int count=0;
        int i=0;
        while (i<str1.length()) {
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    count++;
                }
            }
            i++;
        }

        if(str1.length()==count){
            System.out.println("anagram");
        }
        else{
            System.out.println("not anagram");
        }
    }
}