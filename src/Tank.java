import javafx.scene.SnapshotParameters;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class Tank extends Enemies {

    Image gunImg;

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

        //gc.setFill(Color.RED);
        //gc.fillOval(BGObj.DifWayPoints[wayPointIndex].x,BGObj.DifWayPoints[wayPointIndex].y,10, 10);

        //gc.setFill(Color.BLUE);
        //gc.fillOval(x, y,10, 10);
    }

    @Override
    void caculateDirection() {
        super.caculateDirection();
    }

    @Override
    void update() {
        super.update();
    }
}
