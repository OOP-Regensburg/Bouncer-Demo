package demo;

import de.ur.mi.bouncer.apps.BouncerApp;
import de.ur.mi.bouncer.apps.BouncerLauncher;

public class BouncerDemo extends BouncerApp {

    @Override
    public void bounce() {
        loadMap("Empty");
        while (bouncer.canMoveForward () ) {
            bouncer.move();
        }
    }

    public static void main(String[] args) {
        BouncerLauncher.launch("BouncerDemo");
    }
}
