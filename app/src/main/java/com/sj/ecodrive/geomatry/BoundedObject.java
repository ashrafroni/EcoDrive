package com.sj.ecodrive.geomatry;

import android.graphics.RectF;

import java.util.ArrayList;

/**
 * An object bounded on an Axis-Aligned Bounding Box.
 * @author Colonel32
 * @author cnvandev
 */
public interface BoundedObject {
	public RectF getBounds();
	public ArrayList<Integer> index = new ArrayList<>();
}
