package lambda;

public class AddOperation implements Mathoperation{


    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}
