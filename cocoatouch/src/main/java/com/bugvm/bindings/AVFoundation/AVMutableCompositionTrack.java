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
package com.bugvm.bindings.AVFoundation;

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
import com.bugvm.apple.corefoundation.*;
import com.bugvm.apple.dispatch.*;
import com.bugvm.apple.coreanimation.*;
import com.bugvm.apple.coreimage.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.coreaudio.*;
import com.bugvm.apple.coremedia.*;
import com.bugvm.apple.corevideo.*;
import com.bugvm.apple.mediatoolbox.*;
import com.bugvm.apple.audiotoolbox.*;
import com.bugvm.apple.audiounit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 4.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVMutableCompositionTrack/*</name>*/ 
    extends /*<extends>*/AVCompositionTrack/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVMutableCompositionTrackPtr extends Ptr<AVMutableCompositionTrack, AVMutableCompositionTrackPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVMutableCompositionTrack.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVMutableCompositionTrack() {}
    protected AVMutableCompositionTrack(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "naturalTimeScale")
    public native int getNaturalTimeScale();
    @Property(selector = "setNaturalTimeScale:")
    public native void setNaturalTimeScale(int v);
    @Property(selector = "languageCode")
    public native String getLanguageCode();
    @Property(selector = "setLanguageCode:")
    public native void setLanguageCode(String v);
    @Property(selector = "extendedLanguageTag")
    public native String getExtendedLanguageTag();
    @Property(selector = "setExtendedLanguageTag:")
    public native void setExtendedLanguageTag(String v);
    @Property(selector = "preferredTransform")
    public native @ByVal CGAffineTransform getPreferredTransform();
    @Property(selector = "setPreferredTransform:")
    public native void setPreferredTransform(@ByVal CGAffineTransform v);
    @Property(selector = "preferredVolume")
    public native float getPreferredVolume();
    @Property(selector = "setPreferredVolume:")
    public native void setPreferredVolume(float v);
    @Property(selector = "segments")
    public native NSArray<AVAssetTrackSegment> getSegments();
    @Property(selector = "setSegments:")
    public native void setSegments(NSArray<AVAssetTrackSegment> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    public boolean insertTimeRange(@ByVal CMTimeRange timeRange, AVAssetTrack track, @ByVal CMTime startTime) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = insertTimeRange(timeRange, track, startTime, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "insertTimeRange:ofTrack:atTime:error:")
    private native boolean insertTimeRange(@ByVal CMTimeRange timeRange, AVAssetTrack track, @ByVal CMTime startTime, NSError.NSErrorPtr outError);
    /**
     * @since Available in iOS 5.0 and later.
     */
    public boolean insertTimeRanges(@com.bugvm.rt.bro.annotation.Marshaler(CMTimeRange.AsValuedListMarshaler.class) List<CMTimeRange> timeRanges, NSArray<AVAssetTrack> tracks, @ByVal CMTime startTime) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = insertTimeRanges(timeRanges, tracks, startTime, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Method(selector = "insertTimeRanges:ofTracks:atTime:error:")
    private native boolean insertTimeRanges(@com.bugvm.rt.bro.annotation.Marshaler(CMTimeRange.AsValuedListMarshaler.class) List<CMTimeRange> timeRanges, NSArray<AVAssetTrack> tracks, @ByVal CMTime startTime, NSError.NSErrorPtr outError);
    @Method(selector = "insertEmptyTimeRange:")
    public native void insertEmptyTimeRange(@ByVal CMTimeRange timeRange);
    @Method(selector = "removeTimeRange:")
    public native void removeTimeRange(@ByVal CMTimeRange timeRange);
    @Method(selector = "scaleTimeRange:toDuration:")
    public native void scaleTimeRange(@ByVal CMTimeRange timeRange, @ByVal CMTime duration);
    public boolean validateTrackSegments(NSArray<AVCompositionTrackSegment> trackSegments) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = validateTrackSegments(trackSegments, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "validateTrackSegments:error:")
    private native boolean validateTrackSegments(NSArray<AVCompositionTrackSegment> trackSegments, NSError.NSErrorPtr outError);
    /*</methods>*/
}
