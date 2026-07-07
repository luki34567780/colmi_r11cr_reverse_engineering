package com.realsil.sdk.bbpro.apt;

/* loaded from: /tmp/dex/classes2.dex */
public final class GetAptVolumeInfoReq extends com.realsil.sdk.bbpro.profile.AppReq {
    public int a;

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode(int i) {
        return encode();
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getCommandId() {
        return (short) 3118;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getEventId() {
        return (short) 3118;
    }

    public java.lang.String toString() {
        return java.lang.String.format("GetAptVolumeInfoReq(volumeSpecVersion=0x%04X) {", java.lang.Integer.valueOf(this.a)) + "\n}";
    }

    public static class Builder {
        public int a;

        public Builder() {
            this.a = 3;
        }

        public com.realsil.sdk.bbpro.apt.GetAptVolumeInfoReq build() {
            return new com.realsil.sdk.bbpro.apt.GetAptVolumeInfoReq(this.a);
        }

        public Builder(int i) {
            this.a = i;
        }
    }

    public GetAptVolumeInfoReq(int i) {
        this.a = i;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode() {
        int i = this.a;
        return i == 1 ? new com.realsil.sdk.bbpro.profile.GetStatusReq.Builder((byte) 7).build().encode() : i == 2 ? new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet((short) 527, null).eventId((short) 517).build() : i == 3 ? new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet((short) 3118, null).eventId((short) 3118).build() : new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet((short) 3118, null).eventId((short) 3118).build();
    }
}
