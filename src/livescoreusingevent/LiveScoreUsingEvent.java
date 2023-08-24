/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livescoreusingevent;

import java.util.Scanner;

/**
 *
 * @author alongkornvanzoh
 */
public class LiveScoreUsingEvent {
    static Scanner scanner = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ScoreSource scoreSource = new ScoreSource();
        SubScriber1 subscriber1 = new SubScriber1();
        SubScriber2 subscriber2 = new SubScriber2();
        scoreSource.addSubScriber(subscriber1);
        scoreSource.addSubScriber(subscriber2);
        
        String line;
        Boolean isLoop = true;

        while (isLoop) {
            System.out.print("Enter Score ");
            if ((line = scanner.nextLine()).isEmpty()) {
                break;
            } else {
                scoreSource.setScoreLine(line);
            }
        }
    }
    
}
