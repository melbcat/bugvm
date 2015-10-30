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
package com.bugvm.apple.gameplaykit;

/*<imports>*/

import com.bugvm.apple.foundation.NSData;
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

/*</javadoc>*/
/*<annotations>*/@Library("GameplayKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKARC4RandomSource/*</name>*/ 
    extends /*<extends>*/GKRandomSource/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKARC4RandomSourcePtr extends Ptr<GKARC4RandomSource, GKARC4RandomSourcePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKARC4RandomSource.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKARC4RandomSource() {}
    protected GKARC4RandomSource(SkipInit skipInit) { super(skipInit); }
    public GKARC4RandomSource(NSData seed) { super((SkipInit) null); initObject(init(seed)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "seed")
    public native NSData getSeed();
    @Property(selector = "setSeed:")
    public native void setSeed(NSData v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSeed:")
    protected native @Pointer long init(NSData seed);
    @Method(selector = "dropValuesWithCount:")
    public native void dropValues(@MachineSizedUInt long count);
    /*</methods>*/
}