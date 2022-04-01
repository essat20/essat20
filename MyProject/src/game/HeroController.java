package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class HeroController implements KeyListener{

    private static final float WALKING_SPEED = 4;
    private Hero hero;

    public HeroController() {
        this.hero = hero;
    }
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        // other key commands omitted
        if (code == KeyEvent.VK_1) {
            hero.startWalking(-WALKING_SPEED);
        } else if (code == KeyEvent.VK_2) {
            hero.startWalking(WALKING_SPEED);
        }
        System.out.println("Key typed");
    }
    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_1) {
            hero.stopWalking();
        } else if (code == KeyEvent.VK_2) {
            hero.stopWalking();
        }
    }

    @Override
    public void keyTyped(KeyEvent e){
    }
}