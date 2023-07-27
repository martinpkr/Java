package dev.lpa;

import java.util.Map;
enum Color {BLUE,RED,YELLOW}
enum PointMarker {CIRCLE,PIN,TRIANGLE,DOT,SQUARE}
enum LineMarker {DASHED,DOTTED,STRAIGHT}
public interface Mappable {

    String label();

    GeoType geoType();

    PointMarker iconType();

    String JSON_PROPERTY = """
            "properties": {%s} """;

    default String toJSON() {
        return (String.format(JSON_PROPERTY,  label().getClass().getName() + " " + geoType() + " " + iconType()));
    }
    static void printOut(Mappable mappable){
        System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
    }
}


