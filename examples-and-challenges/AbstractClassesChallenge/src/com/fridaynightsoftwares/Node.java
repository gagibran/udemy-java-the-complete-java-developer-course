package com.fridaynightsoftwares;

public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        rightLink = item;
        return rightLink;
    }

    @Override
    ListItem previous() {
        return leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        leftLink = item;
        return leftLink;
    }

    @Override
    int compareTo(ListItem item) {
        if (item.value != null) {
            // The value is of type Object, but we're gonna pass it as a string when we call it.
            return ((String) value).compareTo((String) item.value);
        }
        return -1;
    }
}
