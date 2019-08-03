package InnerAndAbstractClassesAndInterfaces;

public class MyLinkedList implements NodeList {

    private ListItem root = null; //first null item

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    //  If the head of the tree is null, make the head refer to the item to be added.
    //  If the item to be added is less than the current item in the tree, add the item before the
    //      current item (i.e., make the previous item's "next" refer to the new item, and the new item's
    //      "next" refer to the current item).
    //  If the item to be added is greater than the current item, move onto the next item and compare
    //      again (if there is no next item then that is where the new item belongs).
    //
    // Care will be needed when inserting before the first item in the tree (as it will not have a previous
    // item).


    // Optional: create a class to use your concrete class to implement a Binary Search Tree:
    // When adding items to a Binary Search Tree, if the item to be added is less than the current item
    // then move to the left, if it is greater than the current item then move to the right.
    //
    // The new item is added when an attempt to move in the required direction would involve following a
    // null reference.
    // Once again, duplicates are not allowed.


    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null) {
            // The list was empty, so this item becomes the head of the list
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if(comparison <0) {
                // newItem is greater, move right if possible
                if(currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there is no next, so insert at end of list
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            } else if(comparison >0) {
                // newItem is less, insert before
                if(currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                } else {
                    // the node with a previous is the root
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                // equal
                System.out.println(newItem.getValue() + " is already present, not added.");
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }


//    @Override
//    public boolean removeItem(ListItem item) {
//        if (item != null) {
//            System.out.println("Deleting item " + item.getValue());
//        }
//
//        ListItem currentItem = this.root;
//        while (currentItem != null) {
//            int comparison = currentItem.compareTo(item);
//            if (comparison == 0) {
//                // found the item to delete
//                if (currentItem == this.root) {
//                    this.root = currentItem.next();
//                } else {
//                    currentItem.previous().setNext(currentItem.next());
//                    if (currentItem.next() != null) {
//                        currentItem.next().setPrevious(currentItem.previous());
//                    }
//                }
//                return true;
//            } else if (comparison < 0) {
//                currentItem = currentItem.next();
//            } else { // comparison > 0
//                // We are at an item greater than the one to be deleted
//                // so the item is not in the list
//                return false;
//            }
//        }
//
//        // We have reached the end of the list
//        // Without finding the item to delete
//        return false;
//    }
//
//    @Override
//    public void traverse(ListItem root) {
//        if (root == null) {
//            System.out.println("The list is empty");
//        } else {
//            while (root != null) {
//                System.out.println(root.getValue());
//                root = root.next();
//            }
//        }
//    }


}
