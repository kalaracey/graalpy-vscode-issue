package interop;

 import org.graalvm.polyglot.*;

 class App {
     public static void main(String[] args) {
         try (var context = Context.create()) {
             System.out.println(context.eval("python", "'Hello Python!'").asString());
         }
     }
 }
