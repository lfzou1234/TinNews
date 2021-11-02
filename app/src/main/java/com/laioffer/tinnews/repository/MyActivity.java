package com.laioffer.tinnews.repository;

public class MyActivity {
    public MyView view;

    public void onCreate() {
       setContentView(view);
       view.setOnClickListener(new MyView.ClickListener() {
           @Override
           public void onClick(MyView view) {

           }
       });
       MyFragment fragment = new MyFragment();
       attachFragment(fragment);
       createFragmentView(fragment);
    }

    public void attachFragment(MyFragment fragment) {
        fragment.onAttach(this);
    }

    public void createFragmentView(MyFragment fragment) {
        MyView view = fragment.onCreateView();
    }

    public void setContentView(MyView view) {

    }
}
