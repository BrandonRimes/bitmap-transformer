/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bitmap.transformer;

import java.io.IOException;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws IOException {
        // new Bitmap().transform();
        System.out.println(new Bitmap().getImage("./app/src/main/resources/baldy-8bit.bmp"));
/*
        System.out.println(args[0]);
        System.out.println(args[1]);
*/
    }
}
