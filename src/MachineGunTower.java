import javafx.scene.SnapshotParameters;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

class MachineGunTower extends AttackableObject {
    Image gunImg;
    double gunRotation;
    //double gunX = x, gunY = y;

    @Override
    void render(GraphicsContext gc) {
        SnapshotParameters params = new SnapshotParameters();
        params.setFill(Color.TRANSPARENT);

        ImageView iv = new ImageView(gunImg);
        iv.setRotate(gunRotation);

        Image gun = iv.snapshot(params, null);

        gc.drawImage(img, x, y, 96, 96);
        gc.drawImage(gun, x, y, 96, 96);
    }

    @Override
    void update() {

        int eneX = Tank.getX();
        int eneY = Tank.getY();
        System.out.println(eneX+ "," + eneY);
        int tdX = x + 96 * 2, tdY = y + 48;
        int cenX = x + 48, cenY = y + 48;
        double oi = GameTowerDefense.distance(tdX, tdY, cenX, cenY);
        double ai = Math.sqrt(Math.pow(fireRange, 2) - Math.pow(oi, 2));
        double sfrX = tdX, sfrY = tdY - ai;
        double efrX = tdX, efrY = tdY + ai;
        System.out.println("hi " + cenX + "," + efrY);
       if (eneY - 96 <= efrY && eneY + 96 >= sfrY ) {
            double alp = (180/Math.PI) *Math.atan((tdY - eneY) / oi);
            gunRotation = 90 - alp;
            System.out.println(gunRotation);
        }
    }
}

/*
if (gunRotation < 90) {
               gunX = x - 4608 * Math.sqrt(1 - Math.cos(gunRotation));
               gunY = y + 4608*Math.sqrt(1-Math.cos(gunRotation));
           }
           if (gunRotation > 90) {
               gunX = x + 4608 * Math.sqrt(1 - Math.cos(gunRotation));
               gunY = y - 4608*Math.sqrt(1-Math.cos(gunRotation));
           }
 */