package com.rfachrur.wowbuku.adapter;

import android.content.Context;

import com.rfachrur.wowbuku.data.Buku;

import io.realm.RealmResults;

/**
 * Created by rfachrur on 12/6/16.
 *
 */

public class BukuRealmAdapter extends BukuRealmModelAdapter<Buku> {

    public BukuRealmAdapter(Context context, RealmResults<Buku> realmResults, boolean automaticUpdate) {
        super(context, realmResults, automaticUpdate);
    }
}
