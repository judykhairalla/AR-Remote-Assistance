package com.example.arcoreagora;

import com.google.ar.core.Anchor;

public class VirtualObject {
    private Anchor anchor;
    private float scale;
    private int type;

    VirtualObject(Anchor anchor, float scale, int type){
        this.anchor = anchor;
        this.scale = scale;
        this.type = type;
    }

    public Anchor getAnchor() {
        return anchor;
    }

    public float getScale() {
        return scale;
    }

    public int getType() {
        return type;
    }


}
