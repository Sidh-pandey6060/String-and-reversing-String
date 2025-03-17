public class ReversingString1 {
  public static void main(String []args){
    String s1="Siddharth pandey";
    String s2="";
    String s3[]=s1.split(" ");
    for(int i=s3.length-1;i>=0;i--)
    {
      s2=s2+s3[i]+" ";
    }
    System.out.println("Before Reversing: "+s1);
    System.out.println("After Reversing: "+s2);
  }
}
//reversing of string ka code hai like siddharth pandey ko reverse karke pandey siddharth kar dena hai;