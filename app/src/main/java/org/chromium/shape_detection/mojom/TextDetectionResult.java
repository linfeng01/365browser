
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/shape_detection/public/interfaces/textdetection.mojom
//

package org.chromium.shape_detection.mojom;

import org.chromium.base.annotations.SuppressFBWarnings;
import org.chromium.mojo.bindings.DeserializationException;


public final class TextDetectionResult extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 24;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public String rawValue;
    public org.chromium.gfx.mojom.RectF boundingBox;

    private TextDetectionResult(int version) {
        super(STRUCT_SIZE, version);
    }

    public TextDetectionResult() {
        this(0);
    }

    public static TextDetectionResult deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static TextDetectionResult deserialize(java.nio.ByteBuffer data) {
        if (data == null)
            return null;

        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static TextDetectionResult decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        TextDetectionResult result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            result = new TextDetectionResult(mainDataHeader.elementsOrVersion);
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.rawValue = decoder0.readString(8, false);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.boundingBox = org.chromium.gfx.mojom.RectF.decode(decoder1);
            }
        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(rawValue, 8, false);
        
        encoder0.encode(boundingBox, 16, false);
    }

    /**
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(Object object) {
        if (object == this)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        TextDetectionResult other = (TextDetectionResult) object;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.rawValue, other.rawValue))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.boundingBox, other.boundingBox))
            return false;
        return true;
    }

    /**
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = prime + getClass().hashCode();
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(rawValue);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(boundingBox);
        return result;
    }
}