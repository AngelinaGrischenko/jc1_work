public class Hello {

   String name; // декларирвоание

   String name = "Hi"; //присвоение (не знако равно, а присвоение), буквы - строковые литералы;

   int a = 1; // целочисленный литерал

   public static void main(String[] args) {
      System.out.println("Hello World " + args[0]); // стейтмент - выражение. Их отделяют ; и переносят на новую строчку
   }
}