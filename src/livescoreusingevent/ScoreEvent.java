/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livescoreusingevent;

import java.util.EventObject;

/**
 *
 * @author alongkornvanzoh
 */
public class ScoreEvent extends EventObject {
    
    private String data;
    
    public String getData() {
        return this.data;
    }
    
    public ScoreEvent(Object o, String value) {
        super(o);
        this.data = value;
    }
}
