package collatz;

public class IsZeroException extends Exception
{
    public IsZeroException(String input_is_zero) {
        super(input_is_zero);
    }
}
