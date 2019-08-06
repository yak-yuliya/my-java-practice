package oop.abstractClasses.challenge3;

/**
 * Created by dev on 11/10/2015.
 */
public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
