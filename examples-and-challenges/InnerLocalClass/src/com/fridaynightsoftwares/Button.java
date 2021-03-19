package com.fridaynightsoftwares;

public class Button {
    private String title;

    // This can be any classes that implement IOnclickListener. In this case, it's the local class ClickListener in main():
    private IOnclickListener onClickListener;
    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    // The purpose of this setter is to actually initialize this field with a class that implements IOnClickListener.
    // In our case, the local class ClickListener inside the main() method:
    public void setOnClickListener(IOnclickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
    public void onClick() {
        // Since onClickListener is an object of a class that implements IOnClickListener, which is the local class ClickListener, this works:
        onClickListener.onClick(title);
    }
    public interface IOnclickListener {
        void onClick(String title); // This is implemented in the local class ClickListener in the main method.
    }
}
