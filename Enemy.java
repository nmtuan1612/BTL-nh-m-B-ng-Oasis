import javafx.scene.SnapshotParameters;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

class Enemy extends AttackableObject {
    public static int eneX;
    public static int eneY;
    public static int WpX;

    Image gunImg;

    int wayPointIndex = 0;
    public Point getNextWayPoint() {
        if (wayPointIndex < GameTowerDefense.wayPoints.length - 1)
            return GameTowerDefense.wayPoints[++wayPointIndex];
        return null;
    }

    @Override
    void render(GraphicsContext gc) {
        SnapshotParameters params = new SnapshotParameters();
        params.setFill(Color.TRANSPARENT);

        ImageView iv = new ImageView(img);
        iv.setRotate(this.direction.getDegree());
        Image base = iv.snapshot(params, null);

        ImageView iv2 = new ImageView(gunImg);
        iv2.setRotate(this.direction.getDegree());
        Image gun = iv2.snapshot(params, null);

        gc.drawImage(base, x, y, 96, 96);
        gc.drawImage(gun, x, y, 96, 96);

        gc.setFill(Color.RED);
        gc.fillOval(GameTowerDefense.wayPoints[wayPointIndex].x,GameTowerDefense.wayPoints[wayPointIndex].y,10, 10);

        gc.setFill(Color.BLUE);
        gc.fillOval(x, y,10, 10);

    }

    void caculateDirection() {
        // Tim huong di tiepc theo cho Object
        if (wayPointIndex >= GameTowerDefense.wayPoints.length) {
            // Den dich
            return;
        }

        Point curWayPoint = GameTowerDefense.wayPoints[wayPointIndex];
        if (GameTowerDefense.distance(x, y, curWayPoint.x, curWayPoint.y) <= speed) {
            x = curWayPoint.x;
            y = curWayPoint.y;
            WpX = x;

            Point nextWayPoint = getNextWayPoint();
            if (nextWayPoint == null) return;
            double deltaX = nextWayPoint.x - x;
            double deltaY = nextWayPoint.y - y;
            if (deltaX > speed) direction = Direction.RIGHT;
            else if (deltaX < -speed) direction = Direction.LEFT;
            else if (deltaY > speed) direction = Direction.DOWN;
            else if (deltaY <= -speed) direction = Direction.UP;
        }
    }

    @Override
    void update() {
        caculateDirection();

        switch (direction) {
            case UP:
                y -= speed;
                eneY = y;
                break;
            case DOWN:
                y += speed;
                eneY = y;
                break;
            case RIGHT:
                x += speed;
                eneX = x;
                break;
            case LEFT:
                x -= speed;
                eneX = x;
                break;
        }
    }

    public static int getX() {
        return eneX;
    }
    public static int getY() {
        return eneY;
    }
    public static int getWpX() {
        return WpX;
    }
}