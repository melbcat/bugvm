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
package com.bugvm.apple.uikit;

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
import com.bugvm.apple.foundation.*;
import com.bugvm.apple.coreanimation.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.coredata.*;
import com.bugvm.apple.coreimage.*;
import com.bugvm.apple.coretext.*;
import com.bugvm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/UIPrinterCutterBehavior/*</name>*/ implements ValuedEnum {
    /*<values>*/
    NoCut(0L),
    PrinterDefault(1L),
    CutAfterEachPage(2L),
    CutAfterEachCopy(3L),
    CutAfterEachJob(4L);
    /*</values>*/

    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<UIPrinterCutterBehavior> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSNumber> o = (NSArray<NSNumber>) NSObject.Marshaler.toObject(cls, handle, flags);
            if (o == null) {
                return null;
            }
            List<UIPrinterCutterBehavior> list = new ArrayList<>();
            for (NSNumber n : o) {
                list.add(UIPrinterCutterBehavior.valueOf(n.longValue()));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<UIPrinterCutterBehavior> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSNumber> array = new NSMutableArray<>();
            for (UIPrinterCutterBehavior i : l) {
                array.add(NSNumber.valueOf(i.value()));
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/UIPrinterCutterBehavior/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/UIPrinterCutterBehavior/*</name>*/ valueOf(long n) {
        for (/*<name>*/UIPrinterCutterBehavior/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/UIPrinterCutterBehavior/*</name>*/.class.getName());
    }
}
