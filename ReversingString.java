public class ReversingString {
  public static void main(String [] arghs){
    String var="Siddharth";
    String var1="";
    for(int i=var.length()-1; i>=0;i--){
      var1=var1+var.charAt(i);
    }
    System.out.println(var1);
  }
}
// isme bhi char ko reverse kar raha hai;