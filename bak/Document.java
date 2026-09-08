package org.example;

import java.util.ArrayList;

public class Document {
    public int width;
    public int height;
    private ArrayList<String> lines;
    private ArrayList<String> formatting;

    public ArrayList<String> getLines() {
        return lines;
    }
    public ArrayList<String> getFormatting() {
        return formatting;
    }

    public void addLine(String line, String formatting) {
        String[] Klines = line.split("\n");
        for(String K : Klines) {
            if(!K.equals("\n")) {
                this.lines.add(K);
                this.formatting.add(formatting);
            }
        }
    }

    public void ImportDocument(ArrayList<String> lines, ArrayList<String> formatting, int width, int height) {
        this.lines = lines;
        this.formatting = formatting;
        this.width = width;
        this.height = height;

    }

}