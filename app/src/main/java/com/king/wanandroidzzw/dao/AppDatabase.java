package com.king.wanandroidzzw.dao;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.king.wanandroidzzw.app.comm.Constants;
import com.king.wanandroidzzw.bean.SearchHistory;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
@Database(entities = {SearchHistory.class}, version = 1,exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    private static final Object mLock = new Object();

    private static AppDatabase sInstance;

    public static AppDatabase getInstance(Context context) {
        synchronized (mLock){
            if(sInstance == null){
                sInstance = Room.databaseBuilder(context.getApplicationContext(),AppDatabase.class, Constants.DATABASE_NAME).build();
            }
            return sInstance;
        }
    }

    public abstract SearchHistoryDao searchHistoryDao();

}
