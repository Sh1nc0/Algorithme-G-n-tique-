package fr.shinco.main.panels;

import fr.shinco.main.agents.Agent;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MainPanel extends JPanel implements ActionListener {

    private boolean generated = false;

    private JButton generate = new JButton();
    private JButton sort = new JButton();
    private JButton selection = new JButton();
    private JButton mutate = new JButton();
    private JButton fill = new JButton();




    private JLabel l1 = new JLabel("1: ");
    private JLabel l2 = new JLabel("2: ");
    private JLabel l3 = new JLabel("3: ");
    private JLabel l4 = new JLabel("4: ");
    private JLabel l5 = new JLabel("5: ");
    private JLabel l6 = new JLabel("6: ");
    private JLabel l7 = new JLabel("7: ");
    private JLabel l8 = new JLabel("8: ");

    private JLabel la = new JLabel("1: ");
    private JLabel lb = new JLabel("2: ");
    private JLabel lc = new JLabel("3: ");
    private JLabel ld = new JLabel("4: ");


    List<Agent> agentList = new ArrayList<Agent>();
    List<Agent> AgentList2 = new ArrayList<Agent>();
    List<Agent> AgentList3 = new ArrayList<Agent>();



    public MainPanel(){
        this.setLayout(null);
        generate.setText("Generate");
        generate.addActionListener(this);
        generate.setLocation(15,5);
        generate.setSize(60,20);

        this.add(generate);

        sort.setText("Sort");
        sort.addActionListener(this);
        sort.setLocation(90,5);
        sort.setSize(45,20);
        this.add(sort);

        selection.setText("Selection");
        selection.addActionListener(this);
        selection.setLocation(150,5);
        selection.setSize(70,20);
        this.add(selection);

        mutate.setText("Mutate");
        mutate.addActionListener(this);
        mutate.setLocation(235,5);
        mutate.setSize(60,20);
        this.add(mutate);

        fill.setText("Fill");
        fill.addActionListener(this);
        fill.setLocation(305,5);
        fill.setSize(60,20);
        this.add(fill);

        l1.setLocation(15,60);
        l1.setSize(200,20);
        this.add(l1);

        l2.setLocation(15,75);
        l2.setSize(200,20);
        this.add(l2);

        l3.setLocation(15,90);
        l3.setSize(200,20);
        this.add(l3);

        l4.setLocation(15,105);
        l4.setSize(200,20);
        this.add(l4);

        l5.setLocation(15,120);
        l5.setSize(200,20);
        this.add(l5);

        l6.setLocation(15,135);
        l6.setSize(200,20);
        this.add(l6);

        l7.setLocation(15,150);
        l7.setSize(200,20);
        this.add(l7);

        l8.setLocation(15,165);
        l8.setSize(200,20);
        this.add(l8);

        la.setLocation(15,190);
        la.setSize(200,20);
        this.add(la);

        lb.setLocation(15,205);
        lb.setSize(200,20);
        this.add(lb);

        lc.setLocation(15,220);
        lc.setSize(200,20);
        this.add(lc);

        ld.setLocation(15,235);
        ld.setSize(200,20);
        this.add(ld);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == generate){
            if(generated == false){
                generated = true;
                agentList.clear();
                for(int i = 0; i <= 7; i++){
                    agentList.add(new Agent());

                }
                l1.setText("1: " + agentList.get(0).getGens() + " " + agentList.get(0).getScore());
                l2.setText("2: " + agentList.get(1).getGens() + " " + agentList.get(1).getScore());
                l3.setText("3: " + agentList.get(2).getGens() + " " + agentList.get(2).getScore());
                l4.setText("4: " + agentList.get(3).getGens() + " " + agentList.get(3).getScore());
                l5.setText("5: " + agentList.get(4).getGens() + " " + agentList.get(4).getScore());
                l6.setText("6: " + agentList.get(5).getGens() + " " + agentList.get(5).getScore());
                l7.setText("7: " + agentList.get(6).getGens() + " " + agentList.get(6).getScore());
                l8.setText("8: " + agentList.get(7).getGens() + " " + agentList.get(7).getScore());
            }


        }
        else if(e.getSource() == sort){
            for(int i=0; i<agentList.size(); i++) {
                for(int j=0; j<agentList.size()-1-i; j++) {
                    if(agentList.get(j).getScore() < agentList.get(j + 1).getScore()) {
                        Agent t = agentList.get(j);
                        agentList.set(j, agentList.get(j+1));
                        agentList.set(j+1, t);
                    }
                }
            }
            l1.setText("1: " + agentList.get(0).getGens() + " " + agentList.get(0).getScore());
            l2.setText("2: " + agentList.get(1).getGens() + " " + agentList.get(1).getScore());
            l3.setText("3: " + agentList.get(2).getGens() + " " + agentList.get(2).getScore());
            l4.setText("4: " + agentList.get(3).getGens() + " " + agentList.get(3).getScore());
            l5.setText("5: " + agentList.get(4).getGens() + " " + agentList.get(4).getScore());
            l6.setText("6: " + agentList.get(5).getGens() + " " + agentList.get(5).getScore());
            l7.setText("7: " + agentList.get(6).getGens() + " " + agentList.get(6).getScore());
            l8.setText("8: " + agentList.get(7).getGens() + " " + agentList.get(7).getScore());


        }
        else if(e.getSource() == selection){

            AgentList2.add(agentList.get(0));

            AgentList2.add(new Agent(agentList.get(0), agentList.get(1)));
            AgentList2.add(new Agent(agentList.get(1), agentList.get(2)));
            AgentList2.add(new Agent(agentList.get(0), agentList.get(2)));

            la.setText("1: " + agentList.get(0).getGens() + " " + agentList.get(0).getScore());
            lb.setText("2: " + AgentList2.get(0).getGens() + " " + AgentList2.get(0).getScore());
            lc.setText("3: " + AgentList2.get(1).getGens() + " " + AgentList2.get(1).getScore());
            ld.setText("4: " + AgentList2.get(2).getGens() + " " + AgentList2.get(2).getScore());


        }
        else if(e.getSource() == mutate){
            AgentList3.clear();
            AgentList3.add(new Agent(AgentList2.get(0)));
            AgentList3.add(new Agent(AgentList2.get(1)));
            AgentList3.add(new Agent(AgentList2.get(2)));
            AgentList3.add(new Agent(AgentList2.get(3)));

            la.setText("1: " + AgentList3.get(0).getGens() + " " + AgentList3.get(0).getScore());
            lb.setText("2: " + AgentList3.get(1).getGens() + " " + AgentList3.get(1).getScore());
            lc.setText("3: " + AgentList3.get(2).getGens() + " " + AgentList3.get(2).getScore());
            ld.setText("4: " + AgentList3.get(3).getGens() + " " + AgentList3.get(3).getScore());

        }
        else if(e.getSource() == fill){
            agentList.clear();
            agentList.add(AgentList3.get(0));
            agentList.add(AgentList3.get(1));
            agentList.add(AgentList3.get(2));
            agentList.add(AgentList3.get(3));


            for(int i = 0; i <= 3; i++){
                agentList.add(new Agent());
                System.out.println(agentList.get(i).getGens());
            }
            l1.setText("1: " + agentList.get(0).getGens() + " " + agentList.get(0).getScore());
            l2.setText("2: " + agentList.get(1).getGens() + " " + agentList.get(1).getScore());
            l3.setText("3: " + agentList.get(2).getGens() + " " + agentList.get(2).getScore());
            l4.setText("4: " + agentList.get(3).getGens() + " " + agentList.get(3).getScore());
            l5.setText("5: " + agentList.get(4).getGens() + " " + agentList.get(4).getScore());
            l6.setText("6: " + agentList.get(5).getGens() + " " + agentList.get(5).getScore());
            l7.setText("7: " + agentList.get(6).getGens() + " " + agentList.get(6).getScore());
            l8.setText("8: " + agentList.get(7).getGens() + " " + agentList.get(7).getScore());

        }
    }


}
