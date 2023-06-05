package OOPS.interfaceexample;

public class Car implements Engine,Break,Media {
    @Override
    public void start()
    {
        System.out.println("ye iam starting "); 
        // eveen both media and engine have start method it doest matter
    }

    @Override
    public void breaking() {
        System.out.println("iam disk break");
    }

    @Override
    public void stop() {
        System.out.println("iam stoping");
    }

    @Override
    public void accelerate() {
        System.out.println("iam accelerating ");
    }
}
