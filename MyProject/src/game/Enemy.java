package game;

import city.cs.engine.*;

public class Enemy extends Walker {

    private static final Shape enemyShape = new PolygonShape
            (-0.03f,1.98f,
                    -0.95f,0.83f,
                    -0.98f,-1.9f,
                    0.37f,-1.86f,
                    1.0f,0.37f,
                    0.71f,1.67f
            );

    private static final BodyImage image =
            new BodyImage("data/zombie1.png", 4f);


    public Enemy(World world) {
        super(world, enemyShape);
        addImage(image);
//        startWalking(2);
//        this.setAlwaysOutline(true);

    }


}