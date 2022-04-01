package game;

import city.cs.engine.BoxShape;
import city.cs.engine.Shape;
import city.cs.engine.StaticBody;
import city.cs.engine.World;
import org.jbox2d.common.Vec2;

public class GameWorld extends World {
    public GameWorld() {
        super();

        // make the ground and ceiling
        Shape Ground = new BoxShape(18, 0.5f);
        StaticBody ground = new StaticBody(this, Ground);
        ground.setPosition(new Vec2(0f, -13.5f));

        StaticBody ceiling = new StaticBody(this, Ground);
        ceiling.setPosition(new Vec2(0f, 13.5f));

        // make left and right walls
        Shape Wall = new BoxShape(0.5f, 13);
        StaticBody wall1 = new StaticBody(this, Wall);
        wall1.setPosition(new Vec2(-17.5f, 0));

        StaticBody wall2 = new StaticBody(this, Wall);
        wall2.setPosition(new Vec2(17.5f, 0));

        // make platforms
        Shape platformShape = new BoxShape(3.5f, 0.5f);
        StaticBody platform1 = new StaticBody(this, platformShape);
        platform1.setPosition(new Vec2(13.5f, -6f));

        StaticBody platform2 = new StaticBody(this, platformShape);
        platform2.setPosition(new Vec2(5f, -8.5f));

        StaticBody platform3 = new StaticBody(this, platformShape);
        platform3.setPosition(new Vec2(-3.5f, -11f));

        StaticBody platform4 = new StaticBody(this, platformShape);
        platform4.setPosition(new Vec2(-2f, 6f));

        // create a hero character
        Hero hero = new Hero(this);
        hero.setPosition(new Vec2(-15, -12));


        // create enemy characters
        Enemy enemy1 = new Enemy(this);
        enemy1.setPosition(new Vec2(15, -4));
        enemy1.startWalking(-2);

        Enemy enemy2 = new Enemy(this);
        enemy2.setPosition(new Vec2(-5, 8f));
        enemy2.startWalking(2);



    }



}

