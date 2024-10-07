package uc;

public class Class_WidgetProperties {
    public int FRAME_WIDTH = 650;
    public int FRAME_HEIGHT = 560;
    public int FRAME_POS_X = 800;
    public int FRAME_POS_Y = 600;

    public int BASE_X = 80;
    public int BASE_Y = 60;
    public int Y_DIFF = 30;
    public int X_DIFF = 160;

    public int X_DIFF_TEXT = 50;

    public int WIDGET_WIDTH = 140;
    public int WIDGET_HEIGHT = 25;

    public int getPosY(double x) {
        double i = BASE_Y + Y_DIFF * x;
        return (int)i;
    }
}

