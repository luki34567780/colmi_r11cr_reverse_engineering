package com.amap.api.maps.model.particle;

/* loaded from: classes.dex */
public class ParticleOverLifeModule {
    private static final int TYPE_COLOR = 3;
    private static final int TYPE_ROTATE = 1;
    private static final int TYPE_SCALE = 2;
    private static final int TYPE_VEL = 0;
    private com.amap.api.maps.model.particle.ColorGenerate colorGenerate;
    private java.lang.Object colorGenerateObject;
    private com.amap.api.maps.model.particle.RotationOverLife rotateOverLife;
    private java.lang.Object rotateOverLifeObject;
    private com.amap.api.maps.model.particle.SizeOverLife sizeOverLife;
    private java.lang.Object sizeOverLifeObject;
    private java.lang.Object velocityOverLifeObject;
    private com.amap.api.maps.model.particle.VelocityGenerate overLife = null;
    private com.amap.api.maps.model.particle.VelocityGenerate velocityOverLife = null;
    private boolean isNeedReloadVelocityGenerate = false;
    private boolean isNeedReloadRotationOverLife = false;
    private boolean isNeedReloadSizeOverLife = false;
    private boolean isNeedReloadColorGenerate = false;

    public void setVelocityOverLife(com.amap.api.maps.model.particle.VelocityGenerate velocityGenerate) {
        this.overLife = velocityGenerate;
        this.velocityOverLife = velocityGenerate;
        this.velocityOverLifeObject = velocityGenerate;
        this.isNeedReloadVelocityGenerate = true;
    }

    public void setRotateOverLife(com.amap.api.maps.model.particle.RotationOverLife rotationOverLife) {
        this.rotateOverLife = rotationOverLife;
        this.rotateOverLifeObject = rotationOverLife;
        this.isNeedReloadRotationOverLife = true;
    }

    public void setSizeOverLife(com.amap.api.maps.model.particle.SizeOverLife sizeOverLife) {
        this.sizeOverLife = sizeOverLife;
        this.sizeOverLifeObject = sizeOverLife;
        this.isNeedReloadSizeOverLife = true;
    }

    public void setColorGenerate(com.amap.api.maps.model.particle.ColorGenerate colorGenerate) {
        this.colorGenerate = colorGenerate;
        this.colorGenerateObject = colorGenerate;
        this.isNeedReloadColorGenerate = true;
    }
}
