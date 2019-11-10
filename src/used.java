public class used {
        /*public void drawBackground() {

        gc.drawImage(new Image("file:E:\\java project\\Javafx\\images\\BackGround1.png"),0, 0, 96*16, 96*10);
        gc.drawImage(new Image("file:E:\\java project\\Javafx\\images\\nen.png"),900, 340);
    }

    public void drawMapSelectionBackground() {
        gc.drawImage(new Image("file:E:\\java project\\Javafx\\images\\MapBackGround.png"),0, 0, 96*16, 96*10);
        gc.drawImage(new Image("file:E:\\java project\\Javafx\\images\\Easy_Map.png"),810, 150);
        gc.drawImage(new Image("file:E:\\java project\\Javafx\\images\\Difficult_Map.png"),810, 520);
    }

    public static final String[][] EZ_MAP_SPRITES = new String[][]{
            {"024", "024", "024", "003", "047", "047", "047", "004", "024", "024", "024", "024", "024", "267", "267", "267"},
            {"024", "024", "024", "025", "299", "001", "002", "023", "024", "024", "024", "024", "024", "267", "267", "267"},
            {"024", "024", "024", "025", "023", "024", "242", "240", "029", "029", "029", "029", "029", "267", "267", "267"},
            {"024", "024", "024", "025", "023", "024", "242", "240", "029", "029", "029", "029", "029", "267", "267", "267"},
            {"003", "047", "047", "048", "023", "024", "242", "240", "029", "029", "029", "029", "029", "267", "267", "267"},
            {"025", "299", "001", "001", "027", "024", "242", "240", "029", "029", "029", "029", "029", "223", "223", "223"},
            {"025", "023", "024", "024", "024", "024", "242", "263", "264", "264", "264", "264", "264", "223", "223", "223"},
            {"025", "023", "024", "024", "024", "024", "243", "218", "218", "218", "218", "218", "218", "223", "223", "223"},
            {"025", "023", "024", "024", "024", "024", "029", "029", "029", "029", "029", "029", "029", "223", "223", "223"},
            {"223", "223", "223", "223", "223", "223", "223", "223", "223", "223", "223", "223", "223", "223", "223", "223"}
    };

    public static final Point[] EzWayPoints = new Point[] {
            new Point(0 * 96 + 48, 8 * 96 + 00),
            new Point(0 * 96 + 48, 4 * 96 + 48),
            new Point(3 * 96 + 48, 4 * 96 + 48),
            new Point(3 * 96 + 48, 0 * 96 + 48),
            new Point(7 * 96 - 48, 0 * 96 + 48),
            new Point(7 * 96 - 48, 7 * 96 - 48),
            new Point(13 * 96 + 00, 7 * 96 - 48),
    };

    private void drawEzMap(GraphicsContext gc) {
        for (int i = 0; i < EZ_MAP_SPRITES.length; i++) {
            for (int j = 0; j < EZ_MAP_SPRITES[i].length; j++) {
                gc.drawImage(new Image("file:E:\\java project\\Javafx\\AssetsKit_2\\PNG\\Retina\\towerDefense_tile" + EZ_MAP_SPRITES[i][j] + ".png", requiredWidth, requiredHeight, false, true), j * 96, i * 96);
            }
        }
    }

    public static final String[][] DIF_MAP_SPRITES = new String[][]{
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
    public static final Point[] DifWayPoints = new Point[] {
            new Point(0 * 96 + 48, 6 * 96 + 00),
            new Point(7 * 96 + 00, 6 * 96 + 00),
            new Point(7 * 96 + 00, 1 * 96 + 00),
            new Point(13 * 96 + 00, 1 * 96 + 00),
    };

    private void drawDifMap(GraphicsContext gc) {
        for (int i = 0; i < DIF_MAP_SPRITES.length; i++) {
            for (int j = 0; j < DIF_MAP_SPRITES[i].length; j++) {
                gc.drawImage(new Image("file:E:\\java project\\Javafx\\AssetsKit_2\\PNG\\Retina\\towerDefense_tile" + DIF_MAP_SPRITES[i][j] + ".png", requiredWidth, requiredHeight, false, true), j * 96, i * 96);
            }
        }
    }

     */





    /*public void update(GraphicsContext gc) throws InterruptedException {
        AnimationTimer h = new AnimationTimer() {
            @Override
            public void handle(long l) {
                drawBackground(gc);
                drawEnity(gc);
            }

        };
        h.start();
        //Creating the mouse event handler
        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                System.out.println("kimochi");
            }
        };
    }

     */
        /*EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                double x = mouseEvent.getX();
                double y = mouseEvent.getY();

                if (mouseEvent.getClickCount() == 1 && x >= 900 && y >= 340 && x <= 1130 && y <= 449) {
                    drawMapSelectionBackground();
                    //timer.start();
                }
                if (mouseEvent.getClickCount() == 2) {
                    if (x >= 810 && y >= 150 && x <= 1290 && y <= 420) {
                        drawEzMap(gc);
                    }
                    if (x >= 810 && y >= 520 && x <= 1290 && y <= 790) {
                        drawDifMap(gc);
                    }
                }
            }
        };
        canvas.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);



        //Creating play button

        ImageView iv = new ImageView(new Image("file:E:\\java project\\Javafx\\images\\nen.png"));
        Button playButton = new Button("", iv);

        playButton.setLayoutX(900);
        playButton.setLayoutY(340);
        playButton.setMaxSize(230, 109);
        playButton.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                drawMapSelectionBackground();
                //timer.start();
            }
        }));
        //root.getChildren().add(playButton);

         */
        /*if (e.getEventType().equals(MouseEvent.MOUSE_PRESSED)) {
                // Select tower
                if (x >= 1271 && y >= 60 && x <= 1361 && y <= 150 && e.getEventType().equals(MouseEvent.MOUSE_MOVED)) {
                    while (!e.getEventType().equals(MouseEvent.MOUSE_RELEASED)) {
                        gc.drawImage(new Image("file:E:\\java project\\Javafx\\AssetsKit_2\\PNG\\Retina\\MachineGunTower.png"), x, y, 90, 90);
                    }
                }
            }*/
    /*Media media = new Media("E:\\java project\\Javafx\\images\\Sample_Trim.mp4");
        MediaPlayer thePlayer = new MediaPlayer(media);
        MediaView theView = new MediaView(thePlayer);

        thePlayer.setAutoPlay(true);
        root.getChildren().add(theView);*/
}
