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
package com.bugvm.apple.foundation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import com.bugvm.objc.*;
import com.bugvm.objc.annotation.*;
import com.bugvm.objc.block.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.corefoundation.*;
import com.bugvm.apple.uikit.*;
import com.bugvm.apple.coretext.*;
import com.bugvm.apple.coreanimation.*;
import com.bugvm.apple.coredata.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.coremedia.*;
import com.bugvm.apple.security.*;
import com.bugvm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSMutableString/*</name>*/ 
    extends /*<extends>*/NSString/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSMutableStringPtr extends Ptr<NSMutableString, NSMutableStringPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSMutableString.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSMutableString() {}
    protected NSMutableString(SkipInit skipInit) { super(skipInit); }
    public NSMutableString(@MachineSizedUInt long capacity) { super((SkipInit) null); initObject(init(capacity)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    public boolean applyTransform(NSStringTransform transform, boolean reverse, NSRange range, NSRange resultingRange) {
        return applyTransform(transform.value().toString(), reverse, range, resultingRange);
    }
    /*<methods>*/
    @Method(selector = "replaceCharactersInRange:withString:")
    public native void replaceCharacters(@ByVal NSRange range, String aString);
    @Method(selector = "insertString:atIndex:")
    public native void insert(String aString, @MachineSizedUInt long loc);
    @Method(selector = "deleteCharactersInRange:")
    public native void deleteCharacters(@ByVal NSRange range);
    @Method(selector = "appendString:")
    public native void append(String aString);
    @Method(selector = "setString:")
    public native void setString(String aString);
    @Method(selector = "replaceOccurrencesOfString:withString:options:range:")
    public native @MachineSizedUInt long replaceAll(String target, String replacement, NSStringCompareOptions options, @ByVal NSRange searchRange);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "applyTransform:reverse:range:updatedRange:")
    public native boolean applyTransform(String transform, boolean reverse, @ByVal NSRange range, NSRange resultingRange);
    @Method(selector = "initWithCapacity:")
    protected native @Pointer long init(@MachineSizedUInt long capacity);
    /*</methods>*/
}
