package com.spectre.udemycourses.laptop;

import com.spectre.udemycourses.laptop.components.GraphicsCard;
import com.spectre.udemycourses.laptop.components.Processor;
import org.omg.PortableInterceptor.SUCCESSFUL;

public class Laptop {
    private float screen;
    private Processor processor;
    private GraphicsCard graphicsCard;
    private String ram;
    private String hardDrive;
    private String opticalFrive;
    private String keyboard;

    public Laptop() {
        this.screen = 15.6f;
        this.processor = new Processor();
        this.graphicsCard = new GraphicsCard();
        this.ram = "DDR4";
        this.hardDrive = "4TB";
        this.opticalFrive = "MLT Layer";
        this.keyboard = "Azerty";
    }

    public Laptop(float screen, Processor processor, GraphicsCard graphicsCard, String ram, String hardDrive, String opticalFrive, String keyboard) {
        this.screen = screen;
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.opticalFrive = opticalFrive;
        this.keyboard = keyboard;
    }

    public String toString() {
        return "Laptop{" +
                "screen=" + screen +
                ", processor=" + processor +
                ", graphicsCard=" + graphicsCard +
                ", ram='" + ram + '\'' +
                ", hardDrive='" + hardDrive + '\'' +
                ", opticalFrive='" + opticalFrive + '\'' +
                ", keyboard='" + keyboard + '\'' +
                '}';
    }

    public Processor getProcessor() {
        return processor;
    }

    public float getScreen() {
        return screen;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public String getRam() {
        return ram;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public String getOpticalFrive() {
        return opticalFrive;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public String gamingMod() {
        processor.setFrequency(processor.getMaxFrequency());
        return "Success";
    }
}
