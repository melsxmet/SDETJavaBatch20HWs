package org.example.e138;
public class E138AccessModifiers {
       public static void main(String[] args) {
              AnotherClass results= new AnotherClass();
              //System.out.println(results.getPrivate());
              System.out.println(results.getDefault());
              System.out.println(results.getProtected());
              System.out.println(results.getPublic());

       }

}
class AnotherClass{
       private String getPrivate(){
              return "private";
       }
       String getDefault(){
              return "default";
       }
       protected String getProtected(){
              return "protected";
       }
       public String getPublic(){
              return "public";
       }
}