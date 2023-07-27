package dev.lpa;

public class PlantExaminer<T> {

    T plant;

    public PlantExaminer(T plant) {
        this.plant = plant;
    }

    public void examine(){
        System.out.println(plant.getClass().getSimpleName() + plant);
        if(plant instanceof Rose rose){
            rose.printSmell();
        }
    }
}
