package dev.lpa;

enum Color {BLUE, RED, YELLOW}

enum PointMarker {CIRCLE, PIN, TRIANGLE, DOT, SQUARE}

enum LineMarker {DASHED, DOTTED, STRAIGHT}

public interface Mappable {

    String JSON_PROPERTY = """
            "properties": {%s} """;

    static void printOut(Mappable mappable) {
        System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
    }

    String label();

    GeoType geoType();

    PointMarker iconType();

    default String toJSON() {
        return (String.format(JSON_PROPERTY, label().getClass().getName() + " " + geoType() + " " + iconType()));
    }
}


