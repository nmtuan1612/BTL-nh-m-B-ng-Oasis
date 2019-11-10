import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.List;


public class GameTowerDefense extends Application {

    GraphicsContext gc;
    List<GameObject> gameObjects = new ArrayList<>();


    public static void main(String[] args) {
        launch(args);
    }
    static String mapType = null;
    boolean move = false;

    BGroundManage BGObj = new BGroundManage();
    @Override
    public void start(Stage stage) throws InterruptedException {
        stage.setTitle("Drawing Operations Test");
        // Tao Canvas
        Canvas canvas = new Canvas(96 * 16, 96 * 10);
        gc = canvas.getGraphicsContext2D();

        // Tao root
        Group root = new Group();
        root.getChildren().add(canvas);

        // Tao sence va them vao stage
        Scene scene = new Scene(root);
        stage.setScene(scene);

        // GameBackground
        BGObj.drawBackground(gc);

        stage.show();
        System.out.println("kimochi");

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                render();
                update();
                BGObj.drawGameTable(gc);
            }
        };

        //Creating event handler
        canvas.addEventHandler(MouseEvent.ANY, e -> {
            double x = e.getX();
            double y = e.getY();
            //if (move && x >= 900 && y >= 340 && x <= 1130 && y <= 449) {
            //    gc.drawImage(new Image("file:E:\\java project\\Javafx\\images\\enteredStart.png"),900, 340);
            //}
            if (e.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {

                // Selection map button
                if (e.getClickCount() == 1 && x >= 900 && y >= 340 && x <= 1130 && y <= 449) {
                    move = true;
                    BGObj.drawMapSelectionBackground(gc);
                }
                // Back button
                if (!move && e.getClickCount() == 1 && x >= 1440 && y >= 864 && x <= 1536 && y <= 960) {
                    timer.stop();
                    BGObj.drawBackground(gc);
                }
                // Pause button
                if (e.getClickCount() == 1 && x >= 1296 && y >= 864 && x <= 1536 && y <= 960) {
                    timer.stop();
                }
                // Select map
                if (e.getClickCount() == 2) {
                    if (x >= 810 && y >= 150 && x <= 1290 && y <= 420) {
                        BGObj.drawEzMap(gc);
                        gameObjects.add(createEzTank());
                        gameObjects.add(createMachineGunTower());
                        mapType = "ez";
                        timer.start();
                    }
                    if (x >= 810 && y >= 520 && x <= 1290 && y <= 790) {
                        BGObj.drawDifMap(gc);
                        mapType = "dif";
                        gameObjects.add(createDifTank());
                        gameObjects.add(createMachineGunTower());
                        timer.start();
                    }
                }
            }
        });
        //gameObjects.add(createMachineGunTower());
        //gameObjects.add(createSoldier());

    }

    // TODO: Factory Method
    public MachineGunTower createMachineGunTower() {
        MachineGunTower mgTower = new MachineGunTower();
        mgTower.i = 2;
        mgTower.j = 2;
        mgTower.x = mgTower.i * 96;
        mgTower.y = mgTower.j * 96;
        mgTower.fireRange = 150;
        //mgTower.direction = Direction.DOWN;
        mgTower.gunRotation = 90;
        mgTower.img = new Image("file:E:\\java project\\Javafx\\AssetsKit_2\\PNG\\Retina\\towerDefense_tile181.png");
        mgTower.gunImg = new Image("file:E:\\java project\\Javafx\\AssetsKit_2\\PNG\\Retina\\towerDefense_tile249.png");
        return mgTower;
    }

    public Tank createDifTank() {
        Tank tank = new Tank();
        tank.i = 0;
        tank.j = 6;
        tank.x = tank.i * 96 + 48;
        tank.y = tank.j * 96;
        tank.speed = 10;
        tank.direction = Direction.RIGHT;
        tank.img = new Image("file:E:\\java project\\Javafx\\AssetsKit_2\\PNG\\Retina\\towerDefense_tile269.png");
        tank.gunImg = new Image("file:E:\\java project\\Javafx\\AssetsKit_2\\PNG\\Retina\\towerDefense_tile292.png");
        return tank;
    }

    public Tank createEzTank() {
        Tank tank = new Tank();
        tank.i = 0;
        tank.j = 8;
        tank.x = tank.i * 96 + 48;
        tank.y = tank.j * 96;
        tank.speed = 8;
        tank.direction = Direction.UP;
        tank.img = new Image("file:E:\\java project\\Javafx\\AssetsKit_2\\PNG\\Retina\\towerDefense_tile269.png");
        tank.gunImg = new Image("file:E:\\java project\\Javafx\\AssetsKit_2\\PNG\\Retina\\towerDefense_tile292.png");
        return tank;
    }

    public Soldier createSoldier() {
        Soldier soldier = new Soldier();
        soldier.i = 0;
        soldier.j = 8;
        soldier.x = soldier.i * 96 +48;
        soldier.y = soldier.j * 96;
        soldier.direction = Direction.UP;
        soldier.speed = 5;
        soldier.img = new Image("file:E:\\java project\\Javafx\\AssetsKit_2\\PNG\\Retina\\towerDefense_tile245.png");
        return soldier;
    }

    public void render() {
        if (mapType == "ez") { BGObj.drawEzMap(gc);}
        if (mapType == "dif") { BGObj.drawDifMap(gc);}
        gameObjects.forEach(g -> g.render(gc));
        /*
        for (GameObject g : gameObjects) {
            g.render(gc);
        }
         */
    }

    public void update() {
        gameObjects.forEach(GameObject::update);
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}

enum Direction {
    LEFT(180), RIGHT(0), DOWN(90), UP(270);

    int degree;
    Direction(int i) {
        degree = i;
    }

    int getDegree() {
        return degree;
    }
}
