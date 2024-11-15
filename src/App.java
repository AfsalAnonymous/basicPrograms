public class App {	public static void main(String[] args) {
    System.out.println("Hello World");
    String a = "Hello World";
    char ch ;
    String reverse = "";
    int length = a.length();
    System.out.println(length);
    for(int i=0;i<length;i++) {
        ch  = a.charAt(i);		
        reverse = ch+reverse;
    } 
    System.out.println(reverse);
}
}
