package com.laioffer.tinnews.repository;

public class MyView {
    private ClickListener clickListener;
    public interface ClickListener {
        void onClick(MyView view);
    }

    public void setOnClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void onHumanClick() {
        clickListener.onClick(this);
    }
}
