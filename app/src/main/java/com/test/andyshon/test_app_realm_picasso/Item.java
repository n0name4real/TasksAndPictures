package com.test.andyshon.test_app_realm_picasso;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

/**
 * Created by andyshon on 12.05.18.
 */

public class Item extends RealmObject{

    public Item(String id, String name, byte[] bitmap){
        this.id = id;
        this.name = name;
        this.bitmap = bitmap;
    }
    public Item(){

    }

    @Required
    @PrimaryKey
    private String id;

    @Required
    private String name;

    @Required
    private byte[] bitmap;


    public byte[] getBitmap() {
        return bitmap;
    }

    public void setBitmap(byte[] bitmap) {
        this.bitmap = bitmap;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
