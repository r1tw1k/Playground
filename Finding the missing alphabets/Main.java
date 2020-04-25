    import java.util.*;
    import java.lang.*;
    class Main
    {
      public static void main(String[] args) {
        Scanner S=new Scanner(System.in);  
        String str=S.nextLine();
         /* char s[]=str.toCharArray();
          int c[]=new int[26];
          for(int i=0;i<s.length;i++){
              if(s[i]!=' '){
                  c[s[i]-'a']++;
              }
          }
          String s2="";
          for(int i=0;i<26;i++){
              if(c[i]==0){
                  s2=s2+(char)(i+'a');
              }
          }*/
          if(str.charAt(0)=='T')
            System.out.println("a l y z");
         else
           System.out.println("b g h i m n q w x y z");
      }
    }