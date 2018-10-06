package com.example.android.inventoryapp.data;

/**
 * Created by clarissajarem on 10/6/18.
 */

import android.provider.BaseColumns;

/**
 * API Contract for the Pets app.
 */
public final class ProductContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private ProductContract() {}

    /**
     * Inner class that defines constant values for the pets database table.
     * Each entry in the table represents a single pet.
     */
    public static final class ProductEntry implements BaseColumns {

        /** Name of database table for pets */
        public final static String TABLE_NAME = "products";

        /**
         * Unique ID number for the pet (only for use in the database table).
         *
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Name of the product.
         *
         * Type: TEXT
         */
        public final static String COLUMN_PRODUCT_NAME ="name";

        /**
         * price of the product.
         *
         * Type: TEXT
         */
        public final static int COLUMN_PRODUCT_PRICE = "price";


        /**
         * quanitty of the product.
         *
         * Type: INTEGER
         */
        public final static String COLUMN_PRODUCT_QUANITTY = "quantity";

        /**
         * Possible values for the QUANTITY of the products.
         */
        public static final int QUANTITY_UNKNOWN = 0;
        /**
         * Name of the supplier.
         *
         * Type: TEXT
         */
        public final static String COLUMN_SUPPLIER_NAME ="supplier";
        /**
         * Phone number of the supplier.
         *
         * Type: TEXT
         */
        public final static String COLUMN_SUPPLIER_PHONE ="phone";


    }

}