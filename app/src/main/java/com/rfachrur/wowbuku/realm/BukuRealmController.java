package com.rfachrur.wowbuku.realm;

import android.app.Activity;
import android.app.Application;
import android.support.v4.app.Fragment;

import com.rfachrur.wowbuku.data.Buku;

import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by rfachrur on 12/6/16.
 *
 */

public class BukuRealmController {

    private static BukuRealmController instance;
    private final Realm realm;

    public BukuRealmController(Application application) {
        realm = Realm.getDefaultInstance();
    }

    public static BukuRealmController with(Fragment fragment) {

        if (instance == null) {
            instance = new BukuRealmController(fragment.getActivity().getApplication());
        }
        return instance;
    }

    public static BukuRealmController with(Activity activity) {

        if (instance == null) {
            instance = new BukuRealmController(activity.getApplication());
        }
        return instance;
    }

    public static BukuRealmController with(Application application) {

        if (instance == null) {
            instance = new BukuRealmController(application);
        }
        return instance;
    }

    public static BukuRealmController getInstance() {

        return instance;
    }

    public Realm getRealm() {

        return realm;
    }

    //Refresh the realm istance
    public void refresh() {

        realm.refresh();
    }

    //clear all objects from Book.class
    public void clearAll() {

        realm.beginTransaction();
        realm.clear(Buku.class);
        realm.commitTransaction();
    }

    //find all objects in the Book.class
    public RealmResults<Buku> getBooks() {

        return realm.where(Buku.class).findAll();
    }

    //query a single item with the given id
    public Buku getBook(String id) {

        return realm.where(Buku.class).equalTo("id", id).findFirst();
    }

    //check if Book.class is empty
    public boolean hasBooks() {

        return !realm.allObjects(Buku.class).isEmpty();
    }

    //query example
    public RealmResults<Buku> queryedBooks() {

        return realm.where(Buku.class)
                .contains("author", "Author 0")
                .or()
                .contains("title", "Realm")
                .findAll();

    }

}
