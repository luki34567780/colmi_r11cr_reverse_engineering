package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class WeatherForecastReq extends com.oudmon.ble.base.communication.req.MixtureReq {
    private WeatherForecastReq() {
        super(com.oudmon.ble.base.communication.Constants.CMD_SEND_WEATHER_FORECAST);
    }

    public static com.oudmon.ble.base.communication.req.WeatherForecastReq getWriteInstance(com.oudmon.ble.base.communication.req.WeatherForecastReq.WeatherForecastBuilder weatherForecastBuilder) {
        return new com.oudmon.ble.base.communication.req.WeatherForecastReq() { // from class: com.oudmon.ble.base.communication.req.WeatherForecastReq.1
            {
                super();
                this.subData = new byte[10];
                this.subData[0] = (byte) com.oudmon.ble.base.communication.req.WeatherForecastReq.WeatherForecastBuilder.this.index;
                java.lang.System.arraycopy(com.oudmon.ble.base.communication.utils.DataParseUtils.intToByteArray((int) com.oudmon.ble.base.communication.req.WeatherForecastReq.WeatherForecastBuilder.this.timeStamp), 0, this.subData, 1, 4);
                this.subData[5] = (byte) com.oudmon.ble.base.communication.req.WeatherForecastReq.WeatherForecastBuilder.this.weatherType;
                this.subData[6] = (byte) com.oudmon.ble.base.communication.req.WeatherForecastReq.WeatherForecastBuilder.this.minDegree;
                this.subData[7] = (byte) com.oudmon.ble.base.communication.req.WeatherForecastReq.WeatherForecastBuilder.this.maxDegree;
                this.subData[8] = (byte) com.oudmon.ble.base.communication.req.WeatherForecastReq.WeatherForecastBuilder.this.humidity;
                this.subData[9] = (byte) (com.oudmon.ble.base.communication.req.WeatherForecastReq.WeatherForecastBuilder.this.takeUmbrella ? 1 : 2);
            }
        };
    }

    public static class WeatherForecastBuilder {
        private int humidity;
        private int index;
        private int maxDegree;
        private int minDegree;
        private boolean takeUmbrella;
        private long timeStamp;
        private int weatherType;

        public com.oudmon.ble.base.communication.req.WeatherForecastReq.WeatherForecastBuilder setIndex(int i) {
            this.index = i;
            return this;
        }

        public com.oudmon.ble.base.communication.req.WeatherForecastReq.WeatherForecastBuilder setTimeStamp(long j) {
            this.timeStamp = j;
            return this;
        }

        public com.oudmon.ble.base.communication.req.WeatherForecastReq.WeatherForecastBuilder setWeatherType(int i) {
            this.weatherType = i;
            return this;
        }

        public com.oudmon.ble.base.communication.req.WeatherForecastReq.WeatherForecastBuilder setMinDegree(int i) {
            this.minDegree = i;
            return this;
        }

        public com.oudmon.ble.base.communication.req.WeatherForecastReq.WeatherForecastBuilder setMaxDegree(int i) {
            this.maxDegree = i;
            return this;
        }

        public com.oudmon.ble.base.communication.req.WeatherForecastReq.WeatherForecastBuilder setHumidity(int i) {
            this.humidity = i;
            return this;
        }

        public com.oudmon.ble.base.communication.req.WeatherForecastReq.WeatherForecastBuilder setTakeUmbrella(boolean z) {
            this.takeUmbrella = z;
            return this;
        }

        public java.lang.String toString() {
            return "WeatherForecastBuilder{index=" + this.index + ", timeStamp=" + this.timeStamp + ", weatherType=" + this.weatherType + ", minDegree=" + this.minDegree + ", maxDegree=" + this.maxDegree + ", humidity=" + this.humidity + ", takeUmbrella=" + this.takeUmbrella + '}';
        }
    }
}
