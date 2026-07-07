package com.realsil.sdk.core.bluetooth.scanner.compat;

/* loaded from: classes3.dex */
public final class CompatScanFilter implements android.os.Parcelable {
    public final java.lang.String a;
    public final java.lang.String b;
    public final int c;
    public final byte[] d;
    public final android.os.ParcelUuid e;
    public final android.os.ParcelUuid f;
    public final android.os.ParcelUuid g;
    public final android.os.ParcelUuid h;
    public final android.os.ParcelUuid i;
    public final byte[] j;
    public final byte[] k;
    public final int l;
    public final byte[] m;
    public final byte[] n;
    public static final com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter EMPTY = new com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter.Builder().build();
    public static final android.os.Parcelable.Creator<com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter> CREATOR = new android.os.Parcelable.Creator<com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter>() { // from class: com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter createFromParcel(android.os.Parcel parcel) {
            com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter.Builder builder = new com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter.Builder();
            if (parcel.readInt() == 1) {
                builder.setDeviceName(parcel.readString());
            }
            java.lang.String readString = parcel.readInt() == 1 ? parcel.readString() : null;
            if (parcel.readInt() == 1) {
                android.os.ParcelUuid parcelUuid = (android.os.ParcelUuid) parcel.readParcelable(android.os.ParcelUuid.class.getClassLoader());
                builder.setServiceUuid(parcelUuid);
                if (parcel.readInt() == 1) {
                    builder.setServiceUuid(parcelUuid, (android.os.ParcelUuid) parcel.readParcelable(android.os.ParcelUuid.class.getClassLoader()));
                }
            }
            if (parcel.readInt() == 1) {
                android.os.ParcelUuid parcelUuid2 = (android.os.ParcelUuid) parcel.readParcelable(android.os.ParcelUuid.class.getClassLoader());
                builder.setServiceSolicitationUuid(parcelUuid2);
                if (parcel.readInt() == 1) {
                    builder.setServiceSolicitationUuid(parcelUuid2, (android.os.ParcelUuid) parcel.readParcelable(android.os.ParcelUuid.class.getClassLoader()));
                }
            }
            if (parcel.readInt() == 1) {
                android.os.ParcelUuid parcelUuid3 = (android.os.ParcelUuid) parcel.readParcelable(android.os.ParcelUuid.class.getClassLoader());
                if (parcel.readInt() == 1) {
                    byte[] bArr = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr);
                    if (parcel.readInt() == 0) {
                        builder.setServiceData(parcelUuid3, bArr);
                    } else {
                        byte[] bArr2 = new byte[parcel.readInt()];
                        parcel.readByteArray(bArr2);
                        builder.setServiceData(parcelUuid3, bArr, bArr2);
                    }
                }
            }
            int readInt = parcel.readInt();
            if (parcel.readInt() == 1) {
                byte[] bArr3 = new byte[parcel.readInt()];
                parcel.readByteArray(bArr3);
                if (parcel.readInt() == 0) {
                    builder.setManufacturerData(readInt, bArr3);
                } else {
                    byte[] bArr4 = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr4);
                    builder.setManufacturerData(readInt, bArr3, bArr4);
                }
            }
            if (readString != null) {
                int readInt2 = parcel.readInt();
                if (parcel.readInt() == 1) {
                    byte[] bArr5 = new byte[16];
                    parcel.readByteArray(bArr5);
                    builder.a(readString, readInt2, bArr5);
                } else {
                    builder.setDeviceAddress(readString, readInt2);
                }
            }
            return builder.build();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter[] newArray(int i) {
            return new com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter[i];
        }
    };

    public CompatScanFilter(java.lang.String str, java.lang.String str2, android.os.ParcelUuid parcelUuid, android.os.ParcelUuid parcelUuid2, android.os.ParcelUuid parcelUuid3, android.os.ParcelUuid parcelUuid4, android.os.ParcelUuid parcelUuid5, byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4, int i2, byte[] bArr5) {
        this.a = str;
        this.e = parcelUuid;
        this.f = parcelUuid2;
        this.g = parcelUuid3;
        this.h = parcelUuid4;
        this.b = str2;
        this.i = parcelUuid5;
        this.j = bArr;
        this.k = bArr2;
        this.l = i;
        this.m = bArr3;
        this.n = bArr4;
        this.c = i2;
        this.d = bArr5;
    }

    public static boolean matchesPartialData(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr3 == null || bArr3.length < bArr.length) {
            return false;
        }
        if (bArr2 == null) {
            for (int i = 0; i < bArr.length; i++) {
                if (bArr3[i] != bArr[i]) {
                    return false;
                }
            }
            return true;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if ((bArr2[i2] & bArr3[i2]) != (bArr2[i2] & bArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public static boolean matchesServiceUuids(android.os.ParcelUuid parcelUuid, android.os.ParcelUuid parcelUuid2, java.util.List<android.os.ParcelUuid> list) {
        if (parcelUuid == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        for (android.os.ParcelUuid parcelUuid3 : list) {
            if (com.realsil.sdk.core.e.a.a(parcelUuid3.getUuid(), parcelUuid.getUuid(), parcelUuid2 == null ? null : parcelUuid2.getUuid())) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter.class != obj.getClass()) {
            return false;
        }
        com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter compatScanFilter = (com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter) obj;
        return java.util.Objects.equals(this.a, compatScanFilter.a) && java.util.Objects.equals(this.b, compatScanFilter.b) && this.l == compatScanFilter.l && java.util.Objects.deepEquals(this.m, compatScanFilter.m) && java.util.Objects.deepEquals(this.n, compatScanFilter.n) && java.util.Objects.equals(this.i, compatScanFilter.i) && java.util.Objects.deepEquals(this.j, compatScanFilter.j) && java.util.Objects.deepEquals(this.k, compatScanFilter.k) && java.util.Objects.equals(this.e, compatScanFilter.e) && java.util.Objects.equals(this.f, compatScanFilter.f) && java.util.Objects.equals(this.g, compatScanFilter.g) && java.util.Objects.equals(this.h, compatScanFilter.h);
    }

    public int getAddressType() {
        return this.c;
    }

    public java.lang.String getDeviceAddress() {
        return this.b;
    }

    public java.lang.String getDeviceName() {
        return this.a;
    }

    public byte[] getIrk() {
        return this.d;
    }

    public byte[] getManufacturerData() {
        return this.m;
    }

    public byte[] getManufacturerDataMask() {
        return this.n;
    }

    public int getManufacturerId() {
        return this.l;
    }

    public byte[] getServiceData() {
        return this.j;
    }

    public byte[] getServiceDataMask() {
        return this.k;
    }

    public android.os.ParcelUuid getServiceDataUuid() {
        return this.i;
    }

    public android.os.ParcelUuid getServiceSolicitationUuid() {
        return this.g;
    }

    public android.os.ParcelUuid getServiceSolicitationUuidMask() {
        return this.h;
    }

    public android.os.ParcelUuid getServiceUuid() {
        return this.e;
    }

    public android.os.ParcelUuid getServiceUuidMask() {
        return this.f;
    }

    public int hashCode() {
        return java.util.Objects.hash(this.a, this.b, java.lang.Integer.valueOf(this.l), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.m)), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.n)), this.i, java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.j)), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.k)), this.e, this.f, this.g, this.h);
    }

    public boolean isAllFieldsEmpty() {
        return EMPTY.equals(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0096 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean matches(android.bluetooth.le.ScanResult r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            android.bluetooth.BluetoothDevice r1 = r9.getDevice()
            java.lang.String r2 = r8.b
            if (r2 == 0) goto L19
            if (r1 == 0) goto L18
            java.lang.String r1 = r1.getAddress()
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L19
        L18:
            return r0
        L19:
            android.bluetooth.le.ScanRecord r9 = r9.getScanRecord()
            if (r9 != 0) goto L34
            java.lang.String r1 = r8.a
            if (r1 != 0) goto L33
            android.os.ParcelUuid r1 = r8.e
            if (r1 != 0) goto L33
            byte[] r1 = r8.m
            if (r1 != 0) goto L33
            byte[] r1 = r8.j
            if (r1 != 0) goto L33
            android.os.ParcelUuid r1 = r8.g
            if (r1 == 0) goto L34
        L33:
            return r0
        L34:
            java.lang.String r1 = r8.a
            if (r1 == 0) goto L43
            java.lang.String r2 = r9.getDeviceName()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L43
            return r0
        L43:
            android.os.ParcelUuid r1 = r8.e
            if (r1 == 0) goto L54
            android.os.ParcelUuid r2 = r8.f
            java.util.List r3 = r9.getServiceUuids()
            boolean r1 = matchesServiceUuids(r1, r2, r3)
            if (r1 != 0) goto L54
            return r0
        L54:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            r3 = 1
            if (r1 < r2) goto L97
            android.os.ParcelUuid r1 = r8.g
            if (r1 == 0) goto L97
            android.os.ParcelUuid r2 = r8.h
            java.util.List r4 = r9.getServiceSolicitationUuids()
            if (r1 != 0) goto L68
            goto L91
        L68:
            if (r4 != 0) goto L6b
            goto L93
        L6b:
            java.util.Iterator r4 = r4.iterator()
        L6f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L93
            java.lang.Object r5 = r4.next()
            android.os.ParcelUuid r5 = (android.os.ParcelUuid) r5
            if (r2 != 0) goto L7f
            r6 = 0
            goto L83
        L7f:
            java.util.UUID r6 = r2.getUuid()
        L83:
            java.util.UUID r7 = r1.getUuid()
            java.util.UUID r5 = r5.getUuid()
            boolean r5 = com.realsil.sdk.core.e.a.a(r5, r7, r6)
            if (r5 == 0) goto L6f
        L91:
            r1 = 1
            goto L94
        L93:
            r1 = 0
        L94:
            if (r1 != 0) goto L97
            return r0
        L97:
            android.os.ParcelUuid r1 = r8.i
            if (r1 == 0) goto Lac
            if (r9 == 0) goto Lac
            byte[] r2 = r8.j
            byte[] r4 = r8.k
            byte[] r1 = r9.getServiceData(r1)
            boolean r1 = matchesPartialData(r2, r4, r1)
            if (r1 != 0) goto Lac
            return r0
        Lac:
            int r1 = r8.l
            if (r1 < 0) goto Lc1
            if (r9 == 0) goto Lc1
            byte[] r2 = r8.m
            byte[] r4 = r8.n
            byte[] r9 = r9.getManufacturerSpecificData(r1)
            boolean r9 = matchesPartialData(r2, r4, r9)
            if (r9 != 0) goto Lc1
            return r0
        Lc1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter.matches(android.bluetooth.le.ScanResult):boolean");
    }

    public java.lang.String toString() {
        java.lang.StringBuilder a = com.realsil.sdk.core.a.a.a("BluetoothLeScanFilter [mDeviceName=");
        a.append(this.a);
        a.append(", mDeviceAddress=");
        a.append(com.realsil.sdk.core.bluetooth.utils.BluetoothHelper.formatAddress(this.b, true));
        a.append(", mUuid=");
        a.append(this.e);
        a.append(", mUuidMask=");
        a.append(this.f);
        a.append(", mServiceSolicitationUuid=");
        a.append(this.g);
        a.append(", mServiceSolicitationUuidMask=");
        a.append(this.h);
        a.append(", mServiceDataUuid=");
        a.append(java.util.Objects.toString(this.i));
        a.append(", mServiceData=");
        a.append(java.util.Arrays.toString(this.j));
        a.append(", mServiceDataMask=");
        a.append(java.util.Arrays.toString(this.k));
        a.append(", mManufacturerId=");
        a.append(this.l);
        a.append(", mManufacturerData=");
        a.append(java.util.Arrays.toString(this.m));
        a.append(", mManufacturerDataMask=");
        a.append(java.util.Arrays.toString(this.n));
        a.append("]");
        return a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a == null ? 0 : 1);
        java.lang.String str = this.a;
        if (str != null) {
            parcel.writeString(str);
        }
        parcel.writeInt(this.b == null ? 0 : 1);
        java.lang.String str2 = this.b;
        if (str2 != null) {
            parcel.writeString(str2);
        }
        parcel.writeInt(this.e == null ? 0 : 1);
        android.os.ParcelUuid parcelUuid = this.e;
        if (parcelUuid != null) {
            parcel.writeParcelable(parcelUuid, i);
            parcel.writeInt(this.f == null ? 0 : 1);
            android.os.ParcelUuid parcelUuid2 = this.f;
            if (parcelUuid2 != null) {
                parcel.writeParcelable(parcelUuid2, i);
            }
        }
        parcel.writeInt(this.g == null ? 0 : 1);
        android.os.ParcelUuid parcelUuid3 = this.g;
        if (parcelUuid3 != null) {
            parcel.writeParcelable(parcelUuid3, i);
            parcel.writeInt(this.h == null ? 0 : 1);
            android.os.ParcelUuid parcelUuid4 = this.h;
            if (parcelUuid4 != null) {
                parcel.writeParcelable(parcelUuid4, i);
            }
        }
        parcel.writeInt(this.i == null ? 0 : 1);
        android.os.ParcelUuid parcelUuid5 = this.i;
        if (parcelUuid5 != null) {
            parcel.writeParcelable(parcelUuid5, i);
            parcel.writeInt(this.j == null ? 0 : 1);
            byte[] bArr = this.j;
            if (bArr != null) {
                parcel.writeInt(bArr.length);
                parcel.writeByteArray(this.j);
                parcel.writeInt(this.k == null ? 0 : 1);
                byte[] bArr2 = this.k;
                if (bArr2 != null) {
                    parcel.writeInt(bArr2.length);
                    parcel.writeByteArray(this.k);
                }
            }
        }
        parcel.writeInt(this.l);
        parcel.writeInt(this.m == null ? 0 : 1);
        byte[] bArr3 = this.m;
        if (bArr3 != null) {
            parcel.writeInt(bArr3.length);
            parcel.writeByteArray(this.m);
            parcel.writeInt(this.n == null ? 0 : 1);
            byte[] bArr4 = this.n;
            if (bArr4 != null) {
                parcel.writeInt(bArr4.length);
                parcel.writeByteArray(this.n);
            }
        }
        if (this.b != null) {
            parcel.writeInt(this.c);
            parcel.writeInt(this.d != null ? 1 : 0);
            byte[] bArr5 = this.d;
            if (bArr5 != null) {
                parcel.writeByteArray(bArr5);
            }
        }
    }

    public static final class Builder {
        public static final int LEN_IRK_OCTETS = 16;
        public java.lang.String a;
        public java.lang.String b;
        public byte[] d;
        public android.os.ParcelUuid e;
        public android.os.ParcelUuid f;
        public android.os.ParcelUuid g;
        public android.os.ParcelUuid h;
        public android.os.ParcelUuid i;
        public byte[] j;
        public byte[] k;
        public byte[] m;
        public byte[] n;
        public int c = 0;
        public int l = -1;

        public final com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter.Builder a(java.lang.String str, int i, byte[] bArr) {
            if (!android.bluetooth.BluetoothAdapter.checkBluetoothAddress(str)) {
                throw new java.lang.IllegalArgumentException("invalid device address " + str);
            }
            if (i < 0 || i > 1) {
                throw new java.lang.IllegalArgumentException("'addressType' is invalid!");
            }
            if (i == 1 && bArr != null && !com.realsil.sdk.core.b.a.a(str)) {
                throw new java.lang.IllegalArgumentException("Invalid combination: IRK requires either a PUBLIC or RANDOM (STATIC) Address");
            }
            this.b = str;
            this.c = i;
            this.d = bArr;
            return this;
        }

        public com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter build() {
            return new com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter(this.a, this.b, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.c, this.d);
        }

        public com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter.Builder setDeviceAddress(java.lang.String str) {
            if (str != null) {
                return setDeviceAddress(str, 0);
            }
            this.b = str;
            return this;
        }

        public com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter.Builder setDeviceName(java.lang.String str) {
            this.a = str;
            return this;
        }

        public com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter.Builder setManufacturerData(int i, byte[] bArr) {
            if (bArr != null && i < 0) {
                throw new java.lang.IllegalArgumentException("invalid manufacture id");
            }
            this.l = i;
            this.m = bArr;
            this.n = null;
            return this;
        }

        public com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter.Builder setServiceData(android.os.ParcelUuid parcelUuid, byte[] bArr) {
            if (parcelUuid == null) {
                throw new java.lang.IllegalArgumentException("serviceDataUuid is null");
            }
            this.i = parcelUuid;
            this.j = bArr;
            this.k = null;
            return this;
        }

        public com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter.Builder setServiceSolicitationUuid(android.os.ParcelUuid parcelUuid) {
            this.g = parcelUuid;
            if (parcelUuid == null) {
                this.h = null;
            }
            return this;
        }

        public com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter.Builder setServiceUuid(android.os.ParcelUuid parcelUuid) {
            this.e = parcelUuid;
            this.f = null;
            return this;
        }

        public com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter.Builder setServiceUuid(android.os.ParcelUuid parcelUuid, android.os.ParcelUuid parcelUuid2) {
            if (this.f != null && this.e == null) {
                throw new java.lang.IllegalArgumentException("uuid is null while uuidMask is not null!");
            }
            this.e = parcelUuid;
            this.f = parcelUuid2;
            return this;
        }

        public com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter.Builder setServiceSolicitationUuid(android.os.ParcelUuid parcelUuid, android.os.ParcelUuid parcelUuid2) {
            if (parcelUuid2 != null && parcelUuid == null) {
                throw new java.lang.IllegalArgumentException("SolicitationUuid is null while SolicitationUuidMask is not null!");
            }
            this.g = parcelUuid;
            this.h = parcelUuid2;
            return this;
        }

        public com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter.Builder setDeviceAddress(java.lang.String str, int i) {
            return a(str, i, null);
        }

        public com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter.Builder setServiceData(android.os.ParcelUuid parcelUuid, byte[] bArr, byte[] bArr2) {
            if (parcelUuid != null) {
                byte[] bArr3 = this.k;
                if (bArr3 != null) {
                    byte[] bArr4 = this.j;
                    if (bArr4 != null) {
                        if (bArr4.length != bArr3.length) {
                            throw new java.lang.IllegalArgumentException("size mismatch for service data and service data mask");
                        }
                    } else {
                        throw new java.lang.IllegalArgumentException("serviceData is null while serviceDataMask is not null");
                    }
                }
                this.i = parcelUuid;
                this.j = bArr;
                this.k = bArr2;
                return this;
            }
            throw new java.lang.IllegalArgumentException("serviceDataUuid is null");
        }

        public com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter.Builder setManufacturerData(int i, byte[] bArr, byte[] bArr2) {
            if (bArr != null && i < 0) {
                throw new java.lang.IllegalArgumentException("invalid manufacture id");
            }
            byte[] bArr3 = this.n;
            if (bArr3 != null) {
                byte[] bArr4 = this.m;
                if (bArr4 != null) {
                    if (bArr4.length != bArr3.length) {
                        throw new java.lang.IllegalArgumentException("size mismatch for manufacturerData and manufacturerDataMask");
                    }
                } else {
                    throw new java.lang.IllegalArgumentException("manufacturerData is null while manufacturerDataMask is not null");
                }
            }
            this.l = i;
            this.m = bArr;
            this.n = bArr2;
            return this;
        }
    }
}
