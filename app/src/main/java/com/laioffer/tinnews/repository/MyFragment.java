package com.laioffer.tinnews.repository;

public class MyFragment implements MyView.ClickListener {
    private MyView view;
    public void onAttach(MyActivity activity) {

    }

    public MyView onCreateView() {
        return new MyView();
    }

    public void onViewCreated() {
        view.setOnClickListener(this);
    }

    @Override
    public void onClick(MyView view) {

    }
}
