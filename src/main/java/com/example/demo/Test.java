package com.example.demo;

public class Test {
    Generator generator;

    public Test(Generator generator) {
        this.generator = generator;
    }
    
    void generateFile() {
        generator.generate();
    }
}
