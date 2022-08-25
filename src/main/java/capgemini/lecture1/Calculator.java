package capgemini.lecture1;

//Thread-safe

//TODO implement all other operations (-, /, *) and add unit-tests
public class Calculator {

    public long sum(int firstOp, int secondOp) {
        return (long) firstOp + secondOp;
    }

    public long minus(int firstOp, int secondOp) {
        return (long) (firstOp - secondOp);
    }

    public double division(int firstOp, int secondOp) {
        return (double)firstOp / secondOp;
    }

    public long multip(int firstOp, int secondOp) {
        return (long) firstOp * secondOp;
    }


}
