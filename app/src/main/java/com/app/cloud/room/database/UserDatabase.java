package com.app.cloud.room.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.app.cloud.room.bean.User;
import com.app.cloud.room.dao.UserDao;

@Database(entities = { User.class }, version = 1,exportSchema = false)
public abstract class UserDatabase extends RoomDatabase {

    private static final String DB_NAME = "UserDatabase.db";
    private static volatile UserDatabase instance;

    public static synchronized UserDatabase getInstance(Context context) {
        if (instance == null) {
            instance = create(context);
        }
        return instance;
    }

    /**
     * 创建数据库
     * 调用方式：UserDatabase.getInstance(this).userDao.insert()
     * @param context
     * @return
     */
    private static UserDatabase create(final Context context) {
        return Room.databaseBuilder(
            context,
            UserDatabase.class,
            DB_NAME).build();
    }

    public abstract UserDao getUserDao();
}