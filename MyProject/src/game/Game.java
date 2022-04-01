package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

import javax.swing.JFrame;

import java.awt.*;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class Game {
    public Game() {

        // create a world
        GameWorld world;
        world = new GameWorld();


        //3. make a view to look into the game world
        // UserView view = new UserView(world, 500, 500);
        GameView view = new GameView(world, 790, 610);

        // create hero controller
        HeroController HC = new HeroController();
        view.addKeyListener(HC);
        class GameWorld extends World {
            //new Student field
            private Hero hero;

            public GameWorld() {

                //the student object is now linked
                //to a field rather than a variable
                hero = new Hero(this);

            }

            //new accessor for the student field
            public Hero getHero() {
                return hero;
            }
        }

        //4. create a Java window (frame) and add the game
        //   view to it
        final JFrame frame = new JFrame("City Game");
        frame.add(view);

        // enable the frame to quit the application
        // when the x button is pressed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        // don't let the frame be resized
        frame.setResizable(false);
        // size the frame to fit the world view
        frame.pack();
        // finally, make the frame visible
        frame.setVisible(true);

        //optional: uncomment this to make a debugging view
        //  JFrame debugView = new DebugViewer(world, 500, 500);

        // start our game world simulation!
        world.start();
    }
    public static void main(String[] args) {

        new Game();
    }
}