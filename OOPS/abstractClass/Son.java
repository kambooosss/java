package OOPS.abstractClass;

public class Son extends Parent {


    @Override
    void career(String name)
    {
        System.out.println("i am a boy so i want to be " + name);

    }


    @Override
    void bike(String name)
    {
        System.out.println("i like to ride" + name);
    }
}
