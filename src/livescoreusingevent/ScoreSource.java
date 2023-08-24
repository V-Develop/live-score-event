/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livescoreusingevent;

import java.util.ArrayList;

/**
 *
 * @author alongkornvanzoh
 */
public class ScoreSource {
    ArrayList<ScoreListener> observers;
    
    public ScoreSource() {
        observers = new ArrayList<>();
    }
    
    public void addSubScriber(ScoreListener obj) {
        observers.add(obj);
    }
    
    public void removeSubScriber(ScoreListener obj) {
        observers.remove(obj);
    }
    
    public void setScoreLine(String value) {
        fireScoreEvent(new ScoreEvent(this, value));
    }
    
    public void fireScoreEvent(ScoreEvent evt) {
        for(ScoreListener observer: observers) {
            observer.scoreChange(evt);
        }
    }
    
}
