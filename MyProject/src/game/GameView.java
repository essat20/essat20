package game;

import city.cs.engine.UserView;
import org.jbox2d.common.Vec2;

import javax.swing.*;
import java.awt.*;

public class GameView extends UserView {

    private Image background;

    public GameView(GameWorld world, int width, int height) {
        super(world, width, height);
        background = new ImageIcon("data/Snowy2.png").getImage();
    }


    @Override
    protected void paintBackground(Graphics2D g) {
        g.drawImage(background, 0, -100, this);
//        setView(new Vec2(400,300),1);
        setZoom(22);

    }
}

