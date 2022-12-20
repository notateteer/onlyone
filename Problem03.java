import processing.core.PApplet;

public class Problem03 extends PApplet {
    float initialAngle = 0.01f;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0);
        strokeWeight(3);

        float x = width * 0.5f;
        //float y = height * 0.5f;

        float x1 = width * 0.2f;
        float y1 = height * 0.2f;

        float x2 = width * 0.8f;
        float y2 = height * 0.2f;

        float x3 = width * 0.2f;
        float y3 = height * 0.8f;

        float x4 = width * 0.8f;
        float y4 = height * 0.8f;

        stroke(255, 0, 0);
        star(x, Y, 70.0f, 200.0f, initialAngle);
        stroke(247, 255, 10);
        star(x1, y1, 50.0f, 120.0f, initialAngle);
        star(x2, y2, 50.0f, 120.0f, initialAngle);
        star(x3, y3, 50.0f, 120.0f, initialAngle);
        star(x4, y4, 50.0f, 120.0f, initialAngle);
    }

    private void star(float x, float y, float radius1, float radius2, float angle) {
        float angleStep = TWO_PI / 8;
        float prevEndX = x + cos(angle - angleStep) * radius1;
        float prevEndY = y + sin(angle - angleStep) * radius1;
        for (int i = 0; i < 8; ++i) {
            float radius = i % 2 == 0 ? radius2 : radius1;
            float endX = x + cos(angle) * radius;
            float endY = y + sin(angle) * radius;
            line(x, y, endX, endY);
            line(prevEndX, prevEndY, endX, endY);
            angle += angleStep;
            prevEndX = endX;
            prevEndY = endY;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");

    }
}