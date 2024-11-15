package com.example.workmanagerapp;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class MyWorker extends Worker {

    public MyWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    // doWork() runs asynchronously on a background
    // thread provided by WorkManager
    @NonNull
    @Override
    public Result doWork() {
        // Count to 1000
        for (int i = 0; i < 1000; i++) {
            Log.i("TAGY", "Count is: " + i);
        }
        return Result.success();
    }
}
