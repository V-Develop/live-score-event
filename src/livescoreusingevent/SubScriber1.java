/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livescoreusingevent;

/**
 *
 * @author alongkornvanzoh
 */
public class SubScriber1 implements ScoreListener {
    
    @Override
    public void scoreChange(ScoreEvent evt) {
        System.out.println("live result: " + evt.getData());
    }
}
