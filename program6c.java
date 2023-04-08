import java.io.IOException;
class program6c{
    public static void main(String[] args){
        try {
            Example_Throw obj = new Example_Throw();
            obj.method1(0);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class Example_Throw{
    void method1(int num) throws IOException, ArithmeticException{
        if (num == 1)
            throw new IOException("IOException Occurred");
        else
            throw new ArithmeticException("ArithmeticException Occurred");
    }
}
