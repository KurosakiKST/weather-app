package com.ryan.weather.forecast.data.remote.dto;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lcom/ryan/weather/forecast/data/remote/dto/LocationDto;", "", "name", "", "region", "country", "localtimeEpoch", "", "localtime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getCountry", "()Ljava/lang/String;", "getLocaltime", "getLocaltimeEpoch", "()J", "getName", "getRegion", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "forecast_debug"})
public final class LocationDto {
    @com.google.gson.annotations.SerializedName(value = "name")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @com.google.gson.annotations.SerializedName(value = "region")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String region = null;
    @com.google.gson.annotations.SerializedName(value = "country")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String country = null;
    @com.google.gson.annotations.SerializedName(value = "localtime_epoch")
    private final long localtimeEpoch = 0L;
    @com.google.gson.annotations.SerializedName(value = "localtime")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String localtime = null;
    
    public LocationDto(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String region, @org.jetbrains.annotations.NotNull
    java.lang.String country, long localtimeEpoch, @org.jetbrains.annotations.NotNull
    java.lang.String localtime) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRegion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCountry() {
        return null;
    }
    
    public final long getLocaltimeEpoch() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLocaltime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    public final long component4() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ryan.weather.forecast.data.remote.dto.LocationDto copy(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String region, @org.jetbrains.annotations.NotNull
    java.lang.String country, long localtimeEpoch, @org.jetbrains.annotations.NotNull
    java.lang.String localtime) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}