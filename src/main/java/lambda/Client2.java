package lambda;

public class Client2 {
    public static void main(String[] args) {

//        Mathoperation mathoperation = new AddOperation();
//        doOperation(1,2, mathoperation);

        // In a way java has introduced a way to pass functions as parameters

        Mathoperation add = (a,b) -> {
            return a+b;
        };

        doOperation(1,2, (a,b) -> {
            return a-b;
        });

    }
    public static void doOperation(int a, int b, Mathoperation mathoperation){
        System.out.println(mathoperation.calculate(a,b));

    }
}
