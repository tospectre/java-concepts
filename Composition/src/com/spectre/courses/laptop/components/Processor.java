package com.spectre.udemycourses.laptop.components;

public class Processor {
    private String brand;
    private String series;
    private int generation;
    private int cores;
    private int threads;
    private String cacheMemory;

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    private String frequency;
    private String MinFrequency;
    private String MaxFrequency;

    public Processor() {
        this.brand = "Intel";
        this.series = "i7 7400k";
        this.generation = 7;
        this.cores = 6;
        this.threads = 12;
        this.cacheMemory = "6MB";
        this.frequency = "2.5Ghz";
        MinFrequency = "2.5Ghz";
        MaxFrequency = "3.9Ghz";
    }

    public Processor(String brand, String series, int generation, int cores, int threads, String cacheMemory, String frequency, String minFrequency, String maxFrequency) {
        this.brand = brand;
        this.series = series;
        this.generation = generation;
        this.cores = cores;
        this.threads = threads;
        this.cacheMemory = cacheMemory;
        this.frequency = frequency;
        MinFrequency = minFrequency;
        MaxFrequency = maxFrequency;
    }

    public String toString() {
        return "Processor{" +
                "brand='" + brand + '\'' +
                ", series='" + series + '\'' +
                ", generation=" + generation +
                ", cores=" + cores +
                ", threads=" + threads +
                ", cacheMemory='" + cacheMemory + '\'' +
                ", frequency='" + frequency + '\'' +
                ", MinFrequency='" + MinFrequency + '\'' +
                ", MaxFrequency='" + MaxFrequency + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getSeries() {
        return series;
    }

    public int getGeneration() {
        return generation;
    }

    public int getCores() {
        return cores;
    }

    public int getThreads() {
        return threads;
    }

    public String getCacheMemory() {
        return cacheMemory;
    }

    public String getFrequency() {
        return frequency;
    }

    public String getMinFrequency() {
        return MinFrequency;
    }

    public String getMaxFrequency() {
        return MaxFrequency;
    }
}
