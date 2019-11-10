import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class BGroundManage {
    // Draw game start
    public void drawBackground(GraphicsContext gc) {
        gc.drawImage(new Image("file:E:\\java project\\Javafx\\images\\BackGround1.png"),0, 0, 96*16, 96*10);
        gc.drawImage(new Image("file:E:\\java project\\Javafx\\images\\StartButton.png"),900, 340);
    }

    // Draw map selection
    public void drawMapSelectionBackground(GraphicsContext gc) {
        gc.drawImage(new Image("file:E:\\java project\\Javafx\\images\\MapBackGround.png"),0, 0, 96*16, 96*10);
        gc.drawImage(new Image("file:E:\\java project\\Javafx\\images\\Easy_Map.png"),810, 150);
        gc.drawImage(new Image("file:E:\\java project\\Javafx\\images\\Difficult_Map.png"),810, 520);
        gc.drawImage(new Image("file:E:\\java project\\Javafx\\images\\backButton.png"), 15 * 96, 9 * 96, 96, 96);
    }

    // Draw map

    public final String[][] EZ_MAP_SPRITES = new String[][]{
            {"024", "024", "024", "003", "047", "047", "047", "004", "024", "024", "024", "024", "024", "267", "267", "267"},
            {"024", "024", "024", "025", "299", "001", "002", "023", "024", "024", "024", "024", "024", "267", "267", "267"},
            {"024", "024", "024", "025", "023", "024", "242", "240", "029", "029", "029", "029", "029", "267", "267", "267"},
            {"024", "024", "024", "025", "023", "024", "242", "240", "029", "029", "029", "029", "029", "267", "267", "267"},
            {"003", "047", "047", "048", "023", "024", "242", "240", "029", "029", "029", "029", "029", "267", "267", "267"},
            {"025", "299", "001", "001", "027", "024", "242", "240", "029", "029", "029", "029", "029", "223", "223", "223"},
            {"025", "023", "024", "024", "024", "024", "242", "263", "264", "264", "264", "264", "264", "223", "223", "223"},
            {"025", "023", "024", "024", "024", "024", "243", "218", "218", "218", "218", "218", "218", "223", "223", "223"},
            {"025", "023", "024", "024", "024", "024", "029", "029", "029", "029", "029", "029", "029", "223", "223", "223"},
            {"224", "224", "224", "224", "224", "224", "224", "224", "224", "224", "224", "224", "224", "224", "224", "224"}
    };

    public final Point[] EzWayPoints = new Point[] {
            new Point(0 * 96 + 48, 8 * 96 + 00),
            new Point(0 * 96 + 48, 4 * 96 + 48),
            new Point(3 * 96 + 48, 4 * 96 + 48),
            new Point(3 * 96 + 48, 0 * 96 + 48),
            new Point(7 * 96 - 48, 0 * 96 + 48),
            new Point(7 * 96 - 48, 7 * 96 - 48),
            new Point(13 * 96 + 00, 7 * 96 - 48),
    };

    public void drawEzMap(GraphicsContext gc) {
        for (int i = 0; i < EZ_MAP_SPRITES.length; i++) {
            for (int j = 0; j < EZ_MAP_SPRITES[i].length; j++) {
                gc.drawImage(new Image("file:E:\\java project\\Javafx\\AssetsKit_2\\PNG\\Retina\\towerDefense_tile" + EZ_MAP_SPRITES[i][j] + ".png"), j * 96, i * 96, 96, 96);
            }
        }
        renderEz(gc);
    }

    public final String[][] DIF_MAP_SPRITES = new String[][]{
            {"024", "024", "024", "024", "024", "024", "148", "149", "149", "149", "149", "149", "149", "223", "223", "223"},
            {"024", "024", "024", "024", "024", "024", "171", "159", "159", "159", "159", "159", "178", "223", "223", "223"},
            {"024", "024", "024", "024", "024", "024", "171", "159", "151", "195", "195", "195", "195", "223", "223", "223"},
            {"024", "024", "024", "024", "024", "024", "171", "159", "173", "193", "193", "193", "192", "223", "223", "223"},
            {"024", "024", "024", "024", "024", "024", "171", "159", "173", "193", "193", "193", "192", "267", "267", "267"},
            {"070", "070", "070", "070", "070", "070", "096", "093", "094", "193", "193", "193", "193", "267", "267", "267"},
            {"177", "093", "093", "093", "093", "093", "093", "093", "094", "193", "193", "192", "193", "267", "267", "267"},
            {"116", "116", "116", "116", "116", "116", "116", "116", "117", "193", "193", "192", "192", "267", "267", "267"},
            {"024", "024", "024", "024", "024", "024", "024", "024", "024", "024", "024", "024", "024", "267", "267", "267"},
            {"223", "223", "223", "223", "223", "223", "223", "223", "223", "223", "223", "223", "223", "223", "223", "223"}
    };
    public final Point[] DifWayPoints = new Point[] {
            new Point(0 * 96 + 48, 6 * 96 + 00),
            new Point(7 * 96 + 00, 6 * 96 + 00),
            new Point(7 * 96 + 00, 1 * 96 + 00),
            new Point(13 * 96 + 00, 1 * 96 + 00),
    };

    public void drawDifMap(GraphicsContext gc) {
        for (int i = 0; i < DIF_MAP_SPRITES.length; i++) {
            for (int j = 0; j < DIF_MAP_SPRITES[i].length; j++) {
                gc.drawImage(new Image("file:E:\\java project\\Javafx\\AssetsKit_2\\PNG\\Retina\\towerDefense_tile" + DIF_MAP_SPRITES[i][j] + ".png"), j * 96, i * 96, 96, 96);
            }
        }
        renderDif(gc);
    }

    //Draw game table

    public void drawGameTable(GraphicsContext gc) {
        gc.drawImage(new Image("file:E:\\java project\\Javafx\\images\\table.png"), 96 * 13, 0);
        gc.drawImage(new Image("file:E:\\java project\\Javafx\\AssetsKit_2\\PNG\\Retina\\MachineGunTower.png"), 96 * 13 + 23, 60, 90, 90);
        gc.drawImage(new Image("file:E:\\java project\\Javafx\\AssetsKit_2\\PNG\\Retina\\NormalTower.png"), 96 * 13 + 165, 60, 90, 90);
        gc.drawImage(new Image("file:E:\\java project\\Javafx\\AssetsKit_2\\PNG\\Retina\\SniperTower.png"), 96 * 13 + 23, 195, 90, 90);
        gc.drawImage(new Image("file:E:\\java project\\Javafx\\AssetsKit_2\\PNG\\Retina\\RocketTower.png"), 96 * 13 + 165, 195, 90, 90);
        gc.drawImage(new Image("file:E:\\java project\\Javafx\\images\\backButton.png"), 15 * 96, 96 * 9, 96, 96);
        gc.drawImage(new Image("file:E:\\java project\\Javafx\\images\\pauseButton.png"), 13 * 96 + 48, 96 * 9 + 5, 90, 90);
    }

    //Stable elements
    public final int[][] EzElements = new int[][] {
            {130, 48, 182}, {130, 1132, 40}, {131, 80, 220}, {131, 1060, 0}, {131, 440, 550},
            {132, 160, 60}, {132, 480, 250}, {132, 0, 384}, {134, 864, 192}, {134, 964, 280},
            {134, 400, 750}, {134, 340, 680}, {135, 96, 0}, {135, 950, 770},
            {136, 864, 20}, {136, 1050, 758}, {136, 288, 750}, {137, 96, 48},
    };

    public final int[][] DifElements = new int[][] {
            {130, 48, 252}, {130, 1152, 480}, {131, 80, 320}, {131, 1060, 0}, {131, 1152, 550},
            {131, 152, 790}, {132, 810, 432},  {132, 810, 432},{132, 605, 48}, {132, 110, 50},
            {134, 964, 330}, {134, 940, 600}, {134, 381, 121}, {132, 600, 790}, {134, 964, 330},
            {134, 320, 290}, {135, 1, 0}, {135, 750, 770}, {135, 200, 150}, {135, 50, 790},
            {136, 950, -10}, {136, 1050, 758}, {136, 358, 790}, {136, 190, 0}, {137, 48, 96}, {137, 260, 200}
    };
    public void renderEz(GraphicsContext gc) {
        for (int i = 0; i < EzElements.length; i++) {
            gc.drawImage(new Image("file:E:\\java project\\Javafx\\AssetsKit_2\\PNG\\Retina\\towerDefense_tile" + EzElements[i][0] + ".png"), EzElements[i][1], EzElements[i][2], 96, 96);
        }
    }

    public void renderDif(GraphicsContext gc) {
        for (int i = 0; i < DifElements.length; i++) {
            gc.drawImage(new Image("file:E:\\java project\\Javafx\\AssetsKit_2\\PNG\\Retina\\towerDefense_tile" + DifElements[i][0] + ".png"), DifElements[i][1], DifElements[i][2], 96, 96);
        }
    }
}
