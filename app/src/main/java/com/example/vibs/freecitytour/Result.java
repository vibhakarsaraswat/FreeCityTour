package com.example.vibs.freecitytour;

/**
 * Created by vibhakar.sarswat on 5/19/2017.
 */

public class Result {
    /** Resource IDs for a Place */
    private int mImageOfPlaceId;
    private int mNameOfPlaceId;
    private int mAddressOfPlaceId;
    private int mContactOfPlaceId;


    // Create a new Place object.
    public Result(int imageOfPlaceId, int nameOfPlaceId, int addressOfPlaceId, int contactOfPlaceId) {
        mImageOfPlaceId = imageOfPlaceId;
        mNameOfPlaceId = nameOfPlaceId;
        mAddressOfPlaceId = addressOfPlaceId;
        mContactOfPlaceId = contactOfPlaceId;
    }

    // Getter methods for Place resources.
    public int getImageOfPlaceId(){
        return mImageOfPlaceId;
    }
    public int getNameOfPlaceId(){
        return mNameOfPlaceId;
    }
    public int getAddressOfPlaceId(){
        return mAddressOfPlaceId;
    }
    public int getContactOfPlaceId(){
        return mContactOfPlaceId;
    }

}