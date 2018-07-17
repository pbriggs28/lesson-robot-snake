package com.prestonb.snake;

import java.awt.EventQueue;

import javax.swing.JFrame;

import com.prestonb.api.DirectionResolver;

public class Snake {

    public static void start() {
    	Snake.start(null);
    }

    public static void start(DirectionResolver directionResolver) {
        
        EventQueue.invokeLater(() -> {
            JFrame frame = new JFrame();

            frame.add(new RobotGameBoard(directionResolver));

            frame.setResizable(false);
            frame.pack();

            frame.setTitle("Snake");
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.setVisible(true);
        });
    }

}
