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

    public static String wrap(String line, int width) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < line.length(); i += width) {
            int end = Math.min(i + width, line.length());
            sb.append(line.substring(i, end)).append("\n");
        }
        return sb.toString();
    }

    
    public void addLine(String line, String formatting) {
        // MacBook neo
        if(line.length() > width) {
            //line = wrap(line, width);
        }
        //end
        for(int Q = 0; Q < height; Q++) {
            if(lines.get(Q).equals("")) {
                String[] lineArray = line.split("\n");
                this.lines.set(Q, lineArray[0]);
                this.formatting.set(Q, formatting);
                break;
            }
        }
    }

    public void ImportDocument(ArrayList<String> lines, ArrayList<String> formatting, int width, int height) {
        this.lines = lines;
        for(int Q = 0; Q < height; Q++) {
            this.lines.add("");
        }
        this.formatting = formatting;
        for(int Q = 0; Q < height; Q++) {
            this.formatting.add("left");
        }
        this.width = width;
        this.height = height;

    }

}