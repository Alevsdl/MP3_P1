/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3p1;

/**
 *
 * @author Diego
 */
public class Slot {
    private byte id;
    private short post;

    public Slot(byte id, short post) {
        this.id = id;
        this.post = post;
    }
    public Slot(){
        this.id=0;
        this.post=0;
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public short getPost() {
        return post;
    }

    public void setPost(short post) {
        this.post = post;
    }
    
}
