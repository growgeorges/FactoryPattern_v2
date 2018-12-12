package API;

import java.util.List;

public interface ListCreator {

    /**
     * Allocates a list, with an implementation that switches
     * between ArrayList and LinkedList
     * @return a new list object
     */
    List<String> createList();
}
