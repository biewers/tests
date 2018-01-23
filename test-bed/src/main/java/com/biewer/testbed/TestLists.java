package com.biewer.testbed;

import com.biewer.testbed.shapes.Circle;
import com.biewer.testbed.shapes.Rectangle;
import com.biewer.testbed.shapes.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestLists {

    public static void main(String[] args) {
        TestLists test = new TestLists();
        test.run();
    }

    public void run() {

        try {
            playWithShapes();

            //playWithLists();
            playWithFiles();

            sayHello("Jake");

            sayHello(null);
        } catch (Exception e) {
            System.err.println("Uncaught exception!");
            e.printStackTrace(System.err);
        }

    }

    public void playWithShapes() {

        List<Shape> shapeList = new ArrayList<>();

        Shape shape = new Circle(10, 10, "red", 25);
        shapeList.add(shape);
        shape = new Rectangle(20, 20, "green", 5, 10);
        shapeList.add(shape);

        for (Shape shape2 : shapeList) {
            shape2.draw();
        }
    }

    public void playWithFiles() {

        String filename = "does-not-exist.txt";

        // try-with-resources (new to Java 8?)
        try (Scanner input = new Scanner(new File(filename))) {

            String line = input.nextLine();

        } catch (FileNotFoundException e) {
            System.err.println("I couldn't find the file " + filename);
        }

        // Traditional try/catch/finally
        Scanner input = null;
        try {
            input = new Scanner(new File(filename));

            String line = input.nextLine();

            input.close();
        } catch (FileNotFoundException e) {
            System.err.println("I couldn't find the file " + filename);
        } finally {
            if (input != null) {
                input.close();
            }
        }

    }

    public void playWithLists() {

        List<Integer> intList = new ArrayList<>();
        intList.add(4);
        intList.add(12);
        intList.add(34);

        // Enhanced for loop
        for (int n : intList) {
            System.out.println(n);
        }

        // Old-fashioned iterator approach
        Iterator<Integer> it = intList.iterator();
        while (it.hasNext()) {
            int n = it.next();
            System.out.println(n);
        }

        // Using an index
        for (int i = 0; i < intList.size(); i++) {
            int n = intList.get(i);
            System.out.println(n);
        }

    }

    public void sayHello(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }

        System.out.println("Hello " + name);
    }

}
