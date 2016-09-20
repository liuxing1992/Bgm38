package me.ewriter.bangumitv.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MY_COLLECTION".
*/
public class MyCollectionDao extends AbstractDao<MyCollection, Long> {

    public static final String TABLENAME = "MY_COLLECTION";

    /**
     * Properties of entity MyCollection.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Collection_type = new Property(1, String.class, "collection_type", false, "COLLECTION_TYPE");
        public final static Property Link_url = new Property(2, String.class, "link_url", false, "LINK_URL");
        public final static Property Image_url = new Property(3, String.class, "image_url", false, "IMAGE_URL");
        public final static Property Large_image_url = new Property(4, String.class, "large_image_url", false, "LARGE_IMAGE_URL");
        public final static Property Normal_name = new Property(5, String.class, "normal_name", false, "NORMAL_NAME");
        public final static Property Small_name = new Property(6, String.class, "small_name", false, "SMALL_NAME");
        public final static Property Info = new Property(7, String.class, "info", false, "INFO");
        public final static Property Rate_number = new Property(8, String.class, "rate_number", false, "RATE_NUMBER");
        public final static Property Rate_total = new Property(9, String.class, "rate_total", false, "RATE_TOTAL");
    };


    public MyCollectionDao(DaoConfig config) {
        super(config);
    }
    
    public MyCollectionDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MY_COLLECTION\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"COLLECTION_TYPE\" TEXT," + // 1: collection_type
                "\"LINK_URL\" TEXT," + // 2: link_url
                "\"IMAGE_URL\" TEXT," + // 3: image_url
                "\"LARGE_IMAGE_URL\" TEXT," + // 4: large_image_url
                "\"NORMAL_NAME\" TEXT," + // 5: normal_name
                "\"SMALL_NAME\" TEXT," + // 6: small_name
                "\"INFO\" TEXT," + // 7: info
                "\"RATE_NUMBER\" TEXT," + // 8: rate_number
                "\"RATE_TOTAL\" TEXT);"); // 9: rate_total
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MY_COLLECTION\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, MyCollection entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String collection_type = entity.getCollection_type();
        if (collection_type != null) {
            stmt.bindString(2, collection_type);
        }
 
        String link_url = entity.getLink_url();
        if (link_url != null) {
            stmt.bindString(3, link_url);
        }
 
        String image_url = entity.getImage_url();
        if (image_url != null) {
            stmt.bindString(4, image_url);
        }
 
        String large_image_url = entity.getLarge_image_url();
        if (large_image_url != null) {
            stmt.bindString(5, large_image_url);
        }
 
        String normal_name = entity.getNormal_name();
        if (normal_name != null) {
            stmt.bindString(6, normal_name);
        }
 
        String small_name = entity.getSmall_name();
        if (small_name != null) {
            stmt.bindString(7, small_name);
        }
 
        String info = entity.getInfo();
        if (info != null) {
            stmt.bindString(8, info);
        }
 
        String rate_number = entity.getRate_number();
        if (rate_number != null) {
            stmt.bindString(9, rate_number);
        }
 
        String rate_total = entity.getRate_total();
        if (rate_total != null) {
            stmt.bindString(10, rate_total);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, MyCollection entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String collection_type = entity.getCollection_type();
        if (collection_type != null) {
            stmt.bindString(2, collection_type);
        }
 
        String link_url = entity.getLink_url();
        if (link_url != null) {
            stmt.bindString(3, link_url);
        }
 
        String image_url = entity.getImage_url();
        if (image_url != null) {
            stmt.bindString(4, image_url);
        }
 
        String large_image_url = entity.getLarge_image_url();
        if (large_image_url != null) {
            stmt.bindString(5, large_image_url);
        }
 
        String normal_name = entity.getNormal_name();
        if (normal_name != null) {
            stmt.bindString(6, normal_name);
        }
 
        String small_name = entity.getSmall_name();
        if (small_name != null) {
            stmt.bindString(7, small_name);
        }
 
        String info = entity.getInfo();
        if (info != null) {
            stmt.bindString(8, info);
        }
 
        String rate_number = entity.getRate_number();
        if (rate_number != null) {
            stmt.bindString(9, rate_number);
        }
 
        String rate_total = entity.getRate_total();
        if (rate_total != null) {
            stmt.bindString(10, rate_total);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public MyCollection readEntity(Cursor cursor, int offset) {
        MyCollection entity = new MyCollection( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // collection_type
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // link_url
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // image_url
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // large_image_url
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // normal_name
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // small_name
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // info
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // rate_number
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9) // rate_total
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, MyCollection entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setCollection_type(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setLink_url(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setImage_url(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setLarge_image_url(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setNormal_name(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setSmall_name(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setInfo(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setRate_number(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setRate_total(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(MyCollection entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(MyCollection entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
