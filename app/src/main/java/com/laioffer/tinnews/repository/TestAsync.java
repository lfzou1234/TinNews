package com.laioffer.tinnews.repository;


import android.os.Handler;

public class TestAsync<Request, Progress, Result> {
    public void execute(Request request) {
        onPreExecute();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Result result = doInBackground(request);
                // move to main thread then
                new Handler().post(new Runnable() {
                    @Override
                    public void run() {
                        onPostExecute(result);
                    }
                });
            }
        }).start();

    }

    protected void onPreExecute() {

    }

    protected Result doInBackground(Request... request) {
        return null;
    }

    private void onPostExecute(Result result) {

    }
}
