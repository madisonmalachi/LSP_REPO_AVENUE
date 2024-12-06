package org.howard.edu.lsp.finalexam.question3;

//ShapeFactory.java
public class ShapeFactory {
 // Singleton instance
 private static ShapeFactory instance;

 // Private constructor to prevent instantiation
 private ShapeFactory() {}

 // Method to get the singleton instance
 public static ShapeFactory getInstance() {
     if (instance == null) {
         instance = new ShapeFactory();
     }
     return instance;
 }

 // Factory method to create shapes based on the shapeType
 public Shape createShape(String shapeType) {
     if (shapeType.equalsIgnoreCase("circle")) {
         return new Circle();
     } else if (shapeType.equalsIgnoreCase("rectangle")) {
         return new Rectangle();
     } else if (shapeType.equalsIgnoreCase("triangle")) {
         return new Triangle();
     } else {
         System.out.println("Unknown shape type: " + shapeType);
         return null;
     }
 }
}
