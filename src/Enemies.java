import javafx.scene.SnapshotParameters;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

abstract class Enemies extends MovableObject{
    public static int eneX;
    public static int eneY;
    public static int WpX;

    int wayPointIndex = 0;
    BGroundManage BGObj = new BGroundManage();

    public Point getNextDifWayPoint() {
        if (wayPointIndex < BGObj.DifWayPoints.length - 1)
            return BGObj.DifWayPoints[++wayPointIndex];
        return null;
    }

    public Point getNextEzWayPoint() {
        if (wayPointIndex < BGObj.EzWayPoints.length - 1)
            return BGObj.EzWayPoints[++wayPointIndex];
        return null;
    }

    @Override
    abstract void render(GraphicsContext gc);

    void caculateDirection() {
        // Tim huong di tiepc theo cho Object
        if (GameTowerDefense.mapType == "dif") {
            if (wayPointIndex >= BGObj.DifWayPoints.length) {
                // Den dich
                return;
            }

            Point curWayPoint = BGObj.DifWayPoints[wayPointIndex];
            if (GameTowerDefense.distance(x, y, curWayPoint.x, curWayPoint.y) <= speed) {
                x = curWayPoint.x;
                y = curWayPoint.y;
                WpX = x;

                Point nextWayPoint = getNextDifWayPoint();
                if (nextWayPoint == null) return;
                double deltaX = nextWayPoint.x - x;
                double deltaY = nextWayPoint.y - y;
                if (deltaX > speed) direction = Direction.RIGHT;
                else if (deltaX < -speed) direction = Direction.LEFT;
                else if (deltaY > speed) direction = Direction.DOWN;
                else if (deltaY <= -speed) direction = Direction.UP;
            }
        }

        if (GameTowerDefense.mapType == "ez") {
            if (wayPointIndex >= BGObj.EzWayPoints.length) {
                // Den dich
                return;
            }

            Point curWayPoint = BGObj.EzWayPoints[wayPointIndex];
            if (GameTowerDefense.distance(x, y, curWayPoint.x, curWayPoint.y) <= speed) {
                x = curWayPoint.x;
                y = curWayPoint.y;
                WpX = x;

                Point nextWayPoint = getNextEzWayPoint();
                if (nextWayPoint == null) return;
                double deltaX = nextWayPoint.x - x;
                double deltaY = nextWayPoint.y - y;
                if (deltaX > speed) direction = Direction.RIGHT;
                else if (deltaX < -speed) direction = Direction.LEFT;
                else if (deltaY > speed) direction = Direction.DOWN;
                else if (deltaY <= -speed) direction = Direction.UP;
            }
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
