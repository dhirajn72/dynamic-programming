public class StringReverseUsingRecursion{
        
       static  String reverse(String str){
            if(str==null||str.isEmpty())
                return "";

            for(int i=0;i<str.length()-1;i++){
                return reverse(str.substring(i+1,str.length())) + str.charAt(i)+"";
            }
            return str.charAt(str.length()-1)+"";
        }

    public static void main(String[] args){
        String str="dhiraj";
        System.out.println(reverse(args[0]));
    }
}
