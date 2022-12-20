import processing.core.PApplet;

public class Problem05 extends PApplet {
    int CIRCLE_COUNT = 15;

    public void settings() {
        size(1000, 600); // fullScreen () ;
    }

    public void setup() {
        surface.setTitle("Perfect circle!");
        background(0);
        noStroke();
        int w = width / 2;
        int h = height / 2;
        float diameter = min(width, height);
        float diameterStep = diameter / CIRCLE_COUNT;
        int colorValue = 0;
        float colorStep = (float) 255 / CIRCLE_COUNT;

        for (int i = 0; i < CIRCLE_COUNT; i++) {
            fill(colorValue, 0, 0);
            circle(w, h, diameter);
            diameter -= diameterStep;
            colorValue += colorStep;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem05");
    }
}