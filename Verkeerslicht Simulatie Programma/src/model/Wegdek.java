package model;

import dstructures.LinkStack;
import dstructures.Queue;
import dstructures.Stack;


public class Wegdek {

    private String wegdekCode;
    private Queue voertuigenQueue;
    private Stack reverseVoertuigen;

    public Wegdek(Queue voertuigenQueue, String wegdekCode) {
        this.voertuigenQueue = voertuigenQueue;
        this.reverseVoertuigen = new Stack();
        this.wegdekCode = wegdekCode;
    }

    public Queue getVoertuigenQueue() {
        return voertuigenQueue;
    }

    public void setVoertuigenQueue(Queue voertuigenQueue) {
        this.voertuigenQueue = voertuigenQueue;
    }

    public Stack getReverseVoertuigen() {
        return reverseVoertuigen;
    }

    public String getWegdekCode() {
        return wegdekCode;
    }

    public void setWegdekCode(String wegdekCode) {
        this.wegdekCode = wegdekCode;
    }

    @Override
    public String toString() {
        return "Wegdek{" +
                "wegdekCode='" + wegdekCode + '\'' +
                ", voertuigenQueue=" + voertuigenQueue +
                ", reverseVoertuigen=" + reverseVoertuigen +
                '}';
    }
}



   /* public void setReverseVoertuigen(LinkStack reverseVoertuigen) {
        this.reverseVoertuigen = reverseVoertuigen;
    }

    */

        /*public Wegdek(String wegdekCode) {
            this.wegdekCode = wegdekCode;
        }

        public void enqueue(Voertuig voertuigenQueue) { Queue.(voertuigenQueue); }

        public String getWegdekCode() {return wegdekCode; }

        public LinkQueue getVoertuigenQueue() { return voertuigenQueue; }

        public LinkStack getVoertuigenStack() { return voertuigenStack; }
    }

     */




