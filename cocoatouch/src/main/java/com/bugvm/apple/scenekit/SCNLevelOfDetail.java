/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.apple.scenekit;

/*<imports>*/

import com.bugvm.apple.foundation.NSObject;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.annotation.Property;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("SceneKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCNLevelOfDetail/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SCNLevelOfDetailPtr extends Ptr<SCNLevelOfDetail, SCNLevelOfDetailPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SCNLevelOfDetail.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SCNLevelOfDetail() {}
    protected SCNLevelOfDetail(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "geometry")
    public native SCNGeometry getGeometry();
    @Property(selector = "screenSpaceRadius")
    public native @MachineSizedFloat double getScreenSpaceRadius();
    @Property(selector = "worldSpaceDistance")
    public native @MachineSizedFloat double getWorldSpaceDistance();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "levelOfDetailWithGeometry:screenSpaceRadius:")
    public static native SCNLevelOfDetail createWithGeometryAndRadius(SCNGeometry geometry, @MachineSizedFloat double radius);
    @Method(selector = "levelOfDetailWithGeometry:worldSpaceDistance:")
    public static native SCNLevelOfDetail createWithGeometryAndDistance(SCNGeometry geometry, @MachineSizedFloat double distance);
    /*</methods>*/
}