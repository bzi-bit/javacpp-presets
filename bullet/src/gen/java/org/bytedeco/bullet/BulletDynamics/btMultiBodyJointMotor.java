// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletDynamics;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;

import static org.bytedeco.bullet.global.BulletDynamics.*;


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btMultiBodyJointMotor extends btMultiBodyConstraint {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btMultiBodyJointMotor(Pointer p) { super(p); }

	public btMultiBodyJointMotor(btMultiBody body, int link, @Cast("btScalar") float desiredVelocity, @Cast("btScalar") float maxMotorImpulse) { super((Pointer)null); allocate(body, link, desiredVelocity, maxMotorImpulse); }
	private native void allocate(btMultiBody body, int link, @Cast("btScalar") float desiredVelocity, @Cast("btScalar") float maxMotorImpulse);
	public btMultiBodyJointMotor(btMultiBody body, int link, int linkDoF, @Cast("btScalar") float desiredVelocity, @Cast("btScalar") float maxMotorImpulse) { super((Pointer)null); allocate(body, link, linkDoF, desiredVelocity, maxMotorImpulse); }
	private native void allocate(btMultiBody body, int link, int linkDoF, @Cast("btScalar") float desiredVelocity, @Cast("btScalar") float maxMotorImpulse);
	public native void finalizeMultiDof();

	public native int getIslandIdA();
	public native int getIslandIdB();

	public native void createConstraintRows(@ByRef btMultiBodySolverConstraintArray constraintRows,
										  @ByRef btMultiBodyJacobianData data,
										  @Const @ByRef btContactSolverInfo infoGlobal);

	public native void setVelocityTarget(@Cast("btScalar") float velTarget, @Cast("btScalar") float kd/*=1.f*/);
	public native void setVelocityTarget(@Cast("btScalar") float velTarget);

	public native void setPositionTarget(@Cast("btScalar") float posTarget, @Cast("btScalar") float kp/*=1.f*/);
	public native void setPositionTarget(@Cast("btScalar") float posTarget);

	public native void setErp(@Cast("btScalar") float erp);
	public native @Cast("btScalar") float getErp();
	public native void setRhsClamp(@Cast("btScalar") float rhsClamp);
	public native void debugDraw(btIDebugDraw drawer);
}
