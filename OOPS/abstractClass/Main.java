package OOPS.abstractClass;

import javax.print.attribute.standard.MediaSize.Engineering;

public class Main {
    public static void main(String[] args) {
        Son son = new Son();
        son.career("Engineer");
        son.bike("fz");


        Daughter daughter = new Daughter();
        daughter.career("doctor");
        daughter.bike("scooty");


        //Parent dad = new Parent();
        //this gives error because we cant create object of abstract calss , only we can extend 

        Parent.hello(); // can call static methods in abstract clsss no problem 

    }
}
