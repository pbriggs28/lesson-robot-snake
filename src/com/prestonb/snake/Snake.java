package com.prestonb.snake;

import java.awt.EventQueue;

import javax.swing.JFrame;

import com.prestonb.api.DirectionResolver;
import com.prestonb.api.KeyPressListener;

public class Snake {

    public static void start() {
    	Snake.start(null);
    }

    public static void start(DirectionResolver directionResolver) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame ex = new RobotGame(directionResolver);
                ex.setVisible(true);                
            }
        });
    }

    @SuppressWarnings("serial")
    private static class RobotGame extends JFrame {

        private RobotGame(DirectionResolver directionResolver) {

            add(new RobotGameBoard(directionResolver));
            
            setResizable(false);
            pack();
            
            setTitle("Snake");
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

}
