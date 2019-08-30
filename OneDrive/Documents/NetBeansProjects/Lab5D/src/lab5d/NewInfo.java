package lab5d;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class NewInfo extends JPanel {
    
    private final int MAX_LAYER = 10;
    
    private ArrayList<Shape> shapes;
    
    /* CONSTRUCTOR */
    
    public NewInfo() {
        
        super();
        
        this.setBackground(Color.decode("#00BFFF")); // Deep Sky Blue

        shapes = new ArrayList<>();
        
        /* Create Shapes */
        
       // shapes.add(new Rectangle(50, 50, 0, 100, 100));
        //shapes.add(new Circle(400, 100, 5, 50));
        //shapes.add(new Triangle(250, 350, 2, 100, 100));
        
        
        for (int i = 0; i < 30; i++){
            Random rand = new Random();
            
            int choice = rand.nextInt(4);
            
            if (choice == 1){
                shapes.add(new Rectangle((int) (rand.nextInt(501)), (int) (rand.nextInt(501)),
                (int) (rand.nextInt(10)), (int) (rand.nextInt(100 - 10) + 10), (int) (rand.nextInt(100 - 10) + 10)));
            }
            
            if (choice == 2){
                 shapes.add(new Triangle((int) (rand.nextInt(501)), (int) (rand.nextInt(501)),
                (int) (rand.nextInt(10)), (int) (rand.nextInt(100 - 10) + 10), (int) (rand.nextInt(100 - 10) + 10)));
                
            }
            
            if (choice == 3){
                 shapes.add(new Circle((int) (rand.nextInt(501)), (int) (rand.nextInt(501)),
                (int) (rand.nextInt(10)), (int) (rand.nextInt(100 - 10) + 10)));
            }
            
        }
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);

        /* Iterate through Layers 1 through 10 */
        
        for (int i = 0; i < MAX_LAYER; ++i) {

            /* Iterate through Shape collection */
        
            for (Shape s : shapes) {

                /* Get X and Y coordinates */
                
                int x = s.getX();
                int y = s.getY();

                /* Check Layer */
                
                if (s.getZ() == i) {

                    /* RECTANGLE */

                    if (s instanceof Rectangle) {


                        g.setColor(Color.decode("#B22222")); // Firebrick Red
                        g.fill3DRect(x, y, (int) ((Rectangle) s).getWidth(), (int) ((Rectangle) s).getLength(), true);


                    }

                    /* CIRCLE */

                    else if (s instanceof Circle) {

                        g.setColor(Color.YELLOW); // Yellow
                        g.fillOval(x, y, (int) ((Circle) s).getRadius(), (int) ((Circle) s).getRadius());


                    }

                    /* TRIANGLE */

                    else if (s instanceof Triangle) {
                        
                        

                        g.setColor(Color.decode("#228B22")); // Forest Green
                        Triangle t = (Triangle) s;
                        int x1 = t.getX();
                        int x2 = (int) (t.getX() - (t.getBase()/2));
                        int x3 = (int) (t.getX() + (t.getBase()/2));
                        
                        int y1 = (int) (t.getY() - (t.getHeight()/2));
                        int y2 = (int) (t.getY() + (t.getHeight()/2));
                        int y3 = (int) (t.getY() + (t.getHeight()/2));
                        
                        
                       int xCord[] = {x1, x2, x3};
                       int yCord[] = {y1, y2, y3};
                       
                        g.fillPolygon(xCord, yCord, 3);
                        

                    }
                    
                    /* Tag shape with area */

                    g.setColor(Color.ORANGE);
                    g.drawString(Integer.toString((int)s.area()), x, y);
                    
                } // end layer if

            } // end shapes loop
            
        } // end layer loop
        
    } // end paintComponent()

}
