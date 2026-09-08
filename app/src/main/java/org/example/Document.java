package org.example;
import java.io.Serializable;

import java.util.ArrayList;

public class Document implements Serializable {
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
            line = wrap(line, width);
        }
        //end
        int q = 0;
        String[] lineArray = line.split("\n");
        for(String segment : lineArray) {
            while(q < height && !lines.get(q).equals("")) {
                q++;
            }
            if(q >= height) {
                break;
            }

            this.lines.set(q, segment);
            this.formatting.set(q, formatting);
            q++;
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