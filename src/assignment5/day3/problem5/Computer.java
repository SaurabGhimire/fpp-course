package assignment5.day3.problem5;

import java.util.Objects;

public class Computer {
    String manufacturer;
    String processor;
    int ramSize;
    double processorSpeed;

    Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSize() {
        return ramSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    double computePower() {
        return ramSize * processorSpeed;
    }

    @Override
    public String toString() {
        return "Object Name: " + getClass().getSimpleName() +
                "Manufacturer: " + manufacturer + '\n' +
                "Processor: " + processor + '\n' +
                "RamSize: " + ramSize + '\n' +
                "Processor Speed: " + processorSpeed + '\n';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        else if (obj == null || this.getClass() != obj.getClass()) return false;
        Computer c = (Computer) obj;
        return Objects.equals(manufacturer, c.manufacturer) &&
                Objects.equals(processor, c.processor) &&
                ramSize == c.ramSize &&
                processorSpeed == c.processorSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, processor, ramSize, processorSpeed);
    }


}
