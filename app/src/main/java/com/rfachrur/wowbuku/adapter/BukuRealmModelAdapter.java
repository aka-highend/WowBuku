package com.rfachrur.wowbuku.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import io.realm.RealmBaseAdapter;
import io.realm.RealmObject;
import io.realm.RealmResults;

/**
 * Created by rfachrur on 12/6/16.
 *
 */

public class BukuRealmModelAdapter<T extends RealmObject> extends RealmBaseAdapter<T> {

    public BukuRealmModelAdapter(Context context, RealmResults<T> realmResults, boolean automaticUpdate) {
        super(context, realmResults, automaticUpdate);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
