/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class MgDiamond extends MgBaseRect {
  private long swigCPtr;

  protected MgDiamond(long cPtr, boolean cMemoryOwn) {
    super(touchvgJNI.MgDiamond_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MgDiamond obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_MgDiamond(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MgDiamond create() {
    long cPtr = touchvgJNI.MgDiamond_create();
    return (cPtr == 0) ? null : new MgDiamond(cPtr, false);
  }

  public static int Type() {
    return touchvgJNI.MgDiamond_Type();
  }

  public MgObject clone() {
    long cPtr = touchvgJNI.MgDiamond_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MgObject(cPtr, false);
  }

  public void copy(MgObject src) {
    touchvgJNI.MgDiamond_copy(swigCPtr, this, MgObject.getCPtr(src), src);
  }

  public void release() {
    touchvgJNI.MgDiamond_release(swigCPtr, this);
  }

  public boolean equals(MgObject src) {
    return touchvgJNI.MgDiamond_equals(swigCPtr, this, MgObject.getCPtr(src), src);
  }

  public int getType() {
    return touchvgJNI.MgDiamond_getType(swigCPtr, this);
  }

  public boolean isKindOf(int type) {
    return touchvgJNI.MgDiamond_isKindOf(swigCPtr, this, type);
  }

  public Box2d getExtent() {
    return new Box2d(touchvgJNI.MgDiamond_getExtent(swigCPtr, this), true);
  }

  public void update() {
    touchvgJNI.MgDiamond_update(swigCPtr, this);
  }

  public void transform(Matrix2d mat) {
    touchvgJNI.MgDiamond_transform(swigCPtr, this, Matrix2d.getCPtr(mat), mat);
  }

  public void clear() {
    touchvgJNI.MgDiamond_clear(swigCPtr, this);
  }

  public void clearCachedData() {
    touchvgJNI.MgDiamond_clearCachedData(swigCPtr, this);
  }

  public int getPointCount() {
    return touchvgJNI.MgDiamond_getPointCount(swigCPtr, this);
  }

  public Point2d getPoint(int index) {
    return new Point2d(touchvgJNI.MgDiamond_getPoint(swigCPtr, this, index), true);
  }

  public void setPoint(int index, Point2d pt) {
    touchvgJNI.MgDiamond_setPoint(swigCPtr, this, index, Point2d.getCPtr(pt), pt);
  }

  public boolean isClosed() {
    return touchvgJNI.MgDiamond_isClosed(swigCPtr, this);
  }

  public boolean hitTestBox(Box2d rect) {
    return touchvgJNI.MgDiamond_hitTestBox(swigCPtr, this, Box2d.getCPtr(rect), rect);
  }

  public boolean draw(int mode, GiGraphics gs, GiContext ctx, int segment) {
    return touchvgJNI.MgDiamond_draw(swigCPtr, this, mode, GiGraphics.getCPtr(gs), gs, GiContext.getCPtr(ctx), ctx, segment);
  }

  public void output(MgPath path) {
    touchvgJNI.MgDiamond_output(swigCPtr, this, MgPath.getCPtr(path), path);
  }

  public boolean save(MgStorage s) {
    return touchvgJNI.MgDiamond_save(swigCPtr, this, MgStorage.getCPtr(s), s);
  }

  public boolean load(MgShapeFactory factory, MgStorage s) {
    return touchvgJNI.MgDiamond_load(swigCPtr, this, MgShapeFactory.getCPtr(factory), factory, MgStorage.getCPtr(s), s);
  }

  public int getHandleCount() {
    return touchvgJNI.MgDiamond_getHandleCount(swigCPtr, this);
  }

  public Point2d getHandlePoint(int index) {
    return new Point2d(touchvgJNI.MgDiamond_getHandlePoint(swigCPtr, this, index), true);
  }

  public boolean setHandlePoint(int index, Point2d pt, float tol) {
    return touchvgJNI.MgDiamond_setHandlePoint(swigCPtr, this, index, Point2d.getCPtr(pt), pt, tol);
  }

  public boolean isHandleFixed(int index) {
    return touchvgJNI.MgDiamond_isHandleFixed(swigCPtr, this, index);
  }

  public int getHandleType(int index) {
    return touchvgJNI.MgDiamond_getHandleType(swigCPtr, this, index);
  }

  public boolean offset(Vector2d vec, int segment) {
    return touchvgJNI.MgDiamond_offset(swigCPtr, this, Vector2d.getCPtr(vec), vec, segment);
  }

  public float hitTest(Point2d pt, float tol, MgHitResult res) {
    return touchvgJNI.MgDiamond_hitTest(swigCPtr, this, Point2d.getCPtr(pt), pt, tol, MgHitResult.getCPtr(res), res);
  }

}
