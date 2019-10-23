package de.mat2095.my_slither;

import java.awt.*;
import java.util.Deque;
import java.util.concurrent.ThreadLocalRandom;


class Snake {

    final int id;
    final String name;
    double x, y;
    int dir;
    double wang, ang;
    double sp, tsp;
    private double fam;
    final Deque<SnakeBodyPart> body;
    private final MySlitherModel model;
    private int skin;
    private static final int[] skins = {
        0xAB27C2,
        0x2094D2,
        0x4EB5EC,
        0x6A8759,
        0xDBE80F,
        0xE5890B,
        0xEF8BCB,
        0xFF0000,
        0xE825DD
    };



    Snake(int id, String name, double x, double y, double wang, double ang, double sp, double fam, Deque<SnakeBodyPart> body, MySlitherModel model, int skin) {
        this.id = id;
        this.name = name;
        this.x = x;
        this.y = y;
        this.dir = 0;
        this.wang = wang;
        this.ang = ang;
        this.sp = sp;
        tsp = 0;
        this.fam = fam;
        this.body = body;
        this.model = model;
        // Set the skin colour
        this.skin = skin;
    }

    private double getSc() {
        return Math.min(6, 1 + (body.size() - 2) / 106.0);
    }

    double getScang() {
        return 0.13 + 0.87 * Math.pow((7 - getSc()) / 6, 2);
    }

    double getSpang() {
        return Math.min(sp / model.spangdv, 1);
    }

    private double getFsp() {
        return model.nsp1 + model.nsp2 * getSc();
    }

    boolean isBoosting() {
        return tsp > getFsp();
    }

    double getFam() {
        return fam;
    }

    void setFam(double fam) {
        this.fam = fam;
    }

    /**
     * Returns the colour for this snake depending on the
     * skin sent from the websocket message
     * @return The colour of the snake
     */
    public Color getColour(){
        if(this.skin > skins.length - 1){
            // We don't have a colour for this skin, display a random colour
            return new Color(skins[ThreadLocalRandom.current().nextInt(0, skins.length - 1)]);
        }else {
            // We have a colour for this skin, return it
            return new Color(skins[this.skin]);
        }
    }

}
