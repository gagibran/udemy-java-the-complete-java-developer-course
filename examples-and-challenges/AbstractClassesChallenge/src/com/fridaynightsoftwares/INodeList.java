package com.fridaynightsoftwares;

public interface INodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem();
    void traverse(ListItem item);
}
