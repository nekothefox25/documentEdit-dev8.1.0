package org.example;

public class Engine {
    public static void printDocument(Document document) {
        int index = 0;
        int width = document.width;
        int height = document.getLines().size() - 1;
        for(int i = 0; i <= height; i++) {
            System.out.print("|");
            String formmating = document.getFormatting().get(i);
            switch(formmating) {
                case "left":
                    int ds = document.getLines().get(index).length() - 1;
                    int lineWhiteSpace = width - ds;
                    System.out.print(document.getLines().get(index));
                    for(int j = 0; j < lineWhiteSpace; j++) {
                        System.out.print(" ");
                    }
                    System.out.println("|");
                    index++;
                    break;
                    case "right":
                        int sd = document.getLines().get(index).length() - 1;
                        int whiteSpace = width - sd;
                        for(int j = 0; j < whiteSpace; j++) {
                            System.out.print(" ");
                        }
                        System.out.print(document.getLines().get(index));
                        System.out.println("|");
                        index++;
                        break;
                        case "center":
                            int lineLength = document.getLines().get(index).length() - 1;
                            int start = width / lineLength;
                            int end = width - start - lineLength;
                            for(int H = 0; H < start; H++) {
                                System.out.print(" ");
                            }
                            System.out.print(document.getLines().get(index));
                            for(int H = 0; H < end; H++) {
                                System.out.print(" ");
                            }
                            System.out.println("|");
                            index++;


            }
        }
    }
}
