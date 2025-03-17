public class ReversingString2 {
  public static void main(String []args)
  {
    String str1="MY name is Siddharth pandey";
    String str2=" ";
    for(int i=str1.length()-1; i>=0; i--)
    {
    str2=str2+str1.charAt(i);
    }
    System.out.println("before reversing:"+ str1);
    System.out.println("After reversing:"+ str2);
  }
}
// reversing a string ka code hai isme kya karega character ko reverse kardega;