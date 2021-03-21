package com.fridaynightsoftwares;

public interface INodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem item);
}
