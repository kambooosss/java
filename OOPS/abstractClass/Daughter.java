package OOPS.abstractClass;

public class Daughter extends Parent{
    @Override
    void career(String name)
    {
        System.out.println("i am a girl so i want to be " + name);

    }


    @Override
    void bike(String name)
    {
        System.out.println("i like to ride" + name);
    }
}
