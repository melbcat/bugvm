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
package com.bugvm.apple.iad;

/*<imports>*/

import com.bugvm.apple.avkit.AVPlayerViewController;
import com.bugvm.apple.foundation.NSError;
import com.bugvm.apple.foundation.NSExtensions;
import com.bugvm.objc.ObjCClass;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.Block;
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.block.VoidBlock1;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("iAd")/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/AVPlayerViewControllerExtensions/*</name>*/ 
    extends /*<extends>*/NSExtensions/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVPlayerViewControllerExtensions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    private AVPlayerViewControllerExtensions() {}
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "playPrerollAdWithCompletionHandler:")
    public static native void playPrerollAd(AVPlayerViewController thiz, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "cancelPreroll")
    public static native void cancelPreroll(AVPlayerViewController thiz);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "preparePrerollAds")
    protected static native void preparePrerollAds(ObjCClass clazz);
    public static void preparePrerollAds() { preparePrerollAds(ObjCClass.getByType(AVPlayerViewController.class)); }
    /*</methods>*/
}