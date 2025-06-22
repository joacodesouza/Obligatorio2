//Joaquín de Souza (270366)

//creado por ChatGPT
package Interfaz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class MiniJuego extends JFrame {
    
    public MiniJuego() {
        setTitle("Snake Game");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        GamePanel panel = new GamePanel();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                panel.stopGame();
            }
        });
        add(panel);
        pack();
        setLocationRelativeTo(null);
    }

    private static class GamePanel extends JPanel implements ActionListener {
        private final int CELL_SIZE = 10;
        private final int GRID_WIDTH = 30;
        private final int GRID_HEIGHT = 30;
        private final int DELAY = 100;

        private List<Point> snake;
        private Point food;
        private int dx = 1;
        private int dy = 0;
        private javax.swing.Timer timer;
        private boolean gameOver;

        GamePanel() {
            setPreferredSize(new Dimension(GRID_WIDTH * CELL_SIZE, GRID_HEIGHT * CELL_SIZE));
            setBackground(Color.BLACK);
            setFocusable(true);
            initGame();
            addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    switch (e.getKeyCode()) {
                        case KeyEvent.VK_UP:
                            if (dy != 1) { dx = 0; dy = -1; }
                            break;
                        case KeyEvent.VK_DOWN:
                            if (dy != -1) { dx = 0; dy = 1; }
                            break;
                        case KeyEvent.VK_LEFT:
                            if (dx != 1) { dx = -1; dy = 0; }
                            break;
                        case KeyEvent.VK_RIGHT:
                            if (dx != -1) { dx = 1; dy = 0; }
                            break;
                    }
                }
            });
            timer = new javax.swing.Timer(DELAY, this);
            timer.start();
        }

        private void initGame() {
            snake = new ArrayList<>();
            snake.add(new Point(GRID_WIDTH / 2, GRID_HEIGHT / 2));
            spawnFood();
            gameOver = false;
        }

        private void spawnFood() {
            Random rand = new Random();
            food = new Point(rand.nextInt(GRID_WIDTH), rand.nextInt(GRID_HEIGHT));
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (gameOver) {
                return;
            }
            Point head = new Point(snake.get(0).x + dx, snake.get(0).y + dy);
            if (head.x < 0 || head.x >= GRID_WIDTH || head.y < 0 || head.y >= GRID_HEIGHT || snake.contains(head)) {
                timer.stop();
                JOptionPane.showMessageDialog(this, "Game Over");
                gameOver = true;
                return;
            }
            snake.add(0, head);
            if (head.equals(food)) {
                spawnFood();
            } else {
                snake.remove(snake.size() - 1);
            }
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.fillOval(food.x * CELL_SIZE, food.y * CELL_SIZE, CELL_SIZE, CELL_SIZE);
            g.setColor(Color.GREEN);
            for (Point p : snake) {
                g.fillRect(p.x * CELL_SIZE, p.y * CELL_SIZE, CELL_SIZE, CELL_SIZE);
            }
        }

        void stopGame() {
            timer.stop();
        }
    }
}
