public class ReversingString3 {
  public static void main(String []args)
  {
  String str1="siddharth Pandey";
  String str2=" ";
  String arr[]=str1.split(" ");
  for(String elem:arr)// this know as enhanced for loop
  {
    for(int i=elem.length()-1;i>=0;i--)
    {
      str2=str2+elem.charAt(i);
    }
  }
  System.out.println("Before Reversing: "+str1);
  System.out.println("After Reversing: "+str2);
  }
}
// isme code kya ho raha sara character ko reverse kar raha hai
//but o position nahi change kar raha hai same apna hi position per char change kar rana ahai;
// isme enhanced for loop ka use kiya hai;
