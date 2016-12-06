package com.rfachrur.wowbuku.adapter;

import android.support.v7.widget.RecyclerView;

import io.realm.RealmBaseAdapter;
import io.realm.RealmObject;

/**
 * Created by rfachrur on 12/6/16.
 *
 */

public abstract class BukuRealmRecyclerViewAdapter<T extends RealmObject> extends RecyclerView.Adapter {

    private RealmBaseAdapter<T> realmBaseAdapter;

    public T getItem(int position) { return realmBaseAdapter.getItem(position); }

    public RealmBaseAdapter<T> getRealmAdapter() { return realmBaseAdapter; }

    public void setRealmBaseAdapter(RealmBaseAdapter<T> realmAdapter) { realmBaseAdapter = realmAdapter; }

}
