package game;

import city.cs.engine.*;

public class Hero extends Walker {

    private static final Shape heroShape = new PolygonShape(
            -0.54f,-1.86f,
            0.65f,-1.87f,
            1.24f,-0.89f,
            0.97f,1.46f,
            -0.31f,2.0f,
            -1.26f,0.98f,
            -1.27f,-0.36f
    );

    private static final BodyImage image =
            new BodyImage("data/hero1.png", 4f);


    public Hero(World world) {
        super(world, heroShape);
        addImage(image);
        startWalking(2);
//        this.setAlwaysOutline(true);
    }


}