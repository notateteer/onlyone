import processing.core.PApplet;

public class Problem04 extends PApplet {
    float minRadius;
    float maxRadius;
    static final int NUMBER_OF_CIRCLES = 200;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        minRadius = min(width, height) / 60f;
        maxRadius = min(width, height) / 40f;
        frameRate(10);
        noStroke();
    }

    public void draw() {
        background(0, 0, 0);

        for (int i = 0; i < NUMBER_OF_CIRCLES; ++i) {
            float x = random(0, width);
            float y = random(0, width);
            float r = random(minRadius, maxRadius);
            float redComp = random(10, 255);
            float greenComp = random(10,255);
            float blueComp = random(10,255);

            fill(redComp, greenComp, blueComp);
            circle(x,y,4 * r);
        }
    }
    public static void main(String[] args) {
        PApplet.main("Problem04");
    }
}