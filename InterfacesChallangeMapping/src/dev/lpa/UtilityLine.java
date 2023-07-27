package dev.lpa;

import java.util.Map;

public class UtilityLine implements Mappable {

    private String name;
    private String utility;

    @Override
    public String label() {
        return null;
    }

    @Override
    public GeoType geoType() {
        return GeoType.POLYGON;
    }

    @Override
    public PointMarker iconType() {
        return null;
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON();
    }
}
