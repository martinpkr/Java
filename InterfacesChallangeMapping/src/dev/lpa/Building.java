package dev.lpa;

import java.awt.*;

public class Building implements Mappable{

    private String name;
    private String usage;

    public Building(String name, String usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String label() {
        return name + " (" + usage + ")";
    }

    @Override
    public GeoType geoType() {
        return GeoType.POINT;
    }

    @Override
    public PointMarker iconType() {
        return PointMarker.DOT;
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON();

    }

}
