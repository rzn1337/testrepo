import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.*;
import javax.swing.SwingUtilities;

public class DrawingPanel extends JPanel implements MouseListener, MouseMotionListener, KeyListener {

	private int startX, startY;
	private int endX, endY;
	private static final long serialVersionUID = 1L;
	// PROPERTIES
	private final int DEFAULT_WIDTH  = 600;
	private final int DEFAULT_HEIGHT = 600;

	private int x1, y1, x2, y2;

	private Graphics g;
	private Point[] pointarr;
	private Shape circle;
	private char key_pressed;
	private Shape rectangle;
	private Shape triangle;
	private byte clicks;
	Stack<Shape> stack;
	Queue<Shape> queue;
	int circle_size;
	int rectH;
	int rectW;
	Graphics graphics;


	private Random random = new Random();
	// CONSTRUCTOR
	public DrawingPanel() {
		stack = new Stack<Shape>();
		queue = new LinkedList<Shape>();
		pointarr = new Point[3];
		setBackground(Color.BLACK);
		setPreferredSize( new Dimension( DEFAULT_WIDTH, DEFAULT_HEIGHT ) );
		this.addMouseListener( this );
		this.addMouseMotionListener(this  );
		this.addKeyListener(this);
		setFocusable(true);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setUpDrawingGraphics();
	}

	public Stack<Shape> getStack() {
		return stack;
	}

	public Queue<Shape> getQueue() {
		return queue;
	}

	private void setUpDrawingGraphics() {
		g = getGraphics();
		stack.peek().draw(g);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(clicks);
		if (key_pressed == '3') {
			clicks++;
			if (clicks == 1) {
				pointarr[0] = new Point(e.getX(), e.getY());
			} else if (clicks == 2) {
				pointarr[1] = new Point(e.getX(), e.getY());
			} else if (clicks == 3) {
				pointarr[2] = new Point(e.getX(), e.getY());
				triangle = new Triangle(pointarr , randomColor());
				stack.push(triangle);
				clicks = 0;
				setUpDrawingGraphics();
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {

		if(SwingUtilities.isLeftMouseButton(e)) {
			queue.clear();
			x1 = e.getX();
			y1 = e.getY();
			if (key_pressed == '1') {
				circle_size = 0;
				circle = new Circle(circle_size, new Point(x1, y1), randomColor());
				stack.push(circle);
			} else if (key_pressed == '2') {
				rectangle = new Rectangle(rectH, rectW, new Point(x1, y1), randomColor());
				stack.push(rectangle);
			}

		} else if(SwingUtilities.isRightMouseButton(e)) {
			queue.add(stack.pop());
		} else if(SwingUtilities.isMiddleMouseButton(e)) {
			while(!queue.isEmpty()) {
				Shape shape = queue.remove();
				stack.push(shape);
			}

		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {


	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		x2 = e.getX();
		y2 = e.getY();

		if (key_pressed == '1') {
			circle_size++;
			((Circle)circle).setSize(circle_size);
			setUpDrawingGraphics();
		} else if (key_pressed == '2') {
			int newH = (int) y2-y1;
			int newW = (int) x2-x1;
			((Rectangle)rectangle).setHeight(rectH+newH);
			((Rectangle)rectangle).setWidth(rectW+newW);
			setUpDrawingGraphics();
		}


	}

	@Override
	public void mouseMoved(MouseEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {


	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(shapeName(e.getKeyChar()));
		if (e.getKeyChar() == '1') {
			key_pressed = '1';
//			int radius = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
//			int diameter = 2 * radius;
//			int centerX = x1 + radius;
//			int centerY = y1 + radius;
//			Point p = new Point(x1 + radius, y1 + radius);
//			circle = new Circle(diameter, p, randomColor());
		} else if (e.getKeyChar() == '2') {
			key_pressed = '2';
//			int width = Math.abs(x2 - x1);
//			int height = Math.abs(y2 - y1);
//			int centerX = Math.min(x1, x2) + width / 2;
//			int centerY = Math.min(y1, y2) + height / 2;
//			Point p = new Point(centerX, centerY);
//			rectangle = new Rectangle(width, height, p, randomColor());
		} else if (e.getKeyChar() == '3') {
			key_pressed = '3';
			clicks = 0;
//			triangle = new Triangle();
		}
	}

	public Color randomColor() {
		Random random = new Random();
		return new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256));
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public String shapeName(char ch) {
		if (ch == '1') {
			return "Circle";
		} else if (ch == '2') {
			return "Rectangle";
		} else {
			return "Triangle";
		}
	}


}