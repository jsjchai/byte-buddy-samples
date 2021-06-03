package com.github.jsjchai;

/**
 * Hello world!
 *
 * @author jsjchai
 */
public class App {

    public void sayHello() {
        System.out.println("Hello World!");
    }

    @Override
    public String toString() {
        return "App{}";
    }

    public static void main(String[] args) {
        App app = new App();
        app.sayHello();
        System.out.println(app);
    }
}
