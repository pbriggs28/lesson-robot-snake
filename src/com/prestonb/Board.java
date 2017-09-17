package com.prestonb;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener {
    private final int B_WIDTH = 450;
    private final int B_HEIGHT = 450;
    private final int DOT_SIZE = 15;
    private final int ALL_DOTS = 900;
    private final int RAND_POS = 29;
    private final int DELAY = 120;

    private final int x[] = new int[ALL_DOTS];
    private final int y[] = new int[ALL_DOTS];

    private int dots;
    private int apple_x;
    private int apple_y;

    private int finish_x;
    private int finish_y;

    private boolean leftDirection = false;
    private boolean rightDirection = true;
    private boolean upDirection = false;
    private boolean downDirection = false;
    
    private boolean inGame = true;
    private boolean gameWon = false;
    
    

    private Timer timer;
    private Image ball;
    private Image apple;
    private Image head;

    public Board() {

        addKeyListener(new TAdapter());
        setBackground(Color.black);
        setFocusable(true);

        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        loadImages();
        initGame();
    }

    private void loadImages() {

        ImageIcon iid = new ImageIcon("dot.png");
        ball = iid.getImage();

        ImageIcon iia = new ImageIcon("apple.png");
        apple = iia.getImage();

        ImageIcon iih = new ImageIcon("head.png");
        head = iih.getImage();
    }

    private void randomWalls() {
//    	Math.ra
//    	for(int i = 0; i < )
    }
    
    private void initGame() {
    	
//    	finishX = 

    	// Generate finish point
        int r;
        r = (int) (B_WIDTH/DOT_SIZE);
        finish_x = ((r * DOT_SIZE));

        r = (int) (0);
        finish_y = ((r * DOT_SIZE));

        // generate walls
        dots = 132;

		x[1] = 15;
		x[2] = 16;
		x[3] = 17;
		x[4] = 18;
		x[5] = 19;
		x[6] = 20;
		x[7] = 21;
		x[8] = 22;
		x[9] = 23;
		x[10] = 24;
		x[11] = 25;
		x[12] = 26;
		x[13] = 27;
		x[14] = 28;
		x[15] = 29;
		x[16] = 30;
		x[17]  = 30;
		x[18] = 9;
		x[19] = 13;
		x[20] = 9;
		x[21] = 13;
		x[22] = 9;
		x[23] = 13;
		x[24] = 15;
		x[25] = 16;
		x[26] = 17;
		x[27] = 18;
		x[28] = 19;
		x[29] = 20;
		x[30] = 21;
		x[31] = 22;
		x[32] = 23;
		x[33] = 24;
		x[34] = 25;
		x[35] = 26;
		x[36] = 9;
		x[37] = 13;
		x[38] = 26;
		x[39] = 9;
		x[40] = 13;
		x[41] = 14;
		x[42] = 15;
		x[43] = 16;
		x[44] = 17;
		x[45] = 18;
		x[46] = 19;
		x[47] = 27;
		x[48] = 9;
		x[49] = 19;
		x[50] = 28;
		x[51] = 9;
		x[52] = 19;
		x[53] = 29;
		x[54] = 9;
		x[55] = 19;
		x[56] = 29;
		x[57] = 9;
		x[58] = 19;
		x[59] = 29;
		x[60] = 4;
		x[61] = 9;
		x[62] = 19;
		x[63] = 25;
		x[64] = 29;
		x[65] = 4;
		x[66] = 9;
		x[67] = 19;
		x[68] = 25;
		x[69] = 29;
		x[70] = 4;
		x[71] = 9;
		x[72] = 10;
		x[73] = 11;
		x[74] = 12;
		x[75] = 13;
		x[76] = 16;
		x[77] = 17;
		x[78] = 18;
		x[79] = 19;
		x[80] = 25;
		x[81] = 4;
		x[82] = 13;
		x[83] = 16;
		x[84] = 26;
		x[85] = 4;
		x[86] = 13;
		x[87] = 16;
		x[88] = 25;
		x[89] = 28;
		x[90] = 4;
		x[91] = 5;
		x[92] = 6;
		x[93] = 13;
		x[94] = 16;
		x[95] = 24;
		x[96] = 27;
		x[97] = 16;
		x[98] = 23;
		x[99] = 26;
		x[100] = 16;
		x[101] = 22;
		x[102] = 25;
		x[103] = 16;
		x[104] = 24;
		x[105] = 25;
		x[106] = 16;
		x[107] = 26;
		x[108] = 1;
		x[109] = 2;
		x[110] = 3;
		x[111] = 4;
		x[112] = 5;
		x[113] = 6;
		x[114] = 7;
		x[115] = 16;
		x[116] = 26;
		x[117] = 16;
		x[118] = 27;
		x[119] = 9;
		x[120] = 10;
		x[121] = 11;
		x[122] = 12;
		x[123] = 13;
		x[124] = 14;
		x[125] = 15;
		x[126] = 16;
		x[127] = 28;
		x[128] = 12;
		x[129] = 29;
		x[130] = 13;
		x[131] = 29;
		x[132] = 29;
		y[1]   = 1; 
		y[2]   = 1; 
		y[3]   = 1; 
		y[4]   = 1; 
		y[5]   = 1; 
		y[6]   = 1; 
		y[7]   = 1; 
		y[8]   = 1; 
		y[9]   = 1; 
		y[10]  = 1; 
		y[11]  = 1; 
		y[12]  = 1; 
		y[13]  = 1; 
		y[14]  = 1; 
		y[15]  = 1; 
		y[16]  = 1; 
		y[17]  = 30;
		y[18]  = 6; 
		y[19]  = 6; 
		y[20]  = 7; 
		y[21]  = 7; 
		y[22]  = 8; 
		y[23]  = 8; 
		y[24]  = 8; 
		y[25]  = 8; 
		y[26]  = 8; 
		y[27]  = 8; 
		y[28]  = 8; 
		y[29]  = 8; 
		y[30]  = 8; 
		y[31]  = 8; 
		y[32]  = 8; 
		y[33]  = 8; 
		y[34]  = 8; 
		y[35]  = 8; 
		y[36]  = 9; 
		y[37]  = 9; 
		y[38]  = 9; 
		y[39]  = 10;
		y[40]  = 10;
		y[41]  = 10;
		y[42]  = 10;
		y[43]  = 10;
		y[44]  = 10;
		y[45]  = 10;
		y[46]  = 10;
		y[47]  = 10;
		y[48]  = 11;
		y[49]  = 11;
		y[50]  = 11;
		y[51]  = 12;
		y[52]  = 12;
		y[53]  = 12;
		y[54]  = 13;
		y[55]  = 13;
		y[56]  = 13;
		y[57]  = 14;
		y[58]  = 14;
		y[59]  = 14;
		y[60]  = 15;
		y[61]  = 15;
		y[62]  = 15;
		y[63]  = 15;
		y[64]  = 15;
		y[65]  = 16;
		y[66]  = 16;
		y[67]  = 16;
		y[68]  = 16;
		y[69]  = 16;
		y[70]  = 17;
		y[71]  = 17;
		y[72]  = 17;
		y[73]  = 17;
		y[74]  = 17;
		y[75]  = 17;
		y[76]  = 17;
		y[77]  = 17;
		y[78]  = 17;
		y[79]  = 17;
		y[80]  = 17;
		y[81]  = 18;
		y[82]  = 18;
		y[83]  = 18;
		y[84]  = 18;
		y[85]  = 19;
		y[86]  = 19;
		y[87]  = 19;
		y[88]  = 19;
		y[89]  = 19;
		y[90]  = 20;
		y[91]  = 20;
		y[92]  = 20;
		y[93]  = 20;
		y[94]  = 20;
		y[95]  = 20;
		y[96]  = 20;
		y[97]  = 21;
		y[98]  = 21;
		y[99]  = 21;
		y[100] = 22;
		y[101] = 22;
		y[102] = 22;
		y[103] = 23;
		y[104] = 23;
		y[105] = 23;
		y[106] = 24;
		y[107] = 24;
		y[108] = 25;
		y[109] = 25;
		y[110] = 25;
		y[111] = 25;
		y[112] = 25;
		y[113] = 25;
		y[114] = 25;
		y[115] = 25;
		y[116] = 25;
		y[117] = 26;
		y[118] = 26;
		y[119] = 27;
		y[120] = 27;
		y[121] = 27;
		y[122] = 27;
		y[123] = 27;
		y[124] = 27;
		y[125] = 27;
		y[126] = 27;
		y[127] = 27;
		y[128] = 28;
		y[129] = 28;
		y[130] = 29;
		y[131] = 29;
		y[132] = 30;
        
        for (int i = 0; i < x.length; i++) {
			x[i] *= DOT_SIZE;
			y[i] *= DOT_SIZE;
		}
//        for (int z = 0; z < dots; z++) {
//            x[z] = 50 - z * 10;
//            y[z] = 50;
//        }

        locateApple();

        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);
    }
    
    private void doDrawing(Graphics g) {
        
        if (inGame) {

            g.drawImage(apple, apple_x, apple_y, this);
            g.drawImage(head, finish_x, finish_y, this);

            for (int z = 0; z < dots; z++) {
//                if (z == 0) {
//                    g.drawImage(head, x[z], y[z], this);
//                } else {
                    g.drawImage(ball, x[z], y[z], this);
//                }
            }

            Toolkit.getDefaultToolkit().sync();

        } else if(gameWon) {
        	gameWon(g);
        } else {

            gameOver(g);
        }        
    }

    private void gameOver(Graphics g) {
        
        String msg = "Game Over";
        Font small = new Font("Helvetica", Font.BOLD, 28);
        FontMetrics metr = getFontMetrics(small);

        g.setColor(Color.RED);
        g.setFont(small);
        g.drawString(msg, (B_WIDTH - metr.stringWidth(msg)) / 2, B_HEIGHT / 2);
    }

    private void gameWon(Graphics g) {
        
        String msg = "Game Won!";
        Font small = new Font("Helvetica", Font.BOLD, 28);
        FontMetrics metr = getFontMetrics(small);

        g.setColor(Color.GREEN);
        g.setFont(small);
        g.drawString(msg, (B_WIDTH - metr.stringWidth(msg)) / 2, B_HEIGHT / 2);
    }

    private void checkApple() {

    	// TODO: iterate through whole wall instead of just head
    	for (int i = 0; i < x.length; i++) {
			int xPos = x[i];
			int yPos = y[i];
			if(apple_x == xPos && apple_y == yPos)
                inGame = false;
			
		}
//        if ((x[0] == apple_x) && (y[0] == apple_y)) {
//        	// TODO: Call game over
//            dots++;
//            locateApple();
//        }
    }

    private void move() {

//        for (int z = dots; z > 0; z--) {
//            x[z] = x[(z - 1)];
//            y[z] = y[(z - 1)];
//        }

        if (leftDirection) {
//            x[0] -= DOT_SIZE;
        	apple_x -= DOT_SIZE;
        }

        if (rightDirection) {
//            x[0] += DOT_SIZE;
        	apple_x += DOT_SIZE;
        }

        if (upDirection) {
//            y[0] -= DOT_SIZE;
        	apple_y -= DOT_SIZE;
        }

        if (downDirection) {
//            y[0] += DOT_SIZE;
        	apple_y += DOT_SIZE;
        }
    }

    private void checkCollision() {
    	if (apple_x >= B_WIDTH || apple_y >= B_HEIGHT)
    		inGame=false;
    	if(apple_x < 0 || apple_y < 0)
    		inGame=false;
    }

    private void locateApple() {
        int r = (int) (1);
        apple_x = ((r * DOT_SIZE));

        r = (int) (B_HEIGHT/DOT_SIZE -1);
        apple_y = ((r * DOT_SIZE));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	
        if (inGame) {

            checkApple();
            checkCollision();
            checkFinish();
            move();
        }

        repaint();
    }

    
    private void checkFinish() {
    	if(apple_x == finish_x  && apple_y == finish_y) {
    		gameWon = true;
    	}
    }

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {

            int key = e.getKeyCode();

            if ((key == KeyEvent.VK_LEFT) && (!rightDirection)) {
                leftDirection = true;
                upDirection = false;
                downDirection = false;
            }

            if ((key == KeyEvent.VK_RIGHT) && (!leftDirection)) {
                rightDirection = true;
                upDirection = false;
                downDirection = false;
            }

            if ((key == KeyEvent.VK_UP) && (!downDirection)) {
                upDirection = true;
                rightDirection = false;
                leftDirection = false;
            }

            if ((key == KeyEvent.VK_DOWN) && (!upDirection)) {
                downDirection = true;
                rightDirection = false;
                leftDirection = false;
            }
        }
    }
}
