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
package com.bugvm.apple.modelio;

/*<imports>*/

import com.bugvm.apple.coregraphics.CGColor;
import com.bugvm.apple.coregraphics.CGColorSpace;
import com.bugvm.apple.foundation.VectorFloat3;
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
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ModelIO") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MDLLight/*</name>*/ 
    extends /*<extends>*/MDLObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MDLLightPtr extends Ptr<MDLLight, MDLLightPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MDLLight.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MDLLight() {}
    protected MDLLight(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "lightType")
    public native MDLLightType getLightType();
    @Property(selector = "setLightType:")
    public native void setLightType(MDLLightType v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "irradianceAtPoint:")
    public native CGColor getIrradiance(VectorFloat3 point);
    @Method(selector = "irradianceAtPoint:colorSpace:")
    public native CGColor getIrradiance(VectorFloat3 point, CGColorSpace colorSpace);
    /*</methods>*/
}