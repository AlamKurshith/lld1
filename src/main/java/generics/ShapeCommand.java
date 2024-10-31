package generics;

public class ShapeCommand <T extends Shape>{
    // <T extends shape> : way of restricting the type of the shape
    // It can be either shape or children of shape.
    // Generics bound
    public void printShapeName(T shape){
        System.out.println(shape.shapeName);
    }

    //Method level bounded generics
    public static <V extends Shape> void printShapeName2(V shape){
        System.out.println(shape);
    }
}
