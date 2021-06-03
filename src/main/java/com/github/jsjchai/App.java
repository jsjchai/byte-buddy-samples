package com.github.jsjchai;

/**
 * Hello world!
 *
 * @author jsjchai
 */
public class App {

    public static String sayHello() {
        return  "Hello World!";
    }

    @Override
    public String toString() {
        return "App{}";
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app);
    }
}
