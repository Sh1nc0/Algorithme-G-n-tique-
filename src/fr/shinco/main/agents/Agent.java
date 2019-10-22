package fr.shinco.main.agents;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Agent {
    private String gens;
    private int score;
    List<String> g = new ArrayList<String>();


    public Agent(){
        for (int i = 0; i <= 7; i++){
            Random r = new Random();
            boolean rand = r.nextBoolean();
            if(rand == true){
                g.add("1");
                score++;
            }
            else{
                g.add("0");
            }
        }

    }
    public Agent(Agent i){
        g = i.getGens();

        for(int j =  0; j <= 4; j++){
            double rd = Math.floor(Math.random() * 8) + 1;
            if(i.g.get((int) (rd -1)) == "1"){
                i.g.set((int) (rd -1), "0");
            }
            else{
                i.g.set((int) (rd -1), "1");
            }

        }

        for(int j = 0; j <=3; j++){
            if(i.g.get(j) == "1"){
                score++;
            }
        }
        for(int j = 4; j <=7; j++){
            if(i.g.get(j) == "1"){
                score++;
            }
        }


    }
    public Agent(Agent i1, Agent i2){
        g.add(i1.g.get(0));
        g.add(i1.g.get(1));
        g.add(i1.g.get(2));
        g.add(i1.g.get(3));
        g.add(i2.g.get(4));
        g.add(i2.g.get(5));
        g.add(i2.g.get(6));
        g.add(i2.g.get(7));

        for(int i = 0; i <=3; i++){
            if(i1.g.get(i) == "1"){
                score++;
            }
        }
        for(int i = 4; i <=7; i++){
            if(i2.g.get(i) == "1"){
                score++;
            }
        }

    }

    public List<String> getGens(){
        return g;
    }
    public int getScore(){
        return score;
    }

}
