package com.example.arcoreagora.rendering;

import android.content.Context;
import android.graphics.drawable.shapes.Shape;
import android.util.Log;

import java.io.IOException;

public class ShapeRenderer extends ObjectRenderer{

    private static final String TAG = ShapeRenderer.class.getSimpleName();

    ShapeRenderer(){
        super();
    }

    public static ObjectRenderer circle(Context context){
        ObjectRenderer mVirtualObject = new ObjectRenderer();
        try {
            mVirtualObject.createOnGlThread(/*context=*/context, "torus-down.obj", "green.png");
            mVirtualObject.setMaterialProperties(0.0f, 3.5f, 1.0f, 6.0f);
        } catch (IOException e) {
            Log.e(TAG, "Failed to read obj file");
        }
        return mVirtualObject;
    }

    public static ObjectRenderer arrow(Context context){
        ObjectRenderer mVirtualObject = new ObjectRenderer();
        try {
            mVirtualObject.createOnGlThread(/*context=*/context, "arrow.obj", "green.png");
            mVirtualObject.setMaterialProperties(0.0f, 3.5f, 1.0f, 6.0f);
        } catch (IOException e) {
            Log.e(TAG, "Failed to read obj file");
        }
        return mVirtualObject;
    }
}
