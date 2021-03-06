/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;

public class btAxisSweep3 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btAxisSweep3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btAxisSweep3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btAxisSweep3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public btAxisSweep3(Vector3 worldAabbMin, Vector3 worldAabbMax, int maxHandles, btOverlappingPairCache pairCache, boolean disableRaycastAccelerator) {
    this(gdxBulletJNI.new_btAxisSweep3__SWIG_0(worldAabbMin, worldAabbMax, maxHandles, btOverlappingPairCache.getCPtr(pairCache), pairCache, disableRaycastAccelerator), true);
  }

  public btAxisSweep3(Vector3 worldAabbMin, Vector3 worldAabbMax, int maxHandles, btOverlappingPairCache pairCache) {
    this(gdxBulletJNI.new_btAxisSweep3__SWIG_1(worldAabbMin, worldAabbMax, maxHandles, btOverlappingPairCache.getCPtr(pairCache), pairCache), true);
  }

  public btAxisSweep3(Vector3 worldAabbMin, Vector3 worldAabbMax, int maxHandles) {
    this(gdxBulletJNI.new_btAxisSweep3__SWIG_2(worldAabbMin, worldAabbMax, maxHandles), true);
  }

  public btAxisSweep3(Vector3 worldAabbMin, Vector3 worldAabbMax) {
    this(gdxBulletJNI.new_btAxisSweep3__SWIG_3(worldAabbMin, worldAabbMax), true);
  }

}
