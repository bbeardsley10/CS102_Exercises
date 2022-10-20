package Exercise07;

// . Creating class for a rectangle

public class Rectangle {
    
    private int width;
    private int height;

    // . Everything needs to be private

    public Rectangle (int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width){
        if(width < 64)
        {
            this.width = width;
        }
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    public void draw(){
        for(int i = 0; i < height; i++)
        {
            for(int j = 0; j < width; j++){

                System.out.print("*");
            }
            System.out.println("");
        }
    }


}
