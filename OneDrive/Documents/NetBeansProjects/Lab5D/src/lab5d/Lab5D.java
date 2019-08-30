/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5d;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author Jacob
 */
public class Lab5D {
        public static void main(String[] args) {

            EventQueue.invokeLater(() -> {

                JFrame window = new JFrame("CS232 Lab #5D");
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                window.getContentPane().add(new NewInfo());

                window.setSize(500, 500);
                window.setLocationRelativeTo(null);
                window.setVisible(true);

            });

        }
    
}
