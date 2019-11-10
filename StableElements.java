import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

class StableElements{

    public static final int[][] EzElements = new int[][] {
            {130, 48, 182}, {130, 1132, 40}, {131, 80, 220}, {131, 1060, 0}, {131, 440, 550},
            {132, 160, 60}, {132, 480, 250}, {132, 0, 384}, {134, 864, 192}, {134, 964, 280},
            {134, 400, 750}, {134, 340, 680}, {135, 96, 0}, {135, 950, 770},
            {136, 864, 20}, {136, 1050, 758}, {136, 288, 750}, {137, 96, 48},
    };

    public static final int[][] DifElements = new int[][] {
            {130, 48, 252}, {130, 1152, 480}, {131, 80, 320}, {131, 1060, 0}, {131, 1152, 550},
            {131, 152, 790}, {132, 810, 432},  {132, 810, 432},{132, 605, 48}, {132, 110, 50},
            {134, 964, 330}, {134, 940, 600}, {134, 381, 121}, {132, 600, 790}, {134, 964, 330},
            {134, 320, 290}, {135, 1, 0}, {135, 750, 770}, {135, 200, 150}, {135, 50, 790},
            {136, 950, -10}, {136, 1050, 758}, {136, 358, 790}, {136, 190, 0}, {137, 48, 96}, {137, 260, 200}
    };
    public static void renderEz(GraphicsContext gc) {
        for (int i = 0; i < EzElements.length; i++) {
            gc.drawImage(new Image("file:E:\\java project\\Javafx\\AssetsKit_2\\PNG\\Retina\\towerDefense_tile" + EzElements[i][0] + ".png"), EzElements[i][1], EzElements[i][2], 96, 96);
        }
    }

    public static void renderDif(GraphicsContext gc) {
        for (int i = 0; i < DifElements.length; i++) {
            gc.drawImage(new Image("file:E:\\java project\\Javafx\\AssetsKit_2\\PNG\\Retina\\towerDefense_tile" + DifElements[i][0] + ".png"), DifElements[i][1], DifElements[i][2], 96, 96);
        }
    }
}
