package com.company;

public class Earth {

    private Human human;
    private Plant tree;

    public Earth(Human human, Plant tree) {
        this.human = human;
        this.tree = tree;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public Plant getTree() {
        return tree;
    }

    public void setTree(Plant tree) {
        this.tree = tree;
    }

    public void Earth(){
        System.out.println("Rotating.......");
    }


}
