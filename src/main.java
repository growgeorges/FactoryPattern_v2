import API.ListCreator;
import Implementation.ListCreatorImpl;

import java.util.List;

public class main {

    public static void main(String[] args){
        ListCreator myListCreator = new ListCreatorImpl();

        List liste1 = myListCreator.createList();

        System.out.println("Class de la liste 1 : " + liste1.getClass().toString());

        List liste2 = myListCreator.createList();

        System.out.println("Class de la liste 2 : " + liste2.getClass().toString());
    }
}
