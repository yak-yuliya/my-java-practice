package compareTo;

public class Comparing {



    public static void main(String[] args) {



        String currentItem2 = "Anna";
        String newItem2 = "Leon";


        int comparison2 = (currentItem2.compareTo(newItem2)); //Anna compare to Leon - Anna is less than Leon,
        System.out.println(comparison2);


        String currentItem = "3";
        String newItem = "-1";


        int comparison = (currentItem.compareTo(newItem)); //3 is bigger than -1
        System.out.println(comparison);


//        the value {@code 0} if the argument string is equal to
//     *          this string; a value less than {@code 0} if this string
//                *          is lexicographically less than the string argument; and a
//     *          value greater than {@code 0} if this string is
//     *          lexicographically greater than the string argument.

//        String newItem;
//        String currentItem;
//
//
////        public boolean addItem(String newItem) {
//            if(this.root == null) {
//                // The list was empty, so this item becomes the head of the list
//                this.root = newItem;
//                return true;
//            }
//
//            String currentItem = this.root;
//            while(currentItem != null) {
//                int comparison = (currentItem.compareTo(newItem));
//                if(comparison <0) {
//                    // newItem is greater, move right if possible
//                    if(currentItem.next() != null) {
//                        currentItem = currentItem.next();
//                    } else {
//                        // there is no next, so insert at end of list
//                        currentItem.setNext(newItem);
//                        newItem.setPrevious(currentItem);
//                        return true;
//                    }
//                } else if(comparison >0) {
//                    // newItem is less, insert before
//                    if(currentItem.previous() != null) {
//                        currentItem.previous().setNext(newItem);
//                        newItem.setPrevious(currentItem.previous());
//                        newItem.setNext(currentItem);
//                        currentItem.setPrevious(newItem);
//                    } else {
//                        // the node with a previous is the root
//                        newItem.setNext(this.root);
//                        this.root.setPrevious(newItem);
//                        this.root = newItem;
//                    }
//                    return true;
//                } else {
//                    // equal
//                    System.out.println(newItem.getValue() + " is already present, not added.");
//                    return false;
//                }
//            }
//
//            return false;
//        }
//
//
//        public boolean removeItem(ListItem item) {
//            return false;
//        }
//
//
//        public void traverse(ListItem root) {
//
//        }
    }
}
