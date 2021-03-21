package com.fridaynightsoftwares;

public class MyLinkedList implements INodeList {
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (root == null) {

            // This list is empty here, so the item is added to the head of the list:
            root = newItem;
            return true;
        }
        ListItem currentItem = root; // We're at the beginning of the list.
        while(currentItem != null) {
            int comparison = currentItem.compareTo(newItem); // Is the current item greater, smaller, or equal to the new one?

            // New item is greater, move right if possible:
            if (comparison < 0) {

                // If there is room to go next on the list:
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();

                // If we're at the end of the list:
                } else {
                    currentItem.setNext(newItem); // We add the new item to the head of the list (far right).
                    newItem.setPrevious(currentItem); // Now, the current item is at the second place on the list.
                    return true;
                }

            // New item is smaller than the current item:
            } else if (comparison > 0) {

                // We insert the new item in the previous position of the next item:
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    currentItem.setPrevious(newItem);

                // Node without a previous is the root:
                } else {

                    // Puts the new item before the root:
                    newItem.setNext(root);
                    root.setPrevious(newItem);
                    root = newItem;
                }
                return true;

            // If they are equal:
            } else {
                System.out.println(newItem.value + " is already present. Not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.value);
            ListItem currentItem = root;

            // Go through the list:
            while (currentItem != null) {
                int comparison = currentItem.compareTo(item);

                // If the item is there:
                if (comparison == 0) {

                    // If the current item is the head of the list:
                    if (currentItem == root) {

                        // The root will point to the next record;
                        root = currentItem.next();

                    // If the current item isn't the head of the list, there is a previous entry:
                    } else {

                        // Points the previous entry to the next element, so that the link to the current one is lost (deleted):
                        currentItem.previous().setNext(currentItem.next());

                        // If there is a next item:
                        if (currentItem.next() != null) {

                            // Sets its previous value to the previous of the current item, to loose the link to the current one:
                            currentItem.next().setPrevious(currentItem.previous());
                        }
                    }
                    return true;

                // Means that we haven't found the item yet, so goes to the next element:
                } else if (comparison < 0) {
                    currentItem = currentItem.next();

                // We looped the whole list and reached the end of it:
                } else {

                    // The item is not in the list, so there's nothing to delete.
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty.");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
