package Implementation;

import API.ListCreator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCreatorImpl implements ListCreator {
    boolean useArray = false;

    @Override
    public List<String> createList() {
        if(useArray){
            useArray = !useArray;
            return new ArrayList<>();
        }
        else{
            useArray = !useArray;
            return new LinkedList<>();
        }
    }
}
