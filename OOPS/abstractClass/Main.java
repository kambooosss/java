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
    }
}
